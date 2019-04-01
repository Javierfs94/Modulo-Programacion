'''
 * <p>
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre del
 * fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 * </p>

@author: Francisco Javier Frías Serrano
'''

nombreFichero = input("Introduzca el nombre del fichero: ")

lectura = open(nombreFichero + ".txt", "r")
escritura = open(nombreFichero + "_sort.txt", "w")

lista = []

for x in lectura:
    lista.append(x)
    
lista.sort()

for x in lista:
    escritura.writelines(str(x))
    
lectura.close()
escritura.close()

