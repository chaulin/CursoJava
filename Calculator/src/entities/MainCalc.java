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
		
		System.out.printf("A circunferência é: %.2f%n " , c);
		System.out.printf("Volume é: %.2f%n " , v);
		System.out.printf("O valor de PI é : %.2f%n" , calculator.PI);
		
		input.close();

	}

}
