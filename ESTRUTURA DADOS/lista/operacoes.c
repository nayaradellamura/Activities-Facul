// operacoes
#include "header.h"
#include <stdio.h>

// codificar as operacoes declaradas no header.h
void inicializaLista(No **lista){
	*lista = NULL;
}

// avalia se a lista esta ou se nao esta vazia
int listaEstaVazia(No *lista){
	if(lista == NULL)
		return 1;
	return 0;
}

// exibi o conteudo da lista
void imprimeLista(No *lista){
	No *aux = lista;

	if(listaEstaVazia(lista)){
		printf("A lista esta vazia!!!\n");
		return;
	}

	printf("Lista: [");

	while(aux != NULL){
		printf("%d ", aux->dado);
		aux = aux->proximo;
	}
	printf("]\n");
}

void insereInicio(No **lista, int id){
    No *novo;

    novo = (No *) malloc(sizeof(No));
    novo->dado = id;

    // testar se a lista esta vazia
    if(listaEstaVazia(*lista) == 1)
        novo->proximo = NULL;
    else // caso contrario atribui o antigo primeiro no para o proximo
        novo->proximo = *lista;

    // o novo no passa a ser o inicio da lista
    *lista = novo;
}

void insereFinal (No **lista, int id){
    No *novo;
    No *aux = *lista;

    novo = (No *) malloc(sizeof(No));
    novo->dado = id;
    novo->proximo = NULL;

    // testar se a lista esta vazia
     if(listaEstaVazia(*lista) ==1){
        *lista = novo;
        return;
     }

     // se a lista nao estiver vazia
     // andar na lista ate encontrar o ultimo no
     while(aux->proximo != NULL)
		aux = aux->proximo;

     aux->proximo = novo;
}

void revomeInicio (No **lista){
     No *aux = *lista;

    // testar se a lista esta vazia
     if(listaEstaVazia(*lista) ==1){
        printf("Remocaoo em uma lista vazia\n");
        return;
     }

     // o inicio da lista passa a ser o segundo no
     *lista = aux->proximo;

     // libera a memoria alocada
     free(aux);
}

void revomeFinal(No **lista){
     No *atual = *lista;
     No *anterior = *lista;

    // testar se a lista esta vazia
     if(listaEstaVazia(*lista) ==1){
        printf("Remocao em uma lista vazia\n");
        return;
     }
     // caminhar ate o no final e guardar o no anterior
     while(atual->proximo != NULL){
        anterior = atual;
        atual = atual->proximo;
     }

     // se haver somente um cara na lista
     if(atual == *lista)
        *lista = NULL;
     else // caso tenha mais do que um no na lista
        anterior->proximo = NULL;

    // liberar memoria alocada
    free(atual);


     return;
}
