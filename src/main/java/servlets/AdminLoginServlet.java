package servlets;

import exceptions.WrongPasswordException;
import service.PasswordSaver;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/passw")
public class AdminLoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      PasswordSaver passwordSaver = PasswordSaver.getInstance();
        RequestDispatcher dispatcher = req.getRequestDispatcher("adminPage.jsp");
      Integer pass = Integer.valueOf(req.getParameter("pass"));
      if(pass == passwordSaver.getPassword()){
          dispatcher.forward(req,resp);
      }else {
          throw new WrongPasswordException("Wrong password!");
      }
    }
}
