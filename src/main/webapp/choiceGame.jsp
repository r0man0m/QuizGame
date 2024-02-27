<%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 23.02.2024
  Time: 1:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Choice game Page</title>
</head>
<body>
    <div>
        <header>
            <h1>Choice the game</h1>
        </header>
    </div>
    <div>
        <form action="setGame" method="post">
            <button name="name"  value="ufo" onclick="" type="submit">Ufo game</button>
            <button name="name" value="another" onclick="" type="submit">Another game</button>
            <button name="name" value="more" onclick="" type="submit">More game</button>
        </form>
    </div>
    <div>
        <a href="index.jsp">Back to main</a>
    </div>

</body>
</html>
