<%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 20.02.2024
  Time: 1:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization page</title>
</head>
<body>
    <header>
        <h1>Authorization page</h1>
    </header>
    <div>
        <form action="/auth" method="post">
            <input type="text" name="nickName" id="nickName">
            <label for="NickName">User nickname</label>
           <button type="submit">Submit</button>
        </form>
    </div>

</body>
</html>
