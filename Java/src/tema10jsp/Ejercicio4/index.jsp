<%--
4. Realiza una aplicación que calcule la media de tres notas.
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="estilos.css">
<title>Ejercicio 4</title>
</head>
<body>

   <h2>Calcula la media de tres notas</h2>
    <form method="post" action="media.jsp">
      Nota 1: <input type="number" min="0" max="10" step="0.01" name="nota1"></br>
      Nota 2: <input type="number" min="0" max="10" step="0.01" name="nota2"></br>
      Nota 3: <input type="number" min="0" max="10" step="0.01" name="nota3"></br></br>
      <input type="submit" value="Aceptar">
    </form>

</body>
</html>