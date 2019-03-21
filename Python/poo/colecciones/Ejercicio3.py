'''
 * <p>
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y
 * almacenados en un objeto de la clase ArrayList.
 * </p>

@author: Francisco Javier Frías Serrano
'''

lista = []

for i in range(10):
    lista.append(int(input("Introduzca un número a la lista: ")))

print("Lista sin ordenar: "+str(lista))
lista.sort()
print("Lista ordenada: "+str( lista))
