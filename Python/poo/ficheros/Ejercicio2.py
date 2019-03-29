'''
 * <p>
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * </p>

@author: Francisco Javier Frías Serrano
'''
ruta = "C:\\Users\\d18frsej2\\eclipse-workspace\\PGNPython\\poo\\ficheros\\primos.txt";

#Abrimos fichero
fichero = open(ruta,"r")
#Leemos su contenido
print(fichero.read())
#Cierre del fichero
fichero.close()