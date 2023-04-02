<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
    <style>
        <%@include file="/static/index.css" %>
    </style>
</head>
    <body>
        <div class="start">
            <h1>Hello ${requestScope.user.name}</h1>
            <div class="buttons">
                <a href="/game" class="gradient-button" type="submit">Start</a>
                <a href="/goodbye.jsp" class="gradient-button" type="submit">Finish</a>
            </div>
        </div>
    </body>
</html>
