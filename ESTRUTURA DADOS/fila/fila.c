#include <stdio.h>
#include <stdlib.h>
#include "fila.h"


/* funcao que inicializa a fila -------------------------------------- */
void inicializaFila (No **fila) {

    *fila = NULL;

} /* fim da funcao inicializaFila */



/* funcao que verifica se a fila esta vazia -------------------------- */
int filaVazia (No *fila) {

    if (fila == NULL)
        return 1;

    return 0;

} /* fim da funcao filaVazia */



/* funcao que imprime o conteudo da fila ----------------------------- */
void imprimeFila (No *fila) {

    No *atual = fila;

    if (filaVazia(fila))
        return;

    while (atual != NULL) {
        printf("%c ", atual->pessoa);
        atual = atual->proximo;
    }

} /* fim da funcao imprimeFila */



/* funcao que insere um elemento no final da fila -------------------- */
void insereElemento (No **fila, char pessoa) {

    No *novo;
    No *atual = *fila;

    /* cria o novo noh a ser inserido na fila */
    novo = (No*) malloc (sizeof(No));
    novo->pessoa = pessoa;
    novo->proximo = NULL;

    /* se a fila estiver vazia, novo noh passa a ser o inicio da fila */
     if (filaVazia(*fila)) {
        *fila = novo;
        return;
    }

    /* caso contrario, caminha na fila ate parar no ultimo noh */
    while (atual->proximo != NULL)
        atual = atual->proximo;

    /* ultimo noh aponta para o novo noh */
    atual->proximo = novo;

} /* fim da funcao insereElemento */



/* funcao que remove o elemento do inicio da fila --------------------- */
void removeElemento (No **fila) {

    No *aux = *fila;

    if (filaVazia(*fila))
        return;

    /* inicio da fila passa a ser o segundo noh (ou NULL) */
    *fila = aux->proximo;

    /* remove o primeiro noh da memoria */
    free(aux);

} /* fim da funcao removeElemento */



/* funcao que pesquisa por um elemento na fila ----------------------- */
No* pesquisaElemento (No *fila, char pessoa) {

    No *atual = fila;

    printf(" -> pesquisa por %d\n", pessoa);

    /* caso contrario, caminha na fila ate encontrar o elemento */
    while ((atual != NULL) && (atual->pessoa != pessoa))
        atual = atual->proximo;

    /* retorna o ponteiro para o elemento encontrado    */
    /* (se o elemento nao foi encontrado, retorna NULL) */
    return atual;

} /* fim da funcao pesquisaElemento */



/* funcao que esvazia a fila ----------------------------------------- */
void esvaziaFila (No **fila) {

    /* enquanto a fila nao estiver vazia, entao remove noh */
    while (! filaVazia(*fila))
        removeElemento(fila);
      
} /* fim da funcao esvaziaFila */
