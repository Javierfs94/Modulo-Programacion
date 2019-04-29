<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado de la media</title>
</head>
<body>
	<%
	  request.setCharacterEncoding("UTF-8");
	%>
	<%
	  double nota1 = Double.valueOf(request.getParameter("nota1"));
	  double nota2 = Double.valueOf(request.getParameter("nota2"));
	  double nota3 = Double.valueOf(request.getParameter("nota3"));
	  double media = (nota1 + nota2 + nota3) / 3;
	  // 	  DecimalFormat dosDecimales = new DecimalFormat("0.00");
	  // 	  out.println("La media de las 3 notas es " + dosDecimales.format(media));
	  out.println(media);
	%>

</body>
</html>