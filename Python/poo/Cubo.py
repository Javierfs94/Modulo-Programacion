'''
Ejercicio de Cubo del libro de Aprende con Java con ejercicios en versión del lenguaje Python

@author: Fco Javier Frias Serrano
'''


class Cubo:
    
    '''
        Constructor de Cubo
    '''

    def __init__(self, c):
        self.__capacidad = c
        self.__contenido = 0

    '''
        Devuelve la capacidad
    '''

    def getCapacidad(self):
        return self.__capacidad

    '''
        Devuelve el contenido
    '''

    def getContenido(self):
        return self.__contenido

    '''
        Establece el contenido
    '''

    def setContenido(self, litros):
        self.__contenido = litros
    
    '''
        Vacia el contenido del cubo
    '''

    def vacia(self):
        self.__contenido = 0

    '''
     Llena el cubo al máximo de su capacidad.
    '''

    def llena(self):
        self.__contenido = self.__capacidad

    '''
        Pinta el cubo en la pantalla.
        
        Se muestran los bordes del cubo con el carácter # y el agua que contiene con el carácter ~.
    ''' 

    def pinta(self):
            for nivel in range(self.__capacidad, 0, -1):
                if (self.__contenido >= nivel):
                    print("#~~~~#")
                else:
                    print("#    #")
            print("###### \n")

    '''
    Vuelca el contenido de un cubo sobre otro.
    
    Antes de echar el agua se comprueba cuánto le cabe al cubo destino.
    '''

    def vuelcaEn(self, destino):
            libres = destino.getCapacidad() - destino.getContenido()
    
            if (libres > 0):
                if (self.__contenido <= libres):
                    destino.setContenido(destino.getContenido() + self.__contenido);
                    self.vacia();
            else :
                self.__contenido -= libres;
                destino.llena();


# main
if __name__ == "__main__":

    cubito = Cubo(2)
    cubote = Cubo(7)

    print("Cubito: \n")
    cubito.pinta()

    print("\nCubote: \n")
    cubote.pinta()

    print("\nLleno el cubito: \n")
    cubito.llena()
    cubito.pinta()

    print("\nEl cubote sigue vacío: \n")
    cubote.pinta()
    
    print("\nAhora vuelco lo que tiene el cubito en el cubote.\n")
    cubito.vuelcaEn(cubote)

    print("Cubito: \n")
    cubito.pinta()

    print("\nCubote: \n")
    cubote.pinta()

    print("\nAhora vuelco lo que tiene el cubote en el cubito.\n")
    cubote.vuelcaEn(cubito)

    print("Cubito: \n")
    cubito.pinta()

    print("\nCubote: \n")
    cubote.pinta()
