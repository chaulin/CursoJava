package application;

import java.util.Locale;
import java.util.Scanner;

public class mainProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		product p = new product();

	System.out.println("Enter product data: ");
	
	System.out.println("Name: ");
	p.name = input.next();
	
	System.out.println("Price: ");
	p.preco = input.nextDouble();
	
	System.out.println("Quantity in Stock: ");
	p.quantidade = input.nextInt();
	
	System.out.println();
    System.out.println("Product Data: " + p.toString());
	
    System.out.println();
    System.out.println("Enter the numbers of products to be added in Stock");
	int quantidade = input.nextInt();
	p.addProducts(quantidade);
	
	System.out.println();
    System.out.println("Updated products: " + p.toString());
	
    System.out.println();
    System.out.println("Enter the numbers of products to be removed of the Stock");
	quantidade = input.nextInt();
	p.RemoverProducts(quantidade);
	
	System.out.println();
    System.out.println("Updated products: " + p.toString());
	
	
	
	

		input.close();

	}

}
