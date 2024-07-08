package exercicio2;

public class Tampa {
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tampa (String nome) {
		this.nome = nome;
	}
	
	public String ImprimiDadosTampa(){
		return "Aquecedor -> " + this.nome;
	}
}
