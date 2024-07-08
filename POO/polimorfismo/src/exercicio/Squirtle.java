package exercicio;

public class Squirtle extends Pokemon{
	
	//  construtor
	public Squirtle (String nome, String tipo, String habilidade, float vida) {
		super (nome, tipo, habilidade, vida);
	}
	
	// metodo
	public void executarHabilidade (){
		System.out.println("Squirtle usou a habilidade: " + this.getHabilidade());
	}

}
