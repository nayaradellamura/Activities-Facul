package exercicio;

public class Main {

	public static void main(String[] args) {
		
		Endereco end = new Endereco("Rua X", "Bairro Y", "Araras", "SP", "1230000");
		Proprietario prop = new Proprietario("Railson", "11111111", "222222", end);
		
		Marca marca = new Marca("Fiat", 200, 1950, 1);
		
		Carro carro = new Carro("Uno", "Branco", 1999, marca, "11111",
				prop, 320, 2, true, 4, false, 3);
		
		System.out.println("Proprietario: " + carro.getProprietario().getNome());
		System.out.println("Modelo do carro: " + carro.getModelo());
		carro.acelerar();
		carro.acelerar();
		carro.mudarMarcha();
		carro.reduzMarcha();
		carro.reduzMarcha();
		carro.freiar();
		carro.reduzMarcha();
		
	}

}
