<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Hello World!</h1>

	<form method="post" action="AtividadeServlet">
		<input type="text" name="nome"
		placeholder="Informe o nome" required/>
		<input type="number" name="idade"
		placeholder="Informe a idade" required/>
		<input type="submit" value="Ok"/>
	</form>
	
</body>
</html>