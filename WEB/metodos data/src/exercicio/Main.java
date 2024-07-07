package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Data d = new Data();
		d.apresentaData();
		
		d.setDia(19);
		d.setMes(2);
		d.setAno(2024);
		d.apresentaData();
		
		d.apresentaData(true);
		
		d.apresentaData(false);
		
		d.diaSeguinte();
		d.apresentaData();
		
		d.somaTempo(15);
		d.apresentaData();
	}

}
