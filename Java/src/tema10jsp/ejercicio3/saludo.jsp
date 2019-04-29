<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado ejercicio 3</title>
<link rel="stylesheet" type="text/css" href="../estilos.css">
</head>
<body>

	<%
	  request.setCharacterEncoding("UTF-8");
	%>
	Hola
	<%
	  String cadena = request.getParameter("nombre");
	  cadena = Character.toUpperCase(cadena.charAt(0)) + cadena.substring(1, cadena.length());

	  out.println(cadena);
	%>
	<br />
	<a href="index.jsp">Volver</a>

</body>
</html>