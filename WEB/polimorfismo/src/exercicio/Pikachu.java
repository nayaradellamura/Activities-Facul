package exercicio;

public class Pikachu extends Pokemon{
	
	//  construtor
	public Pikachu (String nome, String tipo, String habilidade, float vida) {
		super (nome, tipo, habilidade, vida);
	}
	
	// metodo
	@Override
	public void executarHabilidade (){
		System.out.println("Pikachu usou a habilidade: " + this.getHabilidade());
	}
}
