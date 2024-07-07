#include <stdio.h>
#include <stdlib.h>
#include "pilha.h"


/* funcao que inicializa a pilha -------------------------------------- */
void inicializaPilha (No **pilha) {

    *pilha = NULL;

} /* fim da funcao inicializaPilha */



/* funcao que verifica se a pilha esta vazia -------------------------- */
int pilhaVazia (No *pilha) {

    if (pilha == NULL)
        return 1;

    return 0;

} /* fim da funcao pilhaVazia */



/* funcao que imprime o conteudo da pilha ----------------------------- */
void imprimePilha (No *pilha) {

    No *atual = pilha;

    if (pilhaVazia(pilha))
        return;

    while (atual != NULL) {
        printf("%c ", atual->carro);
        atual = atual->proximo;
    }

} /* fim da funcao imprimePilha */



/* funcao que insere um elemento no topo da pilha --------------------- */
/* (no caso, o topo da pilha será no final da estrutura)                */
void push (No **pilha, char carro) {

    No *novo;
    No *atual = *pilha;

    /* cria o novo noh a ser inserido na pilha */
    novo = (No*) malloc (sizeof(No));
    novo->carro = carro;
    novo->proximo = NULL;

    /* se a pilha estiver vazia, novo noh passa a ser o inicio da pilha */
     if (pilhaVazia(*pilha)) {
        *pilha = novo;
        return;
    }

    /* caso contrario, caminha na pilha ate parar no ultimo noh */
    while (atual->proximo != NULL)
        atual = atual->proximo;

    /* ultimo noh aponta para o novo noh */
    atual->proximo = novo;

} /* fim da funcao push */



/* funcao que remove o elemento do topo da pilha ---------------------- */
/* (no caso, o topo da pilha será no final da estrutura)                */
void pop (No **pilha) {

    No *atual = *pilha;
    No *anterior = *pilha;

    if (pilhaVazia(*pilha))
        return;

    /* caminha ate o final da pilha */
    while (atual->proximo != NULL) {
        anterior = atual;
        atual = atual->proximo;
    }

    /* se houver apenas um elemento, entao, inicio torna-se NULL */
    if (atual == *pilha)
        *pilha = NULL;

    /* caso contrario, remove o ultimo noh da pilha */
    else
        anterior->proximo = NULL;

    /* remove o utlimo noh da memoria */
    free(atual);

} /* fim da funcao pop */

