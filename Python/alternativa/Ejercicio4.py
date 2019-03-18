'''
Crea un programa que pida al usuario dos números y muestre su división si el segundo no es cero, o un mensaje de aviso en caso contrario.

@author: Fco Javier Frias Serrano
'''

print("Introduzca el primer numero")
num1 = int(input())
print ("Introduzca el segundo numero")
num2 = int(input())
    
if (num1 % num2 != 0):
    print("El resultado de la division no ha sido 0")
else:
    print("El resultado de la division ha sido 0")
     
