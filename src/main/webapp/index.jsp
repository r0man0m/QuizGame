<html>
<head>
    <title>Quiz game</title>
<%@page contentType="text/html; ISO-8859-1" language="java" %>
</head>
    <header>
        <h1>Quiz game</h1>
    </header>
<body>
    <div>
        <button name="auth" type="submit" onclick="window.location = '/authorizationPage.jsp'">Authorization</button>
        <button name="regUser" type="submit" onclick="window.location='/regUser'">Registration</button>
        <button name="admin" type="submit" onclick="window.location='/adminLoginPage.jsp'">Admin page</button>
    </div>
</body>
</html>
