<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 17.02.2024
  Time: 0:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>register page</title>
</head>
<body>

    <header>
        <h1>Register page</h1>
    </header>
    <div>
        <h2>Add new user</h2>
        <form action="regUser" method="post">
            <label for="name">Name: </label>
            <input type="text" name="name" id="name" required>
            <br>
            <label for="nick">Nickname</label>
            <input type="text" name="nick" id="nick" required>
            <br>

            <button type="submit">Submit</button>
        </form>
    </div>
        <%if(session.getAttribute("added")!=null){%>
        <h3><%= session.getAttribute("added").toString()%></h3>
        <button type="reset" onclick="window.location='regUser'">OK</button>
        <%}%>
    <div><br>
        <a href="/index.jsp">Back to main</a>
    </div>
</body>
</html>
