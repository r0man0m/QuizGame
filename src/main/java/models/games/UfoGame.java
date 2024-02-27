package models.games;
import models.GameTypes;
import models.content.UfoContent;
import models.games.abstracts.AbstractGame;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UfoGame extends AbstractGame {
    public UfoGame(UfoContent ufoQuestions, GameTypes types) {
        super(ufoQuestions, types);
    }
    public void action(HttpSession session, HttpServletRequest request, HttpServletResponse response, Integer number) throws ServletException, IOException {
        if(request.getParameter("button").equals("1")) {
            for (int i = number; i < number + 1; i++) {
                session.setAttribute("question", getContent().getQuestion(i));
                if (i == getContent().getQuestions().size() - 1){
                    session.setAttribute("win", getContent().getQuestions().get(i));
                    request.getRequestDispatcher("win.jsp").forward(request,response);
                    break;
                }
                session.setAttribute("answer1", getContent().getAnswer(i).get(0));
                session.setAttribute("answer2", getContent().getAnswer(i).get(1));
                request.getRequestDispatcher("game.jsp").forward(request, response);
            }
        }else if (request.getParameter("button").equals("2")){
            session.setAttribute("loose", getContent().getDefeatMessages().get(number - 1));
            request.getRequestDispatcher("loose.jsp").forward(request, response);
        }

    }
}
