<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Media</title>
<link rel="stylesheet" type="text/css" href="estilos.css">
</head>
<body>

	<%
	  double n1 = Double.valueOf(request.getParameter("nota1"));
	  double n2 = Double.valueOf(request.getParameter("nota2"));
	  double n3 = Double.valueOf(request.getParameter("nota3"));
	  double media = (n1 + n2 + n3) / 3;
	  DecimalFormat dosDecimales = new DecimalFormat("0.00");
	  out.println("La media es " + dosDecimales.format(media));
	%>
	<br />
	<a href="index.jsp">Volver</a>
	
</body>
</html>