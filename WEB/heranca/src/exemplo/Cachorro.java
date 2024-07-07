package exemplo;

public class Cachorro extends Animal {
	
	private String raca;
	
	public Cachorro(String nome, String som, String raca) {
		super(nome,som);
		this.raca = raca;
	}	

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Raca: " + this.raca);
	}
	
}
