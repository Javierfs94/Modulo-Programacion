'''
Realizar un algoritmo que pida numeros (se pedira por teclado la cantidad de  numeros a introducir). 
El programa debe informar de cuantos numeros introducidos son mayores que 0, menores que 0 e iguales a 0.
 
@author: Fco Javier Frias Serrano
'''

#Variables
mayor = 0
menor = 0
igual = 0
    
# Pedimos el total de numeros a introducir por teclado al usuario
numeros = int(input("Introduzca cuantos numeros va ha introducir: "))
    
for i in range(0, numeros):
    numero = int(input("Introduzca un numero: "))
    if(numero > 0):
        mayor += 1
    elif(numero < 0):
        menor += 1
    else:
        igual += 1  
    
print("Hay " , mayor , " numeros mayores que 0 en total");
print("Hay " , menor , " numeros menores que 0 en total");
print("Hay " , igual , " numeros iguales que 0 en total");
