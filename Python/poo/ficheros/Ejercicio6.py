'''
 * <p>
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * </p>

@author: Francisco Javier Frías Serrano
'''

contador = 0

nombreFichero = input("Introduzca el nombre del fichero que desea contar las palabras: ")
palabraAContar = input("¿Que palabra desea contar?: ")

lectura = open(nombreFichero + ".txt", "r")

palabras = lectura.read()

# convierte la variable palabras en una lista y le quito los espacios, haciendo que cada palabra sea un elemento de la lista
lista = palabras.split()

lectura.close()

for x in lista:
    """
    Recorremos la lista y comrpeuba si la palabra está en la lista.
    Si está en la lista, suma 1 al contador.
    """
    if(x == palabraAContar):
        contador = contador + 1

print("La palabra " + str(palabraAContar) + " se encuentra " + str(contador) + " veces en el fichero " + str(nombreFichero)+".txt")
