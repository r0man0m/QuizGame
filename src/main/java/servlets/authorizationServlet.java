package servlets;

import exceptions.notFindUserException;
import models.User;
import service.GameService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/auth")
public class authorizationServlet extends HttpServlet {
    GameService service = GameService.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/first.jsp");
        List<User>users = service.getAllUsers();
        String nick = req.getParameter("nickName");
        for (User user: users){
            if(!user.getNickName().equals(nick)){
                throw new notFindUserException("User is not exists!");
            }else {
                dispatcher.forward(req,resp);
            }
        }
    }
}
