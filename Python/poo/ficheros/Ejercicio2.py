'''
 * <p>
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * </p>

@author: Francisco Javier Frías Serrano
'''

fichero = open("primos.dat", "r")
print(fichero.read())
fichero.close()
