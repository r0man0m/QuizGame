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
        <form action="del" method="post">
            <button name="button" value="all" type="submit">Delete all users</button>
        </form>
        <form action="del" method="post">
            <label for="name">User Name</label>
            <input type="text" name="name" id="name" required><br>
            <label for="nickName">User nickname</label>
            <input type="text" name="nickName" id="nickName" required><br>
            <label for="id">User Id</label>
            <input type="number" name="id" id="id" required><br>
            <button name="button" value="one" type="submit">Delete user</button><br>
        </form>
    </div>
    <div>
        <a href="index.jsp">Back to main</a>
    </div>
</body>
</html>
