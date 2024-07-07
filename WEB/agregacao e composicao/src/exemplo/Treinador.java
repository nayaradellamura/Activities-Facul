package exemplo;

public class Treinador {
	
	private String nome;
	private int idade;
	private Pokemon pokemonInicial;
	private CertificadoTreinador certificado;
	
	public Treinador(String nome, int idade, Pokemon pokemonInicial, int codigoTreinador) {
		this.nome = nome;
		this.idade = idade;
		this.pokemonInicial = pokemonInicial; /*agregacao*/
		this.certificado = new CertificadoTreinador(codigoTreinador); /*composicao*/
	}	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Pokemon getPokemonInicial() {
		return pokemonInicial;
	}
	
	public void setPokemonInicial(Pokemon pokemonInicial) {
		this.pokemonInicial = pokemonInicial;
	}

	public String imprimirDados() {
		return this.nome + " - " + this.idade;
	}


	public CertificadoTreinador getCertificado() {
		return certificado;
	}		
}
