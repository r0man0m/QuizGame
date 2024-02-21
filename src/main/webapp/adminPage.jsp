<%@ page import="service.GameService" %>
<%@ page import="java.util.List" %>
<%@ page import="models.User" %><%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 20.02.2024
  Time: 0:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>

</head>
<body>
    <header>
        <h1>Admin page</h1>
    </header>
    <h2>User list</h2>
    <div>
        <%GameService service = GameService.getInstance();
            List<User> users = service.getAllUsers();
        %>

        <ul>
            <%for (User user: users){%>
                <li>User id <%=user.getId()%></li>
                <li>User name <%=user.getName()%></li>
                <li>User nickname <%=user.getNickName()%></li>
            <br>
            <%}%>
        </ul>

    </div>
    <div>
        <a href="index.jsp">Back to main</a>
    </div>
</body>
</html>
