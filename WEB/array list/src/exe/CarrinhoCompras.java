package exe;

import java.util.ArrayList;

public class CarrinhoCompras {

	private ArrayList<Produto> produtos;
	private final int capacidade;
	private int quantidadeProdutos;
	private double totalProdutos;
	
	public CarrinhoCompras(int capacidade) {
		this.capacidade = capacidade;
		this.produtos = new ArrayList<>();
		this.quantidadeProdutos = 0;
		this.totalProdutos = 0;
	}
	
	public void adicionarProduto(Produto produto) {
		if(this.quantidadeProdutos < this.capacidade) {
			this.produtos.add(produto);
			this.quantidadeProdutos++;
		}else {
			System.out.println("Carrinho Cheio!");
		}
	}
	
	public void calcularTotal() {
		for(int i=0 ; i < this.quantidadeProdutos; i++) {
			this.totalProdutos += this.produtos.get(i).getPreco();
		}
	}
	
	public double getTotalProduto() {
		return this.totalProdutos;
	}
}
