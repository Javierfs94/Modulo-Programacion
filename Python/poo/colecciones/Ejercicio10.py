'''
* <p>
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 * para almacenar las parejas de palabras. El programa pedirá una palabra en
 * español y dará la correspondiente traducción en inglés.
 * </p>

@author: Francisco Javier Frías Serrano
'''

diccionario={'Casa':'House', 'Gato':'Cat', 'Perro':'Dog','Padre':'Dad','Pajaro':'Bird',
             'Caballo':'Horse','Volar':'Fly','Español':'Spanish','Iglesia':'Church','Escuela':'School'}

respuesta = (input("Introduzca la palabra que desea traducir: "))

if(respuesta in diccionario):
    print(diccionario.get(respuesta))
else:
    print("La palabra no se encuentra en el diccionario")