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
	<h1>Ol�, <%= pessoa %>.</h1>
	<h2>Voc� informou que tem <%= idade %> anos.</h2>
	<h2>Voc� � da categoria <%= categoria%>.</h2>

</body>
</html>