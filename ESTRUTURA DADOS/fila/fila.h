#ifndef FILA_H
#define FILA_H


/* estrutura do noh da fila */
typedef struct _no {
    char pessoa;
    struct _no *proximo;
} No;


/* declaracoes das funcoes de fila */
void inicializaFila (No**);
int listaVazia (No*);

void imprimeFila (No*);

void insereElemento (No**, char);
void removeElemento (No**);
No* pesquisaElemento (No*, char);

void esvaziaFila (No**);


#endif
