#include <stdio.h>
#include <stdlib.h>  /* rand()  */
#include <time.h>    /* time()  */
#include <unistd.h>  /* sleep() */
#include "fila.h"

# define NUM_ATENDENTES 6
# define NUM_PESSOAS 8
# define TEMPO_MAX 5



/* -------------------------------------------------------------------- */
void imprimeFilas (No **atendentes) {
    
    int i;

    system("clear");

    for (i = 0; i < NUM_ATENDENTES; i++) {
        printf("\nA%d |\t", i+1);
        imprimeFila(atendentes[i]);
    }

    printf("\n");
    
} /* fim de imprimeFilas */



/* -------------------------------------------------------------------- */
int main () {


    char pessoas[NUM_PESSOAS] = {'*', '#', '&', '@', '$', '!', '?', ';'};
    No* atendentes[NUM_ATENDENTES];
    int at_i, at_r, pe;
    int i;

    srand(time(0));

    for (i = 0; i < NUM_ATENDENTES; i++) {
        atendentes[i] = (No*) malloc (sizeof(No));
        inicializaFila(&atendentes[i]);
    }

    imprimeFilas(atendentes);

    while(1) {
        at_i = rand() % NUM_ATENDENTES;
        at_r = rand() % NUM_ATENDENTES;
        pe = rand() % NUM_PESSOAS;

        insereElemento(&atendentes[at_i], pessoas[pe]);
        imprimeFilas(atendentes);

        sleep((rand() % (TEMPO_MAX+1)));

        removeElemento(&atendentes[at_r]);
    }

    return 0;

} /* fim da funcao main */
