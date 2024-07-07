package exe;

public class Main {

	public static void main(String[] args) {
		
		Produto p = new Produto("Computador", 3500);
		Produto p2 = new Produto("Caneta", 1.50);
		Produto p3 = new Produto("Mouse", 100);
		
		CarrinhoCompras carrinho = new CarrinhoCompras(3);
		carrinho.adicionarProduto(p);
		carrinho.adicionarProduto(p3);
		carrinho.adicionarProduto(p2);

		carrinho.calcularTotal();
		System.out.println("Total do Carrinho: " + carrinho.getTotalProduto());
		
		
	}

}
