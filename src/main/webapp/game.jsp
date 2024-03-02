<%@ page import="models.User" %>
<%@ page import="service.GameService" %><%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 25.02.2024
  Time: 1:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<link rel="stylesheet" href="styles/w3.css">
<link rel="stylesheet" href="styles/mystyle.css">
<html>
<head>
    <title>Game Page</title>
</head>
<body class="w3-light-grey">
<div class="game">
    <div class="w3-container w3-blue-grey w3-opacity-min w3-center w3-animate-zoom">
        <h2><%=session.getAttribute("question")%></h2>
        <div class="w3-selection w3-light-grey">
            <form class="w3-light-grey w3-padding w3-center" action="game" method="post">
                <button class="w3-btn w3-border-aqua w3-round-large w3-margin-bottom w3-text-blue" type="submit" name="button" value="1"><h3><%=session.getAttribute("answer1")%></h3></button>
                <button class="w3-btn w3-border-aqua w3-round-large w3-margin-bottom w3-text-blue" type="submit" name="button" value="2"><h3><%=session.getAttribute("answer2")%></h3></button>
            </form>
        </div>
    </div>
</div>


<div class="w3-container w3-blue-gray w3-opacity-min w3-left-align w3-padding">
    <button class="w3-btn w3-blue w3-round-large w3-margin-bottom" onclick="window.location='game'">Reset</button>
</div>
<div class="w3-container w3-grey w3-opacity-min w3-right-align w3-padding">
    <a href="index.jsp">Back to main</a>
</div>
<div class="w3-container w3-light-gray w3-opacity w3-left-align-align w3-padding">
    <%User user = (User)session.getAttribute("user");%>
    <%GameService service = (GameService) session.getAttribute("service");%>
        <aside>
        <h3>Statistics</h3>
        <p>Ip adress: <%=request.getRemoteAddr()%></p>
        <p>Nickname:<%=user.getNickName()%></p>
        <p>Game counter:<%=user.getGameCount()%> </p>
    </aside>
</div>

</body>
</html>
