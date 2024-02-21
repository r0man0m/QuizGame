<%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 21.02.2024
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation page</title>
</head>
<body>
    <header>
        <h1>Confirm password</h1>
    </header>
    <div>
        <form action="admin" method="post">
            <label>Old password</label>
            <input type="password" name="pass" id="old" required pattern="^\d+$" size="5"><br>
            <button type="submit">Confirm password</button>
        </form>
    </div>

</body>
</html>
