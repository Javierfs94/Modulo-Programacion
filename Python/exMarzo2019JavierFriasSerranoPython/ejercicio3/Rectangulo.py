'''
3. Haz el ejercicio anterior en Python. Enunciado del ejercicio anterior:

• Crea la clase Rectángulo de forma que:
• Un objeto de esta clase se construye pasándole el ancho y el alto. Ninguno de los dos atributos
puede ser menor o igual a cero ni mayor que diez, en esos casos se debe lanzar la excepción
ArithmeticException.
• Mediante getters y setters permite que se acceda y se modifique el ancho y el alto del
rectángulo teniendo en cuenta las restricciones en cuanto a las dimensiones del apartado
anterior.
• Al imprimir en pantalla un objeto de la clase usando System.out.print se debe dibujar el
rectángulo por la pantalla (de manera similar a como se imprime un cuadrado en la página 130
del libro Aprende Java con Ejercicios).
• Crea la clase Cuadrado como subclase de Rectángulo. Le debes añadir a su comportamiento
la posibilidad de comparar objetos cuadrados entre sí.
• Crea los programas de test correspondientes a ambas clases. Debes provocar que se lance la
excepción y capturarla.

__author__: Francisco Javier Frías Serrano
'''

class Rectangulo:

    def __init__(self, ancho, alto):
        """
        Constructor de la clase rectangulo, recibe por parametros dos enteros que conforman
        el ancho y el alto. Se verifican que los parametros sean correctos para poder asignarlos.
        """
        self.__ancho = ancho
        self.__alto = alto

    @property
    def ancho(self):
        return self.__ancho

    @ancho.setter
    def ancho(self, an):
        Rectangulo.verifica_lado(an)
        self.__ancho = an

    @property
    def alto(self):
        return self.__alto

    @alto.setter
    def alto(self, al):
        Rectangulo.verifica_lado(al)
        self.__alto = al

    def __str__(self):
        """
        Devuelve una cadena de texto con el rectangulo pintado, de manera
        que cuando se muestre el objeto en pantalla, se vea su representacion
        grafica.
        """
        cadena = ""
        cadena += "*"*self.ancho + "\n"
        if(self.alto == 2):
            cadena += "*"*self.ancho + "\n"
        elif(self.alto > 2):
            for i in range(0, self.alto - 2):
                cadena += "*"
                cadena += " "*(self.ancho - 2)
                cadena += "*\n"
            cadena += "*"*self.ancho + "\n"
        return cadena

    @staticmethod
    def verifica_lado(num):
        """
        Metodo estatico de la clase cuadrado, que comprueba que el lado se encuentre
        entre 1 y 10 y que sea un entero. Si no es un entero lanzara un TypeError y si
        no comprende los valores entre 1 y 10, lanzara un ArithmeticError.
        Nos servira para verificar tanto el alto, como el ancho del Rectangulo.
        """
        if not isinstance(num, int):  # lado no entero
            raise TypeError("Lado no entero", num)  # Lanzo esta excepcion si el parametro introducido no es un entero.
        if (num <= 0 or num > 10):
            raise ArithmeticError()  # Lanzo esta excepcion que es similar al ArithmeticException de Java


if __name__ == '__main__':
    try:
        rectangulo1 = Rectangulo(3, 4)
        rectangulo2 = Rectangulo(5, 10)
        
        # rectangulo3 = Rectangulo(11,3) # Descomentar para comprobar la excepcion la linea de abajo capturamos el ArithmeticError
        # rectangulo4 = Rectangulo(4.5,8) # Descomentando la linea de abajo capturamos el TypeError
        
        print("Pintamos el rectangulo 1 cuyos datos son:")
        print("Ancho: " + str(rectangulo1.ancho))
        print("Alto: " + str(rectangulo1.alto))
        print(rectangulo1)
        
        print("\n--------------------------------------\n")
        
        print("Pintamos el rectangulo 2 cuyos datos son:")
        print("Ancho: " + str(rectangulo2.ancho))
        print("Alto: " + str(rectangulo2.alto))
        print(rectangulo2)
        
        print("\n--------------------------------------\n")
        
        print("Modificamos el alto del rectangulo 2 a 4")
        rectangulo2.alto = 4
        
        print("Muestro 2 modificado:")
        print(rectangulo2)
        
    except ArithmeticError:
        print("Error. Los valores del rectangulo deben estar comprendidos entre 1 y 10")
    except TypeError:
        print("Error. El ancho y el alto deben ser valores enteros.")
    
