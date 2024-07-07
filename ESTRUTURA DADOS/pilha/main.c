#include <stdio.h>
#include <stdlib.h>  /* rand()  */
#include <time.h>    /* time()  */
#include <unistd.h>  /* sleep() */
#include "pilha.h"

# define NUM_VAGAS 4
# define NUM_CARROS 7
# define TEMPO_MAX 3



/* -------------------------------------------------------------------- */
void imprimePilhas (No **vagas) {
    
    int i;

    system("clear");

    printf("\nANTONELLO'S PARKING HALL\n");

    for (i = 0; i < NUM_VAGAS; i++) {
        printf("\nVaga %d | ", i+1);
        imprimePilha(vagas[i]);
    }

    printf("\n");
    
} /* fim de imprimePilhas */



/* -------------------------------------------------------------------- */
int main () {

    char carros[NUM_CARROS] = {'_', '-', '=', '^', '~', '@', '#'};
    No* vagas[NUM_VAGAS];
    int vg_i, vg_r, ca;
    int i;

    srand(time(0));

    for (i = 0; i < NUM_VAGAS; i++) {
        vagas[i] = (No*) malloc (sizeof(No));
        inicializaPilha(&vagas[i]);
    }

    imprimePilhas(vagas);

    while(1) {
        vg_i = rand() % NUM_VAGAS;
        vg_r = rand() % NUM_VAGAS;
        ca = rand() % NUM_CARROS;

        push(&vagas[vg_i], carros[ca]);
        imprimePilhas(vagas);

        sleep((rand() % (TEMPO_MAX+1)));

        pop(&vagas[vg_r]);
    }

    return 0;

} /* fim da funcao main */
