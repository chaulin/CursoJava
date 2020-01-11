package entities;
import java.util.Locale;
import java.util.Scanner;

public class MainEstoque {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		System.out.println("Informe o produto: ");
		String produto = input.next();
		
		System.out.println("Informe o preço: ");
		double preco = input.nextDouble();
		
		System.out.println("Informe a quantidade :");
		int quantidade = input.nextInt();
		
		Estoque e = new Estoque(produto, preco, quantidade);
		
		System.out.println(" ***Dados dos produtos cadastrados *** " + " , "+ e.produto + " , " + e.preco + " , " + e.quantidade);
		System.out.println(" ***Valor total do estoque ***" + e.ValorTotalEstoque());
		
		System.out.println(" ");
		
		System.out.println("Informe a quantidade de produtos a acrescentar no estoque :");
		int newEst = input.nextInt();
		e.AdicionarProdutoEstoque(newEst);
		
			
		System.out.println(" ***Dados dos produtos cadastrados *** " + " , "+ e.produto + " , " + e.preco + " , " + e.quantidade);
		System.out.println(" ***Valor total do estoque ***" + e.ValorTotalEstoque());
		
		System.out.println(" ");
		
		System.out.println("Informe a quantidade de produtos a remover do estoque :");
		newEst = input.nextInt();
		e.RemoverProdutoEstoque(newEst);
		
		System.out.println(" ***Dados dos produtos cadastrados *** " + " , "+ e.produto + " , " + e.preco + " , " + e.quantidade);
		System.out.println(" ***Valor total do estoque ***" + e.ValorTotalEstoque());
		
		input.close();
		
		
		
	}

}
