<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		h2{
		text-align: center;
		}
	
		.window {
		position: relative;
		left:600px;
		border-radius: 5px;
		border: 2px solid #008CBA;
		width:300px;
		}
	
		.button {
		border: none;
	    color: white;
	    padding: 16px 32px;
	    text-align: center;
	    text-decoration: none;
	    display: inline-block;
	    font-size: 16px;
	    margin: 4px 2px;
	    -webkit-transition-duration: 0.4s; /* Safari */
	    transition-duration: 0.4s;
	    cursor: pointer;
		}
		.button1{
		background-color: #008CBA; 
	    color: white; 
	    border: 2px solid #008CBA;
	    
	    position: relative;
  		left: 93px;
		}
		
		.button1:hover {
	    background-color: white; /* Green */
	    color: black;
		}
		p{
		text-align:center;
		}
	</style>
</head>
	<form action="/main" method="post" class="window">
		<h2>Sign in</h2>
		<p>Login:<input type="text" placeholder="Username or email" name="login"></p>
		<p>Senha:<input type="password" placeholder="password" name="password"></p>
		<br>
		<input type="hidden" name="action" value="Login">
		<button class="button button1" type="submit"> Login</button>
	</form>
</body>
</html>