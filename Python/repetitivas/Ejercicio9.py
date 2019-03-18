
'''
Mostrar en pantalla los N primero numero primos. Se pide por teclado la cantidad de numeros primos 
que queremos mostrar.
 
@author: Fco Javier Frias Serrano
'''
import math

while True:
    mostrar = int(input("Introduzca cuantos numeros primos quiere mostrar: "))
    if mostrar > 0:
        break;

print("1 : 2");
mostrados = 1
num = 3
while (mostrados < mostrar):
    primo = True
    for i in range(3, int(math.sqrt(num)), 2):
        if (num % i == 0):
            primo = False
    if(primo):
        mostrados += 1;
        print(mostrados, ":", num)
    num += 2
