package exercicio;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon ("Pokemon","neutro","soco",100);
		
		Pokemon p2 = new Pikachu ("Pikachu","elétrico","choque do trovão",80);
		
		Pokemon p3 = new Bulbassauro ("Bulbassauro","grama","sobreflorescimento",180);
		
		Pokemon p4 = new Charmander ("Charmander","fogo","chuva de lava",120);
		
		Pokemon p5 = new Squirtle ("Squirtle","água","jato de água",100);
		
		ArrayList<Pokemon> p = new ArrayList<>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		for(Pokemon pokemon: p) {
			pokemon.executarHabilidade();
		}
				
		
	}

}
