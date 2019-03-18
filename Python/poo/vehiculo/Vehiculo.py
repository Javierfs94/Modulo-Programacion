'''
 * <p>
 * Enunciado del ejercicio
 * </p>
 * <p>
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo, crea los atributos de clase
 * vehiculosCreadosy kilometrosTotales, así como el atributo de instancia
 * kilometrosRecorridos. Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú
 * como el que se muestra a continuación:
 * </p>
 * <ul>
 * <li>VEHÍCULOS</li>
 * <li>=========</li>
 * <li>1. Anda con la bicicleta</li>
 * <li>2. Haz el caballito con la bicicleta</li>
 * <li>3. Anda con el coche</li>
 * <li>4. Quema rueda con el coche</li>
 * <li>5. Ver kilometraje de la bicicleta</li>
 * <li>6. Ver kilometraje del coche</li>
 * <li>7. Ver kilometraje total</li>
 * <li>8. Salir</li>
 * <li>Elige una opción (1-8):</li>
 * </ul>
 * <p>
 * Clase Vehiculo
 * </p>

@author: Fco Javier Frias Serrano
'''


class Vehiculo:
    
    # atributos
    kilometrosTotales = 0
    vehiculosCreados = 0
    
    '''
    Constructor
    '''

    def __init__(self):
        self.__kilometrosRecorridos = 0

    '''
    Devuelve los kilometros Totales
    '''

    def getKilometrosTotales(self):
        return Vehiculo.kilometrosTotales

    '''
    Devuelve los kilometros Recorridos
    '''

    def getKilometrosRecorridos(self):
        return self.__kilometrosRecorridos

    '''
    Hace que un vehículo recorra una distancia
    '''

    def recorrer(self, km):
        self.__kilometrosRecorridos += km
        Vehiculo.kilometrosTotales += km

    
class Bicicleta(Vehiculo):

    '''
    Hace un caballito
    '''

    def hacerCaballito(self):
        print("Estoy haciendo el caballito")


class Coche(Vehiculo):

    '''
    Quema las ruedas del coche
    '''

    def quemarRueda(self):
        print("Estoy quemando las ruedas")

# main

'''
Muestra un menu
'''


def mostrarMenu():
    print("VEHÍCULOS")
    print("=========")
    print("1. Anda con la bicicleta")
    print("2. Haz el caballito con la bicicleta")
    print("3. Anda con el coche")
    print("4. Quema rueda con el coche")
    print("5. Ver kilometraje de la bicicleta")
    print("6. Ver kilometraje del coche")
    print("7. Ver kilometraje total")
    print("8. Salir")


if __name__ == "__main__":

        bici1 = Bicicleta()
        coche1 = Coche()

while True:
        mostrarMenu()
        opcion = int(input("Elige una opción (1-8):"))

        if(opcion == 1):
            km = int(input("¿Cuántos km quiere recorrer?"))
            bici1.recorrer(km)
        elif(opcion == 2):
            bici1.hacerCaballito()
        elif(opcion == 3):
            km = int(input("¿Cuántos km quiere recorrer?"))
            coche1.recorrer(km)
        elif(opcion == 4):
            coche1.quemarRueda()
        elif(opcion == 5):
            print("La bicicleta lleva recorrida " , bici1.getKilometrosRecorridos() , " km")
        elif(opcion == 6):
            print("El coche lleva recorrido " , coche1.getKilometrosRecorridos() , " km")
        elif(opcion == 7):
            print("Los vehículos llevan recorridos " , Vehiculo.getKilometrosTotales(km) , " km")
        elif(opcion == 8):
            print("Ha seleccionado salir. ¡Hasta luego!")
            break
        else:
            print("Ha introducido una opción inválida.")
