<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Base</title>
</head>
<body>
	<h1>Hello World Customer Base</h1>
	<form action="addcontact" method="POST">
		<label for="name">Nome: </label>
		<input type="text" name="name" id="name" /> <br />
		<label for="email">E-Mail: </label>
		<input type="text" name="email" id="email" /> <br />
		<label for="address">Endereço: </label>
		<input type="text" name="address" id="address" /> <br />
		<label for="date">Data: </label>
		<input type="date" name="date" id="date" /> <br />
		
		<input type="submit" id="salvar" name="salvar" value="Salvar"/>
	</form>
</body>
</html>