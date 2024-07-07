package exercicio;

public class Carro {
	private String cor, modelo, tipo;
	private int QntPortas;
	private boolean tracao, bancoCouro, arCondicionado;
	
	//construtor Carro Casual
	public Carro (String cor, int QntPortas, String modelo) {
		this.cor = cor;
		this.QntPortas = QntPortas;
		this.modelo = modelo;
		this.tipo = "Casual";
	}
	//construtor Carro Esporte
	public Carro (String cor, int QntPortas, String modelo, boolean tracao) {
		this.cor = cor;
		this.QntPortas = QntPortas;
		this.modelo = modelo;
		this.tracao = tracao;
		this.tipo = "Esporte";
	}
	//construtor Carro Luxo
	public Carro (String cor, int QntPortas, String modelo, boolean tracao, boolean bancoCouro, boolean arCondicionado) {
		this.cor = cor;
		this.QntPortas = QntPortas;
		this.modelo = modelo;
		this.tracao = tracao;
		this.bancoCouro = bancoCouro;
		this.arCondicionado = arCondicionado;
		this.tipo = "Luxo";
	}
	
	//get e set
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getQntPortas() {
		return QntPortas;
	}
	public void setQntPortas(int qntPortas) {
		QntPortas = qntPortas;
	}
	public boolean getTracao() {
		return tracao;
	}
	public void setTracao(boolean tracao) {
		this.tracao = tracao;
	}
	public boolean getBancoCouro() {
		return bancoCouro;
	}
	public void setBancoCouro(boolean bancoCouro) {
		this.bancoCouro = bancoCouro;
	}
	public boolean getArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	private String simnao(boolean x) {
		if(x) {
			return "sim";
		} else {
			return "não";
		}
	}

	//metodo
	public void Imprimir() {
		System.out.println("Cor: " + cor);
		System.out.println("Quant. Portas: " + QntPortas);
		System.out.println("Modelo: " + modelo);
		System.out.println("Tração: " + simnao(tracao));
		System.out.println("Banco Couro: " + simnao(bancoCouro));
		System.out.println("Ar Cond.: " + simnao(arCondicionado));
		System.out.println("Tipo: " + tipo + "\n");
	}
}
