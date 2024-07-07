package exemplo;

public class Pokemon {

	private String nome;
	private String tipo;
	
	public Pokemon(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public String imprimirDados() {
		return this.nome + " - " + this.tipo;
	}
}
