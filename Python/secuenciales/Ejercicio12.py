import math

'''
Pide al usuario dos pares de n�meros x1,y2 y x2,y2, que representen dos puntos�en el plano. Calcula y muestra la distancia entre ellos. 
Formula: Raiz Cuadrada de (x2 - x1)^2 + (y2 - y1)^2

@author: Fco Javier Frias Serrano
'''

print("Dime las coordenadas del primer punto: ")
x1 = int(input())
y1 = int(input())

print("Dime las coordenadas del segundo punto: ")
x2 = int(input())
y2 = int(input())

distancia = math.sqrt(((x2 - x1) ** 2 + (y2 - y1) ** 2))

print("La distancia es: " , distancia)
