<%-- 
    Document   : agecalculator
    Created on : 27-Jan-2021, 3:15:51 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age" value="${yourAge}">
            <br>
            <input type="submit" value="Age next birthday">
            <p>${message}</p>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
