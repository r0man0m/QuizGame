<%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 27.02.2024
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loose Page</title>
</head>
<body>
    <div>
        <h1><%=session.getAttribute("loose")%></h1>
    </div>
    <div>
        <button onclick="window.location='choiceGame.jsp'">Play again?</button>
    </div>
    <div>
        <a href="index.jsp">Back to main</a>
    </div>


</body>
</html>