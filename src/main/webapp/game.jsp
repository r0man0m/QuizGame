<%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 25.02.2024
  Time: 1:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Game Page</title>
</head>
<body>

<div>
    <h2><%=session.getAttribute("question")%></h2>
    <div>
        <form action="game" method="post">
            <button type="submit" name="button" value="1"><%=session.getAttribute("answer1")%></button>
            <button type="submit" name="button" value="2"><%=session.getAttribute("answer2")%></button>
        </form>
    </div>
</div>
<div>
    <button onclick="window.location='game'">Reset</button>
</div>
<div>
    <a href="index.jsp">Back to main</a>
</div>

</body>
</html>