// arquivo principal
#include <stdio.h>
#include "header.h"

int main (){
	No *lista;

	inicializaLista(&lista);
	imprimeLista(lista);

    insereInicio(&lista, 1);
    imprimeLista(lista);
    insereInicio(&lista, 2);
	insereInicio(&lista, 5);
	imprimeLista(lista);

	insereFinal(&lista, 8);
	insereFinal(&lista, 17);
	insereFinal(&lista, 41);
	insereFinal(&lista, 12);
	imprimeLista(lista);

    revomeInicio(&lista);
    imprimeLista(lista);

	revomeFinal(&lista);
	imprimeLista(lista);


	return 0;
}
