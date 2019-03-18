'''
 * <p>
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los
 * terminales se pueden llamar unos a otros y el tiempo de conversación corre
 * para ambos. A continuación se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla.
 * </p>
 * 
 * <p>
 * Contenido del main: (lo he trasladado a la clase Test)
 * </p>
 * <ul>
 * <li>Salida</li>
 * <li>Nº 678 11 22 33 - 0s de conversación</li>
 * <li>Nº 644 74 44 69 - 0s de conversación</li>
 * <li>Nº 678 11 22 33 - 520s de conversación</li>
 * <li>Nº 644 74 44 69 - 320s de conversación</li>
 * <li>Nº 622 32 89 09 - 200s de conversación</li>
 * <li>Nº 664 73 98 18 - 0s de conversación</li>
 * </ul>
 *
  * <p>
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada móvil lleva asociada una
 * tarifa que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6,
 * 12 y 30 céntimos respectivamente. Se tarifican los segundos exactos.
 * Obviamente, cuando un móvil llama a otro, se le cobra al que llama, no al que
 * recibe la llamada. A continuación se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla. Para que el total tarificado
 * aparezca con dos decimales, puedes utilizar DecimalFormat.
 * </p>
 * <ul>
 * <li>Salida</li>
 * <li>Nº 678 11 22 33 - 0s de conversación - tarificados 0,00 euros</li>
 * <li>Nº 644 74 44 69 - 0s de conversación - tarificados 0,00 euros</li>
 * <li>Nº 678 11 22 33 - 520s de conversación - tarificados 0,52 euros</li>
 * <li>Nº 644 74 44 69 - 870s de conversación - tarificados 1,10 euros</li>
 * <li>Nº 622 32 89 09 - 750s de conversación - tarificados 0,00 euros</li>
 * </ul>
 * @author Fco Javier Frías Serrano
 * @version 1.0

@author: Fco Javier Frias Serrano
'''


class Terminal:

    '''
    Constructor
    '''

    def __init__(self, numero):
        self.__numero = numero
        self.__tiempo = 0
       
    @property  # Se puede usar como un "getter"
    def numero(self):
        return self.__numero
    
    @numero.setter  # setter de lado
    def numero(self):
        self.__numero
        
    @property  # Se puede usar como un "getter"
    def tiempo(self):
        return self.__tiempo
    
    @tiempo.setter  # setter de lado
    def tiempo(self, tiempo):
        self.__tiempo = tiempo

    '''
    Realiza una llamada de un terminal a otro.
    '''

    def llamar(self, terminal, tiempo):
        self.__tiempo += tiempo
        terminal.tiempo += tiempo
        
    def  __str__(self):
        return f"nº:{self.__numero} - {self.__tiempo} s de conversación"


class Movil (Terminal):
    
    tarifa = ""
    totalTarifa = 0
    
    '''
    Constructor
    '''

    def __init__(self, numero, tarifa):
        super().__init__(numero)
        self.__tarifa = tarifa
        self.__totalTarifa = 0

    '''
    Realiza una llamada de un terminal a otro.
    
    Se suman los tiempos a ambos.
    
    Tarifas: “rata”, “mono” o “bisonte”.El coste por minuto es de 6, 12 y 30 céntimos respectivamente.
    '''

    def llamar(self, terminal, tiempo):
        Terminal.llamar(self, terminal, tiempo)
        minutos = tiempo / 60

        if (self.__tarifa == "rata"):
            self.__totalTarifa += minutos * 0.06
        elif (self.__tarifa == "mono"):
            self.__totalTarifa += minutos * 0.12
        elif (self.__tarifa == "bisonte"):
            self.__totalTarifa += minutos * 0.30
    
    def __str__(self):
        return str(super().__str__()) + f" - tarificados {self.__totalTarifa} euros."
        
# main


m1 = Movil("678 11 22 33", "rata")
m2 = Movil("644 74 44 69", "mono")
m3 = Movil("622 32 89 09", "bisonte")
        
print(m1)
print(m2)
        
m1.llamar(m2, 320)
m1.llamar(m3, 200)
m2.llamar(m3, 550)
        
print(m1)
print(m2)
print(m3)
