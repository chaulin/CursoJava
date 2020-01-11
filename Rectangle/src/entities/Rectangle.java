package entities;

import java.util.Locale;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		rectangleClass r = new rectangleClass();		
				
		
		System.out.println("Entre com a altura do retangulo");
		r.width = input.nextDouble();
		
		System.out.println("Entre com a largura do retangulo");
		r.height = input.nextDouble();
		
		System.out.println("A área é : " + r.Area());
		System.out.println("O perimetro é : " + r.Perimeter());
		System.out.println("A diagonal é : " + r.Diagonal());
		
		input.close();
	}

}
