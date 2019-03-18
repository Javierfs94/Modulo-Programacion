'''
 * <p>
 * 5. Crea una clase Fraccion (en Java y Python) de forma que podamos hacer las
 * siguientes operaciones:
 * </p>
 * <ul>
 * <li>Contruir un objeto Fraccion pasándole al constructor el numerador y el
 * denominador.</li>
 * <li>Obtener la fracción.</li>
 * <li>Obtener y modificar numerador y denominador. No se puede dividir por
 * cero.</li>
 * <li>Obtener resultado de la fracción (número real).</li>
 * <li>Multiplicar la fracción por un número.</li>
 * <li>Multiplicar, sumar y restar fracciones.</li>
 * <li>Simplificar la fracción.</li>
 * </ul>

@author: Fco Javier Frias Serrano
'''


class Fraccion:
    
    '''
     * Constructor
     * 
     * @param numerador
     *          de la fraccion
     * @param denominador
     *          de la fraccion
     '''

    def __init__(self, numerador, denominador):
        self.numerador = numerador
        self.denominador = denominador
        self.simplificar()

    '''
     * Devuelve el numerador
     * 
     * @return numerador
     '''

    def  getNumerador(self):
        return self.numerador

    '''
     * Devuelve el denominador
     * 
     * @return denominador
    '''

    def __getDenominador(self):
        return self.denominador

    '''
     * Establece el numerador
     * 
     * @param numerador
     *          de la fraccion
     '''

    def __setNumerador(self, numerador):
        self.numerador = numerador
        if (self.numerador == 0):
            print("El numerador no puede ser 0. Colocando numerador 1")
            self.numerador = 1

    '''
     * Establece el denominador
     * 
     * @param demoninador
     *          de la fraccion
     '''

    def __setDenominador(self, demoninador):
        self.denominador = demoninador
        if (self.denominador == 0):
            print("El denominador no puede ser 0. Colocando denominador 1")
            self.denominador = 1

    '''
     * Suma de fracciones
     * 
     * @param fraccion1
     *          Primera fraccion
     * @param fraccion2
     *          Segunda fraccion
     * @return el resultado de la fraccion como cadena
    '''

    def sumar(self, fraccion1, fraccion2):
        auxNum = fraccion1.getNumerador() * fraccion2.getDenominador()
        auxDen = fraccion2.getNumerador() * fraccion1.getDenominador()
        auxDivisor = fraccion1.getDenominador() * fraccion2.getDenominador()
        return ((auxNum + auxDen) + " / " + auxDivisor)

    '''
     * Resta de fracciones
     * 
     * @param fraccion1
     *          Primera fraccion
     * @param fraccion2
     *          Segunda fraccion
     * @return el resultado de la fraccion como cadena
     '''

    def restar(self, fraccion1, fraccion2):
        auxNum = fraccion1.getNumerador() * fraccion2.getDenominador()
        auxDen = fraccion2.getNumerador() * fraccion1.getDenominador()
        auxDivisor = fraccion1.getDenominador() * fraccion2.getDenominador()
        return ((auxNum - auxDen) + " / " + auxDivisor)

    '''
     * Multiplica el numerador de la fraccion por un numero entero
     * 
     * @param numero
     *          entero para multiplicar el numerador de la fraccion
     * @return el numerador multiplicado
    '''

    def multiplicarPorNumero(self, numero):
        self.numerador *= numero
        return self.numerador

    '''
     * Calcula laa multiplicacion entre 2 fracciones
     * 
     * @param x
     *          fraccion 1
     * @param y
     *          fraccion 2
     * @return fraccion c, resultane de la multiplicacion entre ambas
     '''

    def multiplicarFracciones(self, x, y):
        n = x.getNumerador() * y.getNumerador()
        d = x.getDenominador() * y.getDenominador()
        c = Fraccion(n, d)
        return c

    '''
     * Hallar el Minimo Común Divisor de una fracción
     * 
     * @return
     '''

    def __mcd(self):
        dividendo = self.numerador
        divisor = self.denominador
        while (dividendo % divisor != 0):
            resto = dividendo % divisor
            dividendo = divisor
            divisor = resto

        return divisor;

    '''
     * Simplificar una fracción
     '''

    def __simplificar(self):
        mcd = self.mcd()
        self.numerador /= mcd
        self.denominador /= mcd

    def mostrar(self):
        return "Fraccion: " + self.getNumerador() + " / " + self.getDenominador()

# main


if __name__ == "__main__":

    fraccion1 = Fraccion(10, 5)
    fraccion2 = Fraccion(4, 5)
    print(Fraccion.sumar(fraccion1, fraccion2))
    print(Fraccion.restar(fraccion1, fraccion2))
    print(fraccion1.multiplicarPorNumero(5))
    print(Fraccion.multiplicarFracciones(fraccion1, fraccion2))
