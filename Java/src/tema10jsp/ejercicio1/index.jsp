<%--
1. Crea una aplicación web en Java que muestre tu
		nombre y tus datos personales por pantalla. La página principal debe
		ser un archivo con la extensión jsp. Comprueba que se lanzan bien el
		servidor y el navegador web. Observa los mensajes que da el servidor.
		Fíjate en la dirección que aparece en la barra de direcciones del
		navegador.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ejercicio 1</title>
</head>
<body>
	<h1>Datos</h1>
	<p>
		<b>Nombre:</b> Francisco Javier Frías Serrano
	</p>
	<p>
		<b>Lugar de nacimiento:</b> Córdoba, Andalucía
	</p>
	<p>
		<b>Nacionalidad:</b> español
	</p>
	<p>
		<b>Fecha de nacimiento:</b> 13/03/1994
	</p>
	<p>
		<img src="..\imagenes\javierfs.jpg" alt="Javier Frías Serrano"
			style="width: 350px; height: 350px;">
	</p>

</body>
</html>