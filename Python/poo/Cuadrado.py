'''
Ejercicio de Cuadrado del libro de Aprende con Java con ejercicios en versión del lenguaje Python

@author: Fco Javier Frias Serrano
'''


class Cuadrado:
    
    '''
      Constructor de Cuadrado
    '''

    def __init__(self, l):
        self.__lado = l

    '''
        Muestra el cuadrado
    '''

    def __str__(self):
    
        resultado = ""

        for i in range(0, self.__lado, +1):
            resultado += "██"
        resultado += "\n"

        for i in range(1, self.__lado - 1, +1):
            resultado += "██"
            for espacios in range(1, self.__lado - 1, +1):
                resultado += "  "
            resultado += "██\n"
        
        for i in range(0, self.__lado, +1):
            resultado += "██"
        resultado += "\n"
    
        return  resultado


# main
if __name__ == "__main__":
    
    cuadrado1 = Cuadrado(5)
    print(cuadrado1)
    cuadrado2 = Cuadrado(10)
    print(cuadrado2)
