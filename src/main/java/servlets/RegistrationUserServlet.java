package servlets;

import models.User;
import service.GameService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/regUser")
public class RegistrationUserServlet extends HttpServlet {
    GameService gameService = GameService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/registerUser.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer userId = gameService.getUserCounter();
        gameService.setUserCounter(userId + 1);
        User user = new User(req.getParameter("name"), req.getParameter("nick"), userId);
        gameService.setUser(user, userId);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/registerGame.jsp");
        dispatcher.forward(req,resp);
    }
}
