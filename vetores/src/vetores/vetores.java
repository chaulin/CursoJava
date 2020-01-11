package vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input= new Scanner(System.in);
		int n = input.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = input.nextDouble();		
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
			}
		double media = soma /n;
		
		System.out.printf("MEDIA DE ALTURA: %.2f%n", media);
		
	input.close();

	}

}
