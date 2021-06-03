<%-- 
    Document   : arithmeticCalculator
    Created on : Jun 2, 2021, 3:02:23 PM
    Author     : 671749
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="firstNum" placeholder="${num1}"><br>
            <label>Second:</label>
            <input type="text" name="secondNum" placeholder="${num2}"><br>
            <input type="submit" name="+" value="+">
            <input type="submit" name="-" value="-">
            <input type="submit" name="*" value="*">
            <input type="submit" name="%" value="%">
            
            <p>Result: ${message}</p>
            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
