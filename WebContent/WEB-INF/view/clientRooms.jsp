<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="/main?action=ShowAvailableRoomsToBook">Reservar quarto</a><br><br>

	Lista de reservas do cliente ${currentClient.name }:
	<ul>
		<c:forEach items="${currentClient.clientRooms }" var="room">
		<li>Quarto ${room.number } reservado</li>
		</c:forEach>
	</ul>
</body>
</html>