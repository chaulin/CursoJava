package entities;

import java.util.Locale;
import java.util.Scanner;

public class MainCalc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o raio: ");
		double raio = input.nextDouble();
		double c = calculator.Circumference(raio);
		double v = calculator.Volume(raio);
		
		System.out.printf("A circunfer�ncia �: %.2f%n " , c);
		System.out.printf("Volume �: %.2f%n " , v);
		System.out.printf("O valor de PI � : %.2f%n" , calculator.PI);
		
		input.close();

	}

}
