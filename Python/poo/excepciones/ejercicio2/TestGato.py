'''
Programa que prueba la clase GatoSimple

@author: Francisco Javier Frías Serrano
'''
from poo.excepciones.ejercicio2.Gato import Gato

garfield = Gato("macho")
tom = Gato("macho")
lisa = Gato("hembra")

try:
    garfield.apareaCon(lisa)
    garfield.apareaCon(tom)
except:
    print()