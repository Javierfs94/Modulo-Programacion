'''
 * <p>
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * </p>

@author: Francisco Javier Frías Serrano
'''
import math
# main
ruta = "C:\\Users\\d18frsej2\\eclipse-workspace\\PGNPython\\poo\\ficheros\\primos.txt";

fichero = open(ruta, "w") #creamos el fichero en modo escritura

primos = [1, 2] #se agnaden los 2 primeros elementos de la lista

num = 3 #numero con el que se realizara la comprobacion si es primo o no
while num < 501:
    es_primo = True
    divisor = 3
    while divisor <= math.sqrt(num) and es_primo: #comprobamos que el numero sea primo o no
        if num % divisor == 0:
            es_primo = False
        divisor += 2
    if es_primo:
        primos.append(num) #si es primo se agnade a la lista
    num += 2 #aumentamos de dos en dos ya que los pares no son primos

fichero.writelines(str(primos)) #escritura de la lista sobre el fichero
fichero.close()