'''
Un vendedor recibe un sueldo base mas un 10% extra por comisi�n de sus ventas,�el vendedor desea saber cuanto dinero obtendr� por concepto de comisiones por�las tres ventas 
que realiza en el mes y el total que recibir�  en el mes tomando�en cuenta su sueldo base y comisiones.
 
@author: Fco Javier Frias Serrano
'''
print("Introduzca el sueldo base del vendedor")
sueldo = int(input())
print("Introduzca la ganancia de la primera venta");
venta1 = int(input())
print("Introduzca la ganancia de la segunda venta");
venta2 = int(input())
print("Introduzca la ganancia de la tercera venta");
venta3 = int(input())

comision = (venta1 * 0.1) + (venta2 * 0.1) + (venta3 * 0.1);
total = sueldo + comision;

print("El sueldo base del vendedor es: " , sueldo , " euros");
print("La comisi�n del vendedor es: " , comision , " euros");
print("El total que recibir� el vendedor es: " , total , " euros");