// Inserção em C

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void insercao(int lista[], int n) {
    int tmp;
    int qtdComparacoes = 0;
    int qtdTrocas = 0;

    for (int i = 1; i < n; i++) {
        tmp = lista[i];
        int j = i - 1;

        while (j >= 0) {
            qtdComparacoes++; 
            if (lista[j] > tmp) {
                lista[j + 1] = lista[j];
                qtdTrocas++;
                j--;
            } else {
                break;
            }
        }

        lista[j + 1] = tmp;
        qtdTrocas++;
    }

    printf("Comparações: %d\n", qtdComparacoes);
    printf("Trocas: %d\n", qtdTrocas);
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

    insercao(lista, n);

    printf("Lista Ordenada: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", lista[i]);
    }
    printf("\n");

    return 0;
}
