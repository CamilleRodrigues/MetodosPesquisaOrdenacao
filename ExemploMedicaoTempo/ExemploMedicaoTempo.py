# ExemploMedicaoTempo.java em Python 

import random 
import time 

class Utilidades: 
    @staticmethod 
    def popular_lista(lista, qtdNumeros, ini, fim, alet): 
        if alet: 
            for _ in range(qtdNumeros): 
                lista.append(random.randint(ini, fim - 1)) 
        else: 
            for i in range(qtdNumeros): 
                lista.append(ini + 1) 
                
    @staticmethod 
    def exibirLista(lista, frase): 
        print(frase) 
        for item in lista: 
            print(item) 
            print(f"Total de registros: {len(lista)}") 
            
if __name__ == "__main__": 
    lista_aleatoria = [] 
    lista_sequencial = [] 
    
    tempo_ini = time.time() 
    Utilidades.popular_lista(lista_aleatoria, 100000, 100, 100000, True) 
    
    tempo_fim = time.time() 
    print(f"Tempo lista aleatoria: {(tempo_fim - tempo_ini)*1000:.2f}") 
    
    tempo_inicio = time.time() 
    Utilidades.popular_lista(lista_sequencial, 100000, 1, 100000, False) 
    
    tempo_fim = time.time() 
    print(f"Tempo lista sequencial: {(tempo_fim - tempo_inicio)*1000:.2f}")
