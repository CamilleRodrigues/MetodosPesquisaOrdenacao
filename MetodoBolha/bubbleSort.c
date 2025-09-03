// Bubble Sort em C

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>

void bubbleSort(int lista[], int n) {
    int tmp;
    int qtdComparacoes = 0;
    int qtdTrocas = 0;
    bool houveTrocas;

    do {
        houveTrocas = false;
        for (int i = 0; i < n - 1; i++) {
            qtdComparacoes++;
            if (lista[i] > lista [i + 1]) {
                qtdTrocas++;
                houveTrocas = true;

                tmp = lista[i];
                lista[i] = lista[i + 1];
                lista[i + 1] = tmp;
            }
        }
    } while (houveTrocas);
    
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

    bubbleSort(lista, n);

    printf("Lista Ordenada: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", lista[i]);
    }
    printf("\n");

    return 0;
}
