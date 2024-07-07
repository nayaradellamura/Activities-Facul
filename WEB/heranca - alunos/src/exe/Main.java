package exe;

public class Main {

	public static void main(String[] args) {

		Aluno a = new Aluno(1, "Railson", true);
		a.imprimir();
		
		System.out.println("------------------");
		
		AlunoGrad a2 = new AlunoGrad(2, "Pianca", true, 5);
		a2.imprimir();		

		System.out.println("------------------");
		
		AlunoPosGrad a3 = new AlunoPosGrad(3, "Julya", true, "Antonello", "Um estudo sobre não ter nem ideia.");
		a3.imprimir();
		
		System.out.println("------------------");
		
		
	}

}
