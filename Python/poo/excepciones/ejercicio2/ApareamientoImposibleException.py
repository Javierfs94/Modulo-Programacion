'''
Error lanzado cuando no pueden aparearse dos gatos

@author: Francisco Javier Frías Serrano
'''

class ApareamientoImposibleException(Exception):
    def __init__(self): 
      Exception.__init__(self)
      print("No pueden aparearse dos gatos de mismo sexo")