<%@ page import="service.PasswordSaver" %><%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 21.02.2024
  Time: 0:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin login page</title>
</head>
<body>
    <div>
        <header>
            <h2>Admin login page</h2>
        </header>
    </div>
    <div>
        <form action="passw" method="post">
            <label for="pass">Admin password(default 1)</label>
            <input type="password" name="pass" id="pass" required pattern="^\d+$" size="5">
            <button type="submit">Send password</button>
        </form>
    </div>
    <div>
        <button type="button" onclick="window.location='/admin'">Change password</button>
    </div>
    <div>
        <a href="index.jsp">Back to main</a>
    </div>

</body>
</html>
