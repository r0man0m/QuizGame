<%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 21.02.2024
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change password</title>
</head>
<body>
    <header>
        <h1>Change password page</h1>

    </header>
            <div>
                    <form action="change" method="post">
                        <label for="change">Change password</label>
                        <input type="password" name="change" id="change" required pattern="^\d+$" size="5"><br>
                        <button type="submit">Send new password</button>
                    </form>
                </div>

</body>
</html>
