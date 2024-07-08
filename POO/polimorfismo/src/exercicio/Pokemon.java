package exercicio;

public class Pokemon {
	private String nome;
	private String tipo;
	private String habilidade;
	private float vida;
	
	// get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getHabilidade() {
		return habilidade;
	}
	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	public float getVida() {
		return vida;
	}
	public void setVida(float vida) {
		this.vida = vida;
	}
	
	// construtor
	public Pokemon (String nome, String tipo, String habilidade, float vida) {
		this.nome = nome;
		this.tipo = tipo;
		this.habilidade = habilidade;
		this.vida = vida;
	}
	
	// metodo
	public void executarHabilidade (){
		System.out.println("Pokemon usou a habilidade: " + this.habilidade);
	}
	
	
}
