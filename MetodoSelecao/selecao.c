// Seleção em C 

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>

void selecao(int lista[], int n) {
    int tmp;
    int qtdComparacoes = 0;
    int qtdTrocas = 0;
    int posMenor;

    for (int i = 0; i < n - 1; i++) {
        posMenor = i;
        for(int j = i+1; j < n; j++) {
            qtdComparacoes++;
            if (lista[j] < lista [posMenor]) {
            posMenor = j;
            }
        }
        if (i != posMenor) {
            qtdTrocas++;
            tmp = lista[i];
            lista[i] = lista[posMenor];
            lista[posMenor] = tmp;
        }
    }   

}

int main() {
    int n = 10;
    int lista[n];

    srand(time(NULL));

    for (int i = 0; i < n; i++) {
        lista[i] = rand() % 100;
    }

    printf("Lista Original: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", lista[i]);
    }
    printf("\n");

    selecao(lista, n);

    printf("Lista Ordenada: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", lista[i]);
    }
    printf("\n");

    return 0;
}
