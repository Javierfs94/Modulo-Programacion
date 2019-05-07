<%--
3. Escribe una aplicación que pida tu nombre. A
		continuación mostrará “Hola” seguido del nombre introducido. El nombre
		se deberá recoger mediante un formulario.
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="estilos.css">
<title>Ejercicio 3</title>
</head>
<body>

	<h2>Formulario de saludo</h2>
	<form method="post" action="saludo.jsp">
		<p>
			Introduzca su nombre: <input type="text" name="nombre">
		</p>
		<p>
			<input type="submit" value="OK">
		</p>
	</form>

</body>
</html>