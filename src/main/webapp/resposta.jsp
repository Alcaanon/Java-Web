<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 
		String pessoa = (String) request.getAttribute("pessoa");
		int idade = (int) request.getAttribute("idade");
		String categoria = (String) request.getAttribute("categoria");
	%>
	<h1>Olá, <%= pessoa %>.</h1>
	<h2>Você informou que tem <%= idade %> anos.</h2>
	<h2>Você é da categoria <%= categoria%>.</h2>

</body>
</html>