package exercicio2;

public class Forno {
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Forno (String nome) {
		this.nome = nome;
	}
	public String ImprimiDadosForno(){
		return "Aquecedor -> " + this.nome;
	}
}
