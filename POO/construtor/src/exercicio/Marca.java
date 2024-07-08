package exercicio;

public class Marca {

	private String nome;
	private int numeroModelos;
	private int anoLancamento;
	private int codigoIdentificador;
	
	public Marca(String nome, int numeroModelos, int anoLancamento, int codigoIdentificador) {
		this.nome = nome;
		this.numeroModelos = numeroModelos;
		this.anoLancamento = anoLancamento;
		this.codigoIdentificador = codigoIdentificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroModelos() {
		return numeroModelos;
	}

	public void setNumeroModelos(int numeroModelos) {
		this.numeroModelos = numeroModelos;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}
	
	
	
}
