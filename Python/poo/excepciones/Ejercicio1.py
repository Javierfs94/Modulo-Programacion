'''
Realiza un programa que pida 6 números por teclado y nos diga cuál es el máximo. Si el usuario introduce un dato erróneo 
(algo que no sea un número entero) el programa debe indicarlo y debe pedir de nuevo el número.

@author Francisco Javier Frías Serrano
@version 1.0
'''
print("Introduzca 6 números enteros...");

for i in range(1, 7):
            
    numero = 0 
    datoValido = False
    maximo = numero
            
    while not datoValido:

        try :
            numero = int(input("Nº " + str(i) + ": "))
            datoValido = True
            
            if (numero > maximo):
              maximo = numero
              
        except:
            print("Dato introducido inválido. Debe introducir un número entero.")
            print("Vuelva a introducir el dato")
            datoValido = False

    if (numero > maximo):
        maximo = numero

print("El número máximo es " , maximo);
