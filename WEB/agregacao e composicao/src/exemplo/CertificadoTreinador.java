package exemplo;

public class CertificadoTreinador {
	
	private int codigoTreinador;
	private String rank;
	
	public CertificadoTreinador(int codigo) {
		this.codigoTreinador = codigo;
		this.rank = "E";
	}
	
	public String imprimirDadosCertificado() {
		return this.codigoTreinador + " - Rank: " + this.rank;
	}
	
}
