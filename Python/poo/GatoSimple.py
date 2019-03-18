'''
Ejercicio de GatoSimple del libro de Aprende con Java con ejercicios en versión del lenguaje Python

@author: Fco Javier Frias Serrano
'''


class GatoSimple:
    
    '''
       Constructor de GatoSimple
    '''

    def __init__ (self, sexo):
        self.__sexo = sexo;
        self.__color = ""
        self.__raza = ""
        self.__edad = 0
        self.__peso = 0.0

    '''
        Devuelve el sexo
    '''
        
    def getSexo(self):
        return self.__sexo;
  
    '''
        Hace maullar al gato
    '''

    def maulla(self):
        print("Miauuuu")

    '''
        Hace que el gato ronronee
    '''

    def ronronea(self):
        print("mrrrrrr")
  
    '''
    Hace que el gato coma.
    
    A los gatos les gusta el pescado, si le damos otra comida la rechazará.
   '''

    def come(self, comida):
        if (comida == "pescado"):
            print("Hmmmm, gracias")
        else:
            print("Lo siento, yo solo como pescado")

    '''
    Pone a pelear dos gatos.

    Solo se van a pelear dos machos entre sí.
   '''

    def peleaCon(self, contrincante):
        if (self.__sexo == "hembra"):
            print("no me gusta pelear")
        else:
            if (contrincante.getSexo() == "hembra"):
                print("no peleo contra gatitas")
            else:
                print("ven aquí que te vas a enterar")


# main
if __name__ == "__main__":
    garfield = GatoSimple("macho")
    
    print("hola gatito")
    garfield.maulla()
    print("toma tarta")
    garfield.come("tarta selva negra")
    print("toma pescado, a ver si esto te gusta")
    garfield.come("pescado")
    
    tom = GatoSimple("macho")
    
    print("Tom, toma sopita de verduras")
    tom.come("sopa de verduras")
    
    lisa = GatoSimple("hembra")
    
    print("gatitos, a ver cómo maulláis")
    garfield.maulla()
    tom.maulla()
    lisa.maulla()
    
    garfield.peleaCon(lisa)
    lisa.peleaCon(tom)
    tom.peleaCon(garfield) 
