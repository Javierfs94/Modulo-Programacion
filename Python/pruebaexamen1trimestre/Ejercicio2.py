'''
Haz un programa en Java y Python que calcule el elemento N (se pide al usuario) de la serie de Fibonacci

@author: Fco Javier Frias Serrano
'''

num1 = 0
num2 = 1

# Peticion al usuario de la posicion de Fibonacci
print("Introduzca el elemento de la serie Fibonacci a sacar: ")
elementoN = int(input())

print(num1 , "  ")
print(num2 , "  ")

for i in range(0, elementoN - 2):
    num2 += num1
    num1 = num2 - num1
    print(num2 , "  ")
print("El numero de la posicion ", elementoN, " es ", num2)
