<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.button {
    background-color: #008CBA; /* Green */
    border: none;
    color: white;
    padding: 16px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}

.button1 {
    background-color: white; 
    color: black; 
    border: 2px solid #008CBA;
}

.button2 {
	padding: 5px 20px;
	background-color: #008CBA; 
	color: white; 
	border: 2px solid #008CBA;
}
.button2:hover{
	background-color: white; /* Green */
	color: black;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a class = "button button2" href="/main?action=Logout">Sair</a>
	<br>
	<br>
	<a class = "button button1" href="/main?action=ShowSearchEmployee">Cliente</a>
	<a class = "button button1" href="/main?action=ShowAvailableRooms">Quartos Disponiveis</a>
</body>
</html>