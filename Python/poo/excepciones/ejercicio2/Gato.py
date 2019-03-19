'''
 * Definición de la clase GatoSimple
 *
 * <p>
 * Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
 * Este método debe comprobar que los gatos son de distinto sexo, tras lo cual,
 * genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria =
 * garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo, el
 * método debe generar la excepción ExcepcionApareamientoImposible. Crea un
 * programa desde el que se pruebe el método.
 * </p>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0

@author: Francisco Javier Frías Serrano
'''
from poo.excepciones.ejercicio2.ApareamientoImposibleException import ApareamientoImposibleException


class Gato:
  
  '''
  Constructor
  '''
  def __init__(self, sexo ):
    self.sexo = sexo

  #Setters y Getters
  def setColor(self,color):
    self.color = color
  def setRaza(self,raza):
    self.raza = raza
  def setEdad(self,edad):
    self.edad = edad
  def setPeso(self,peso):
    self.peso = peso

    '''
    Hace que el gato maulle
    '''
    def maulla(self):
        print("Miauuuu")

    '''
    Hace que el gato ronronee
    '''
    def  ronronea(self):
        print("mrrrrrr")

    '''
     Hace que el gato coma. A los gatos les gusta el pescado, si le damos otra comida la rechazará.
     '''
    def come(self, comida):
        if (comida=="pescado") :
          print("Hmmmm, gracias")
        else :
          print("Lo siento, yo solo como pescado")

    '''
    Pone a pelear dos gatos. Solo se van a pelear dos machos entre sí.
    '''
    def  peleaCon(self, contrincante):
        if (self.sexo == "hembra"):
            print("no me gusta pelear");
        else:
          if (contrincante.getSexo()== "hembra"):
            print("no peleo contra gatitas")
          else:
            print("ven aquí que te vas a enterar")

    '''
    Aparea 2 gatos entre ellos
    '''
    def apareaCon(self, pareja): 
        if(self.sexo == pareja.sexo):
          raise ApareamientoImposibleException()
        else:
          print("Los gatos se han apareado")