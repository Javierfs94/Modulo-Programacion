'''
Escribe un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente
 
@author: Fco Javier Frias Serrano
'''
    
print("Introduzca el numero del mes y le digo cuantos dias tiene: ")
num=int(input())
    
if num==1 or num==3 or num==5 or num==7 or num==9 or num==11:
    print("El mes correspondiente tiene 31 dias")   
elif num==4 or num==6 or num==8 or num==10 or num==12:
    print("El mes correspondiente tiene 30 dias")
elif num==2:
    print("El mes correspondiente tiene 28 dias")
else:   
    print("Ese mes no existe")
