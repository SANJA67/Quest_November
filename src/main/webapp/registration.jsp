<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="en">
<head>
    <title>Greetings!!!</title>
    <style>
        <%@include file="/static/index.css" %>
    </style>
</head>
<body>
    <div class="start">
        <h1>Introduce youreself</h1>
        <form action="registration" method="post">
            <br>
            <div class="header">
                <label  for="username">Enter your name here</label><br>
                <br>
                <input  type="text" id="username" name="username" value="Leroy Jenkins"><br>
             <br>
            </div>
            <input class="button" type="submit" value="Submit">
        </form>
    </div>
</body>
</html>