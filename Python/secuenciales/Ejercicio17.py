'''
Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos.�El tiempo de viaje hasta llegar a otra ciudad B es de T segundos.�Escribir un algoritmo que determine 
la hora de llegada a la ciudad B.

@author: Fco Javier Frias Serrano
'''

print("Hora de salida")
horaPartida = int(input())
print("Minutos de salida")
minPartida = int(input())
print("Segundos de salida")
segPartida = int(input())
print("Tiempo que ha tardado en  segundos")
segViaje = int(input())

segInicial = horaPartida * 3600 + minPartida * 60 + segPartida
segFinal = segInicial + segViaje
horaLlegada = round(segFinal / 3600)
minLlegada = round((segFinal % 3600) / 60)
segLlegada = (segFinal % 3600) % 60

print("Hora de llegada: " , horaLlegada , ":" , minLlegada , ":" , segLlegada)