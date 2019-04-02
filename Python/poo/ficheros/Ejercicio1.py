'''
 * <p>
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * </p>

@author: Francisco Javier Frías Serrano
'''

# main



def esPrimo(num):
    """
    Esta función comprueba si un número es primo
    :param num:
    :return: devuelve True si el número pasado por prámetro es primo
    """
    if num <= 1:
        return False
    elif num == 2:
        return True
    else:
        for i in range(2, num):
            if num % i == 0:
                return False
        return True

escritura = open("primos.dat", "w")

for x in range(501):
    """
    Con este for compruebo los números primos del 1 al 500 y los añado al escritura antes creado
    """
    if(esPrimo(x) == True):
        escritura.writelines(str(x) + " ")

escritura.close()
