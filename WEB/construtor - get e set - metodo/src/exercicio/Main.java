package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Carro Carro1 = new Carro("Vermelho",4,"Fusca");
		Carro1.Imprimir();
		
		Carro Carro2 = new Carro("Azul",4,"Toro",true);
		Carro2.Imprimir();
		
		Carro Carro3 = new Carro("Preto",4,"Royal Royce",true,true,true);
		Carro3.Imprimir();
		
		
	}

}
