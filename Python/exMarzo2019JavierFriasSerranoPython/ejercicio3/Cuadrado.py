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

from ejercicio3.Rectangulo import Rectangulo

class Cuadrado(Rectangulo):

    def __init__(self, lado):
        """
        Constructor de la clase cuadrado, hereda el constructor de rectangulo, y
        crea en el estado una variable llamada lado, para mejor identificacion de
        los atributos.
        """
        super().__init__(lado, lado)

    @property
    def lado(self):
        return self.ancho

    @lado.setter
    def lado(self, lado):
        Cuadrado.verifica_lado(lado)
        self.alto = lado
        self.ancho = lado
    
    def __gt__(self, other):
        """Sobrecarga del operador >"""
        if not isinstance(other, Cuadrado):
            raise Exception
        else:
            return (self.lado) > (other.lado)

    def __ge__(self, other):
        """Sobrecarga del operador >="""
        if not isinstance(other, Cuadrado):
            raise Exception
        else:
            return (self.lado) >= (other.lado)

    def __eq__(self, other):
        """Sobrecarga del operador =="""
        if not isinstance(other, Cuadrado):
            raise Exception
        else:
            return (self.lado) == (other.lado)

    @staticmethod
    def __verifica_lado(num):
        """
        Metodo estatico de la clase cuadrado, que comprueba que el lado se encuentre
        entre 1 y 10 y que sea un entero. Si no es un entero lanzara un TypeError y si
        no comprende los valores entre 1 y 10, lanzara un ArithmeticError.
        """  
        if not isinstance(num, int):  # lado no entero
            raise TypeError("Lado no entero", num)
        if (num <= 0 or num > 10):
            raise ArithmeticError()    

"""
Main de la clase Cuadrado donde se llevan a cabo las pruebas.
"""
if __name__ == '__main__':
    try:
        cuadrado1 = Cuadrado(4)
        cuadrado2 = Cuadrado(5)
        
        print("Pintamos cuadrado 1:")
        print(cuadrado1)
        
        print("\n--------------------------------------\n")
        
        print("Modificamos para que cuadrado1 valga 8")
        
        cuadrado1.lado = 8
        
        print("Volvemos a pintar cuadrado1 tras modificarlo:")
        print(cuadrado1)
        
        print("\n--------------------------------------\n")
        
        # cuadrado1.lado = 11 #Descomentar para comprobar la captura de la expceión
        # print(cuadrado1)
        # print("--------------------------------------")
        
        print("Pintamos cuadrado2:")
        print(cuadrado2)
        
        print("\n--------------------------------------\n")
        
        print("Comparamos dos cuadrados: ")
        print("Tenemos cuadrado1 cuyo lado es: " + str(cuadrado1.lado))
        print("Y tenemos cuadrado2 cuyo lado es: " + str(cuadrado2.lado))
        print("cuadrado1 > cuadrado2: " + str(cuadrado1 > cuadrado2))
        print("cuadrado1 < cuadrado2: " + str(cuadrado1 < cuadrado2))
        print("cuadrado1 == cuadrado2: " + str(cuadrado1 == cuadrado2))
        print("cuadrado1 != cuadrado2: " + str(cuadrado1 != cuadrado2))
        print("cuadrado1 <= cuadrado2: " + str(cuadrado1 <= cuadrado2))
        print("cuadrado1 >= cuadrado2: " + str(cuadrado1 >= cuadrado2))
        print("\n--------------------------------------\n")
        
        print("Creamos cuadrado3, siendo idéntico a cuadrado2 y lo comparamos:")
        cuadrado3 = cuadrado2
        print("Tenemos cuadrado2 cuyo lado es: " + str(cuadrado2.lado))
        print("Y tenemos cuadrado3 cuyo lado es: " + str(cuadrado3.lado))
        print("cuadrado2 > cuadrado3: " + str(cuadrado2 > cuadrado3))
        print("cuadrado2 < cuadrado3: " + str(cuadrado2 < cuadrado3))
        print("cuadrado2 == cuadrado3: " + str(cuadrado2 == cuadrado3))
        print("cuadrado2 != cuadrado3: " + str(cuadrado2 != cuadrado3))
        print("cuadrado2 <= cuadrado3: " + str(cuadrado2 <= cuadrado3))
        print("cuadrado2 >= cuadrado3: " + str(cuadrado2 >= cuadrado3))
    except ArithmeticError:
        print("Error. El lado del cuadrado debe estar comprendido entre 1 y 10")
    except TypeError:
        print("Error. Comprueba que el lado sea un valor entero.")
    except:
        print("Error. Solo se pueden comparar objetos de tipo Cuadrado entre si")
