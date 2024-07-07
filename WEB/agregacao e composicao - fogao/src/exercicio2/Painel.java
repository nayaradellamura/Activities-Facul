package exercicio2;

public class Painel {
	private String nome;
	private String botao;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getBotao() {
		return botao;
	}
	
	public void setBotao(String botao) {
		this.botao = botao;
	}

	public Painel (String nome, String botao) {
		this.nome = nome;
		this.botao = botao;
	}
	
	public String ImprimiDadosPainel(){
		return "Painel -> " + this.nome + " Botão -> " + this.botao;
	}
}
