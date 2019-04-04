'''


@author: Francisco Javier Frías Serrano
'''


def escritura():
  cadena1 = "Esto es "
  cadena2 = "una prueba"
  ficheroEscritura = open("prueba.txt", "w")
  ficheroEscritura.write(cadena1 + cadena2)
  ficheroEscritura.close()

  
def lectura():
  ficheroLectura = open("prueba.txt", "r")
  cadena2 = ficheroLectura.read()
  print(cadena2)
  ficheroLectura.close()

  
if __name__ == "__main__":
  escritura()
  lectura()
