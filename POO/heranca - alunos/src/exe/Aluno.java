package exe;

public class Aluno {

	private int ra;
	private String nome;
	private boolean matriculado;
	
	public Aluno(int ra, String nome, boolean matriculado) {
		this.ra = ra;
		this.nome = nome;
		this.matriculado = matriculado;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
	
	public void imprimir() {
		System.out.println("RA: " + this.ra);
		System.out.println("Nome: " + this.nome);
		System.out.println("Matriculado: " + this.matriculado);
	}
	
	
	
}
