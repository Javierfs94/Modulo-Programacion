'''
 * <p>
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * </p>

@author: Francisco Javier Frías Serrano
'''

fichero = open("primos.dat","r") #Abrimos fichero
print(fichero.read()) #Leemos su contenido
fichero.close() #Cierre del fichero