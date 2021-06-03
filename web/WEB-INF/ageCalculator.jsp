<%-- 
    Document   : ageCalculator
    Created on : Jun 2, 2021, 3:02:00 PM
    Author     : 671749
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
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age">
            <br>
            <input type="submit" value="Age next birthday">
            <p>${message}</p>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
