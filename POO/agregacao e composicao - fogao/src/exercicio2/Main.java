package exercicio2;
public class Main {

	public static void main(String[] args) {
		
			Forno forno = new Forno ("Forno");
	        Painel painel = new Painel("Inox", "Preto"); 
	        Tampa tampa = new Tampa("Vidro");
	        Aquecedor aquecedor = new Aquecedor("Elétrico");

	        Fogao fogao = new Fogao("Eletrolux", forno, painel, tampa, aquecedor);

	        System.out.println(fogao.ImprimirDadosFogao());
	        System.out.println(forno.ImprimiDadosForno());
	        System.out.println(painel.ImprimiDadosPainel());
	        System.out.println(tampa.ImprimiDadosTampa());
	        System.out.println(aquecedor.ImprimiDadosAquecedor());
	}

}
