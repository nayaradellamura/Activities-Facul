package exercicio;

public class Carro {

	private String modelo;
	private String cor;
	private int ano;
	private Marca marca;
	private String chassi;
	private Proprietario proprietario;
	private final int velocidadeMaxima;
	private int velocidadeAtual;
	private int numeroPortas;
	private boolean temTetoSolar;
	private final int numeroMarchas;
	private boolean temCambioAutomatico;
	private double volumeCombustivel;
	private int marchaAtual;
	
	public Carro(String modelo, String cor, int ano, Marca marca, 
			String chassi, Proprietario proprietario, int velocidadeMaxima,
			int numeroPortas, boolean tetoSolar, int numeroMarchas,
			boolean cambio, double volumeCombustivel) {		
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.marca = marca;
		this.chassi = chassi;
		this.proprietario = proprietario;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = 0;
		this.numeroPortas = numeroPortas;
		this.temTetoSolar = tetoSolar;
		this.numeroMarchas = numeroMarchas;
		this.temCambioAutomatico = cambio;
		this.volumeCombustivel = volumeCombustivel;	
		this.marchaAtual = 0;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public boolean isTemTetoSolar() {
		return temTetoSolar;
	}

	public void setTemTetoSolar(boolean temTetoSolar) {
		this.temTetoSolar = temTetoSolar;
	}

	public boolean isTemCambioAutomatico() {
		return temCambioAutomatico;
	}

	public void setTemCambioAutomatico(boolean temCambioAutomatico) {
		this.temCambioAutomatico = temCambioAutomatico;
	}

	public double getVolumeCombustivel() {
		return volumeCombustivel;
	}

	public void setVolumeCombustivel(double volumeCombustivel) {
		this.volumeCombustivel = volumeCombustivel;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public int getNumeroMarchas() {
		return numeroMarchas;
	}	
	
	public void acelerar() {
		if(this.velocidadeAtual < this.velocidadeMaxima) {
			this.velocidadeAtual++;
		}
		
		System.out.println(this.velocidadeAtual);
			
	}
	
	public void freiar() {
		this.velocidadeAtual = 0;
	}
	
	public void mudarMarcha() {
		if(this.marchaAtual < this.numeroMarchas) {
			this.marchaAtual++;
		}
		
		System.out.println("Marcha atual: " + this.marchaAtual);
	}
	
	public void reduzMarcha() {
		if(this.marchaAtual > 0) {
			this.marchaAtual--;
		}else {
			if(this.velocidadeAtual == 0) {
				this.marchaAtual--;
			}
		}
		System.out.println(this.marchaAtual);
	}
	
	public void autonomia(double consumo) {
		System.out.println("Você pode rodar mais " + this.volumeCombustivel*consumo  + "km");
	}
}
