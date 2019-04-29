<%--
6. Realiza un conversor de pesetas a euros.
 --%>
 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ejercicio 6</title>
</head>
<body>

    double pesetas = 600;
     double euros;
    
     euros = Math.round(pesetas / 166.386);
    
     System.out.println(pesetas + " pesetas son " + euros + " euros");

	<%
	  System.out.println("Francisco Javier Frías Serrano");
	  System.out.println("http://localhost:8085/PGNJSP/Ejercicio1.jsp");
	%>
</body>
</html>