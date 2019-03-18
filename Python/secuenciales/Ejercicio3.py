import math

'''
Dados los catetos de un tri�ngulo rect�ngulo, calcular su hipotenusa.

@author: Fco Javier Frias Serrano
'''

# Formula: a^2 + b^2 = c^2
print("Introduzca el cateto 1:")
a = int(input())
print("Introduzca el cateto 2:")
b = int(input())

hipotenusa = math.sqrt(a**2+b**2)

print("La hipotenusa = " , hipotenusa)