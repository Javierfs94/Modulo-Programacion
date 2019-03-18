'''
Ejemplo de recursión con Factorial

@author: Fco Javier Frias Serrano
'''


def factorial(n):
    if n == 1:
        return 1
    else:
        return n * factorial(n - 1)



n = int(input("Dame un numero y te doy su factorial: "))
print(factorial(n))