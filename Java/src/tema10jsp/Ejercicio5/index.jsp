<%--
5. Realiza un conversor de euros a pesetas.
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ejercicio 5</title>
</head>
<body>

	<h2>Formulario de media</h2>
	<form method="post" action="media.jsp">
		Euros: <input type="number" min="0" max="10" step="0.01" name="euros"></br>
		Pesetas: <input type="number" min="0" max="10" step="0.01"
			name="pesetas"></br> Nota 3: <input type="number" min="0" max="10"
			step="0.01" name="nota3"></br> <input type="submit"
			value="Aceptar">
	</form>
	<% 
	double euros = Integer.valueOf(request.getParameter("euros"));; 
	double pesetas; 
	pesetas = Math.round(166.486 *	euros); 
	System.out.println(euros + " euros son " + pesetas + "pesetas");
%>
</body>
</html>