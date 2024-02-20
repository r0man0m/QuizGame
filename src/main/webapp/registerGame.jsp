<%@ page import="models.GameTypes" %><%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 19.02.2024
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration new game</title>
</head>
<body>
  <header>
    <div>
      <h1>Registration new game</h1>
    </div>
  </header>

        <h2>
      Choice new game</h2>
    <form action="/regGame" method="post">
      <input type="radio" id="ufo" name="game" value=<%=GameTypes.UFO.getTitle()%> checked >
      <label for="ufo">Ufo quiz</label><br>
      <input type="radio" id="another" name="game" value=<%=GameTypes.ANOTHER.getTitle()%>>
      <label for="another">Another game</label><br>
      <input type="radio" id="more" name="game" value=<%=GameTypes.MORE.getTitle()%>>
      <label for="more">More game</label><br>
      <input type="text" name="nickName" id="nickName">
      <label for="nickName">User nickname</label>
      <button type="submit">Submit</button>
    </form>
  <div>
    <a href="/index.jsp">Back to main</a>
  </div>


</body>
</html>
