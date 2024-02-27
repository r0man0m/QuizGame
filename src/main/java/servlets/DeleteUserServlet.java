package servlets;

import service.GameService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/del")
public class DeleteUserServlet extends HttpServlet {
    private GameService service = GameService.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("one") != null){
            resp.sendRedirect("selectUserPage.jsp");
        }else if (req.getParameter("all") != null){
            delUsers();
            resp.sendRedirect("adminPage.jsp");
        }

    }
    public void delUsers(){
        service.delAllUsers();
    }
}
