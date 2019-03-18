'''
Haz un programa en Java y Python que calcule el combinatorio de dos números.
Si hay un error en la introducción debe indicarlos.

@author: Fco Javier Frias Serrano
'''
totalM = 1
totalN = 1
totalA = 1

# Pedimos los numeros m y n al usuario
print("Vamos a calcular el combinatorio de dos números")
while True:
            print("Introduzca el número m: ")
            m = int(input())
            print("Introduzca el número n: ")
            n = int(input())
            if (m > n):
                break;
            if (m < n):
                print("n no puede ser mayor que m")
                print("Vuelva a introducirlos")

# Factorial de m
for i in range(1, m + 1):
            totalM *= i;
# Factorial de n
for i in range(1, n + 1): 
            totalN *= i;
a = m - n;  # Una de las partes de la formula, de la parte del divisor
# Factorial de a
for i in range(1, a + 1): 
            totalA *= i;
# Calculamos el resultado de la formula
resultadoCombinatorio = totalM / (totalN * (totalA))
# Mostramos el resultado
print("total de m = " , totalM)
print("total de n = " , totalN)
print("Resultado = " , resultadoCombinatorio)
