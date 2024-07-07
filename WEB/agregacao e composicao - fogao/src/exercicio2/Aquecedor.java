package exercicio2;

public class Aquecedor {
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Aquecedor (String nome) {
		this.nome = nome;
	}
	
	public String ImprimiDadosAquecedor(){
		return "Aquecedor -> " + this.nome;
	}
	
}
