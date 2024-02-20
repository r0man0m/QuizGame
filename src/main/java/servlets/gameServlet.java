package servlets;

import service.GameService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/game")
public class gameServlet extends HttpServlet {
    GameService service = GameService.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        service.getGame(0);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/first.jsp");
        dispatcher.forward(req,resp);
    }
}
