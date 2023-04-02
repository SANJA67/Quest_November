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
    <h1>Solve the example</h1>
    <form action="game" method="get">
        <br>
        <div class="header">
            <label  class="expression">${requestScope.expression.expression}</label><br>
            <label>Enter your answer</label>

            <input  type="text" id="result" name="result" > <br>
            <br>
        </div>
        <input class="button" type="submit" value="Submit">
        ${r}
    </form>
</div>
</body>
</html>
