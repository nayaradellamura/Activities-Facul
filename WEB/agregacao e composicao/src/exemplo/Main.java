package exemplo;

public class Main {

	public static void main(String[] args) {
		
		
		Pokemon pikachu = new Pokemon("Pikachu", "Elétrico");
		Pokemon squirtle = new Pokemon("Squirtle", "Aquático");
		Pokemon charmander = new Pokemon("Charmander", "Fogo");
		Pokemon bulbassauro = new Pokemon("Bulbassauro", "Planta");
		
		System.out.println(pikachu.imprimirDados());
		
		Treinador ash = new Treinador("Ash",12, squirtle, 1);
		System.out.println(ash.imprimirDados());
		/**Pokemon p = ash.getPokemonInicial();
		System.out.println(p.imprimirDados());**/
		
		System.out.println(ash.getPokemonInicial().imprimirDados());
		System.out.println(ash.getCertificado().imprimirDadosCertificado());
		

	}

}
