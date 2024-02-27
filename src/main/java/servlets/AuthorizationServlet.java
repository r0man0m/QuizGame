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

@WebServlet("/auth")
public class AuthorizationServlet extends HttpServlet {
    GameService service = GameService.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        String name = req.getParameter("name");
        String nick = req.getParameter("nickName");
        User user = new User(name, nick);
        session.setAttribute("user", service.getUser(service.getUserId(nick)));
        if(!service.checkUser(user) || service.getAllUsers().size() == 0){
            throw new NotUserExistsException("User is not exists");
        }else {
            req.getRequestDispatcher("choiceGame.jsp").forward(req, resp);
        }
    }
}
