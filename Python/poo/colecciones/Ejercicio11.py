'''
 * <p>
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 * para almacenar las parejas de palabras. El programa pedirá una palabra en
 * español y dará la correspondiente traducción en inglés.
 * </p>
 * 
 * <p>
 * Realiza un programa que escoja al azar 5 palabras en español del
 * minidiccionario del ejercicio anterior. El programa irá pidiendo que el
 * usuario teclee la traducción al inglés de cada una de las palabras y
 * comprobará si son correctas. Al final, el programa deberá mostrar cuántas
 * respuestas son válidas y cuántas erróneas.
 * </p>

@author: Francisco Javier Frías Serrano
'''

import random

diccionario={'Casa':'House', 'Gato':'Cat', 'Perro':'Dog','Padre':'Dad','Pajaro':'Bird',
             'Caballo':'Horse','Volar':'Fly','Español':'Spanish','Iglesia':'Church','Escuela':'School'}

listaDiccionario = []
palabrasAleatorias = []

contadorFallos = 0
contadorAciertos = 0
indice = 0

for i in diccionario:
    listaDiccionario.append(i)

random.shuffle(listaDiccionario)

for i in range(5):
    palabrasAleatorias.append(listaDiccionario.pop(0))

for i in palabrasAleatorias:
    respuesta = input("Introduca la traduccion de esta palabra "+ i +"\n")

    if(respuesta == diccionario.get(i)):
        contadorAciertos = contadorAciertos+1
    else:
        contadorFallos = contadorFallos +1
    indice = indice +1

print("Has acertado " + str(contadorAciertos)+ " palabras y has fallado "+str(contadorFallos)+" palabras")