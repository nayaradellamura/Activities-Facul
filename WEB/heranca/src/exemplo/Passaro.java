package exemplo;

public class Passaro extends Animal {

	private String coloracaoPenas;
	
	public Passaro(String nome, String som, String cor) {
		super(nome,som);
		this.coloracaoPenas = cor;
	}	

	public String getColoracaoPenas() {
		return coloracaoPenas;
	}

	public void setColoracaoPenas(String coloracaoPenas) {
		this.coloracaoPenas = coloracaoPenas;
	}
	
	public void imprimir() {	
		super.imprimir();
		System.out.println("Coloracao Penas: " + this.coloracaoPenas);
		
	}
	
}
