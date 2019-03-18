
'''
 * <p>
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase
 * Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new
 * Tiempo(1, 20, 30) donde los parámetros que se le pasan al constructor son las
 * horas, los minutos y los segundos respectivamente. Crea el método toString
 * para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por
 * ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un
 * programa de prueba para comprobar que la clase funciona bien.
 * </p>
 *
 * Variación: El ejercicio 6 anterior te pide que crees una clase "Tiempo" y un
 * programa de prueba. Investiga si ya existe en Java y Python una clase similar
 * y adapta tus programas de prueba para trabajar con esas clases.
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0

@author: Fco Javier Frias Serrano
'''
from datetime import datetime, date, time, timedelta
import calendar

class TiempoConDate:

    '''
     * Constructor
    '''

    def __init__(self):
        tiempo = datetime.time()

    '''
     * Modifica el tiempo
     * 
     * @param horas
     * @param minutos
     * @param segundos
    '''

    def modificar(self, horas, minutos, segundos):
        self.segundos = tiempo.datetime.__add__(segundos)
        self.minutos = tiempo.datetime.__add__(minutos)
        self.horas = tiempo.datetime.__add__(horas)
        
    def  __str__(self):
        return str(tiempo.datetime.hour) + "h " + str(tiempo.datetime.minute) + "m " + str(tiempo.datetime.second) + "s"


# main
tiempo = TiempoConDate()

print(tiempo)
tiempo.modificar(1, 1, 60)
print(tiempo)
tiempo.modificar(-1, -1, -60)
print(tiempo)
