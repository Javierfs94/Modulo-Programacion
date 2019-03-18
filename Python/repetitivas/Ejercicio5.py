'''
Escribe un programa que pida el limite inferior y superior de un intervalo. Si el l�mite inferior es mayor que el superior 
lo tiene que volver a pedir. A continuacion se van introduciendo numeros hasta que introduzcamos el 0. 
Cuando termine el programa dara las siguientes informaciones:
    -  La suma de los numeros que estan dentro del intervalo (intervalo abierto).
    -  Cuantos numeros estan fuera del intervalo.
    - Informa si hemos introducido algun numero igual a los limites del intervalo.
 
@author: Fco Javier Frias Serrano
'''

# Variables
entreLimites = 0;
contadorFueraLimites = 0;
contadorIgualALimites = 0;
       
# Bucle para pedir limites correctos
while True:
    limiteInferior = int(input("Introduzca el limite inferior: "))
    limiteSuperior = int(input("Introduzca el limite superior: "))
    if(limiteInferior < limiteSuperior):
        break;
    
# Bucle para introducir numeros hasta 0
while True:
    numIntroducido = int(input("Introduzca un numero: "))
    if(numIntroducido > limiteInferior and numIntroducido < limiteSuperior):
        entreLimites += numIntroducido
    elif (numIntroducido < limiteInferior or numIntroducido > limiteSuperior):
        contadorFueraLimites += 1
    elif (numIntroducido == limiteInferior or numIntroducido == limiteSuperior):
        contadorIgualALimites += 1
    if(numIntroducido == 0):
        break;
    
    # Mostrando los resultados pedidos
print("Suma de los numeros que estan dentro del intervalo (intervalo abierto): " , entreLimites);
print("Numeros que estan fuera del intervalo: " , contadorFueraLimites);
print("Numeros introducidos igual a los limites del intervalo: " , contadorIgualALimites);
