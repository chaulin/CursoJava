import java.util.Scanner;

import entities.Circulo;

public class circle {

	public static void main(String[] args) {
		Circulo c = new Circulo();
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira o raio do circulo");
		c.raio = input.nextDouble();
		
		System.out.printf("O Per�merto � = %.2f%n "  , c.Perimetro() );
		System.out.printf("A Area � = %.2f%n "  , c.Area());
		System.out.printf("O Diametro � = %.2f%n " , c.Diametro());
		
		input.close();
		

	}

}
