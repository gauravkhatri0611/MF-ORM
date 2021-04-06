<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>    
<html>
<body style="background-color:pink;">
<font color ="black";>
<center><h2>Hello! welcome ${msg }:</h2>
<h2>Enter Details for next page</h2>
<form action="login" method="get">
<input type="text" name="userId" placeholder="enter user name">
<input type="text" name="pwd" placeholder="enter user pwd">
<button>login</button>
</form></font></center>
</body>
</html>