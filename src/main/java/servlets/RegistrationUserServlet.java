package servlets;

import exceptions.NotUserExistsException;
import models.User;
import service.GameService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/regUser")
public class RegistrationUserServlet extends HttpServlet {
    GameService gameService = GameService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        session.setAttribute("added", null);
        resp.sendRedirect("/registerUser.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer userId = gameService.getUserCounter();
        HttpSession session = req.getSession(true);
        User user = new User(req.getParameter("name"), req.getParameter("nick"), userId);
        if(!gameService.checkUser(user) || gameService.getAllUsers().size() == 0){
            gameService.setUser(user, userId);
            gameService.setUserCounter(userId + 1);
            String added = null;
            session.setAttribute("added", "User added!");
        }else {
            throw new NotUserExistsException("Such a user exists!");
        }
        resp.sendRedirect("/registerUser.jsp");
    }
}
