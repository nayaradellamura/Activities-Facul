package exercicio2;

public class Botao {
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Botao (String nome) {
		this.nome = nome;
	}
	public String ImprimiDadosBotao(){
		return "Aquecedor -> " + this.nome;
	}
}
