'''
Escribir un programa que imprima todos los numeros pares entre dos numeros que se le pidan al usuario.
 
@author: Fco Javier Frias Serrano
'''
    
numInicio = int(input("Introduzca el rango inicial: "))
numFin = int(input("Introduzca el rango final: "))
   
for i in range(numInicio, numFin + 1):
    if(i % 2 == 0):
        print(i)
