package servlets;

import interfaces.Games;
import models.Game;
import models.GameTypes;
import models.User;
import service.GameConstructor;
import service.GameService;
import service.TypeConstructor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/regGame")
public class RegistrationGameServlet extends HttpServlet {
    GameService service = GameService.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer gameId = service.getGameCounter();
        String userNickName = req.getParameter("nickName");
        Integer userId = service.getUserId(userNickName);
        service.setGameCounter(service.getGameCounter() + 1);
        TypeConstructor typeConstructor = new TypeConstructor();
        GameTypes type = typeConstructor.getType(req.getParameter("game"));
        GameConstructor constructor = new GameConstructor();
        Games game = constructor.getGame(type);
        game.setUser(service.getUser(userId));
        game.setId(gameId);
        service.setGame(game, gameId);
        PrintWriter out = resp.getWriter();
        try {
            out.println("<html>");
            out.println(service.getGame(gameId));
            out.println("<a href=\"/index.jsp\">Back to main</a>\n");
            out.println("</html>");
        }finally {
            out.close();
        }


    }
}
