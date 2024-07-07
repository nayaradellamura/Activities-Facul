#ifndef PILHA_H
#define PILHA_H


/* estrutura do noh da pilha */
typedef struct _no {
    char carro;
    struct _no *proximo;
} No;


/* declaracoes das funcoes de pilha */
void inicializaPilha (No**);
int listaVazia (No*);

void imprimePilha (No*);

void push (No**, char);
void pop (No**);


#endif
