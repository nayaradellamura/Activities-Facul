package exercicio2;

public class Fogao {
	private String fogao;
	private Aquecedor aquecedor;
	private Painel painel;
	private Forno forno;
	private Tampa tampa;
	
	public String getFogao() {
		return this.fogao;
	}
	public void setFogao(String fogao) {
		this.fogao = fogao;
	}
	
	// construtor
	Fogao(String fogao, Aquecedor aquecedor, Painel painel, Forno forno, Tampa tampa) {
	    this.fogao = fogao;
	    this.aquecedor = aquecedor;
	    this.painel = painel;
	    this.forno = forno;
	    this.tampa = tampa;
	}
	
	
	
	public String ImprimirDadosFogao() {
		return "Marca do Fogão: " + this.fogao;
	}
}