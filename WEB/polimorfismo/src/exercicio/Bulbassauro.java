package exercicio;

public class Bulbassauro extends Pokemon{
	
	//  construtor
	public Bulbassauro (String nome, String tipo, String habilidade, float vida) {
		super (nome, tipo, habilidade, vida);
	}
	
	// metodo
	public void executarHabilidade (){
		System.out.println("Bulbassauro usou a habilidade: " + this.getHabilidade());
	}

}
