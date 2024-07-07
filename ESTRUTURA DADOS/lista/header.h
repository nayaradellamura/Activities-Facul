// header.h
#ifndef LISTA_H  // se nao foi definido
#define LISTA_H  // define

/* estrutura do noh da lista */
typedef struct _no{
	int dado; // identificador do no
	struct _no *proximo; // quem e o ponteiro que identifica o proximo elemento
} No;

/* declaracao das funcoes (operacoes) de uma lista */
void inicializaLista(No**);

int listaEstaVazia(No*);

void imprimeLista(No*);

void insereInicio(No**, int);
void insereFinal(No**, int);

void revomeInicio(No**);
void removeFinal (No**);

#endif // encerrar a operacao




