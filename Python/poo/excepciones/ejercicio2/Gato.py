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
  
  def __init__(self,sexo):
        self.sexo=sexo
        
  def getSexo(self):
        return self.sexo

  def setColor(self,color):
        self.color=color
    
  def setRaza(self,raza):
        self.raza=raza
        
  def setEdad(self,edad):
        self.edad=edad
        
  def setPeso(self,peso):
        self.peso=peso
        
  def apareaCon(self, pareja): 
        if(self.sexo == pareja.sexo):
            raise ApareamientoImposibleException()
        else:
            print("Los gatos se han apareado")
