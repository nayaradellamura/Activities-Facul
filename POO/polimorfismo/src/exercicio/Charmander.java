package exercicio;

public class Charmander extends Pokemon{
	
	//  construtor
	public Charmander (String nome, String tipo, String habilidade, float vida) {
		super (nome, tipo, habilidade, vida);
	}
	
	// metodo
	public void executarHabilidade (){
		System.out.println("Charmander usou a habilidade: " + this.getHabilidade());
	}

}
