'''
 * <p>
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase
 * Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new
 * Tiempo(1, 20, 30) donde los parámetros que se le pasan al constructor son las
 * __horas, los __minutos y los __segundos respectivamente. Crea el método toString
 * para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por
 * ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un
 * programa de prueba para comprobar que la clase funciona bien.
 * </p>
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0

@author: Fco Javier Frias Serrano
'''


class Tiempo:
    '''
     Constructor
    '''

    def __init__(self, __horas, __minutos, __segundos):
        self.__horas = __horas;
        self.__minutos = __minutos;
        self.__segundos = __segundos;

    '''
     Suma 2 rangos de tiempo
    '''

    def sumar(self, __horas, __minutos, __segundos):
        self.__segundos += __segundos
        if (self.__segundos >= 60):
            self.__segundos -= 60
            self.__minutos += 1
        self.__minutos += __minutos;
        if (self.__minutos >= 60):
            self.__minutos -= 60
            self.__horas += 1
        self.__horas += __horas;

    '''
    Resta 2 rangos de tiempo
    '''

    def restar(self, __horas, __minutos, __segundos):
        self.__segundos -= __segundos;
        if (self.__segundos <= 0):
            self.__segundos += 60;
            self.__minutos -= 1
        self.__minutos -= __minutos;
        if (self.__minutos <= 0):
            self.__minutos += 60;
            self.__horas -= 1
        self.__horas -= __horas;

    def  __str__(self):
        return str(self.__horas) + "h " + str(self.__minutos) + "m " + str(self.__segundos) + "s"


# main 
if __name__ == "__main__":
    
    t = Tiempo(1, 20, 30)
    print(t)
    t.sumar(2, 40, 30)
    print(t)
    t.restar(2, 40, 30)
    print(t)
