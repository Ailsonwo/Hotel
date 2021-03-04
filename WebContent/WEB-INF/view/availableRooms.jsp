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
	Lista de quartos:
	<ul>
		<c:forEach items="${rooms }" var="room">
		<li>Quarto ${room.number } 
		<c:choose>
			<c:when test="${room.available }">
				Disponivel
			</c:when> 
			<c:otherwise>
				Indisponivel
			</c:otherwise>
		</c:choose>
		</li>
		</c:forEach>
	</ul>
</body>
</html>