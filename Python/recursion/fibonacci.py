'''
Ejemplo de recursión con Fibonacci


@author: Fco Javier Frias Serrano
'''

def fib(n):
    if n==1 or n==2:
        return 1
    else:
        return fib(n-1)+fib(n-2)
    
n = int(input("Dame un numero y te doy su fibonacci: "))
print(fib(n))