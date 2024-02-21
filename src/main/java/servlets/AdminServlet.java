package servlets;

import exceptions.WrongPasswordException;
import service.GameService;
import service.PasswordSaver;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("ConfirmationPage.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PasswordSaver passwordSaver = PasswordSaver.getInstance();
        RequestDispatcher dispatcher = req.getRequestDispatcher("changePasswordPage.jsp");
        Integer pass = Integer.valueOf(req.getParameter("pass"));
        if(pass == passwordSaver.getPassword()){
            dispatcher.forward(req,resp);
        }else {
            throw new WrongPasswordException("Wrong password!");
        }
    }
}