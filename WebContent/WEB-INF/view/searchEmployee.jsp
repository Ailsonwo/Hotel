<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/main" method="get">
		Insira o CPF do Cliente:<input type="text" name="cpf">
		<input type="hidden" name="action" value="ClientValidate">
		<input type="submit">
	</form>
</body>
</html>