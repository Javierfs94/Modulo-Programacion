import math
'''
*    Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un
*    triángulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
*    •Si se cumple Pitágoras entonces es triángulo rectángulo
*    •Si sólo dos lados del triángulo son iguales entonces es isósceles.
*    •Si los 3 lados son iguales entonces es equilátero.
*    •Si no se cumple ninguna de las condiciones anteriores, es escaleno.
@author: Fco Javier Frias Serrano
'''
    
print("Valor del lado a");
a = int(input())
print("Valor del lado b");
b = int(input())
print("Valor del lado c");
c = int(input())
    
if a ** 2 == b ** 2 + c ** 2:
    print("Triangulo rectangulo")
elif((a == b) or (a == c)or(b == c)):
    print("Triangulo isosceles")    
elif((a == b) and (a == c) and (b == c)):
    print("Triangulo equilatero");       
else:
    print("Triangulo escaleno") 
    
    
