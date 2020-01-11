package entities;

public class Estoque {
	
	public String produto;
	public double preco;
	public int quantidade;
	
	public Estoque(String produto, double preco, int quantidade ) {
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;		
		
	}
	
	
	public double ValorTotalEstoque () {
		return quantidade * preco;
				
	}
	
	public double AdicionarProdutoEstoque(int qtd) {
		return this.quantidade += qtd;
			
	}
	
	public double RemoverProdutoEstoque(int rem) {
		return this.quantidade -= rem;

}
}