package entities;

import java.util.Locale;
import java.util.Scanner;

public class aluno {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		MainAluno a = new MainAluno();
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe o nome do aluno");
		a.name = input.next();
		
		System.out.println("Informe a nota do 1� trimestre");
		a.nota1 = input.nextDouble();
		
		System.out.println("Informe a nota do 2� trimestre");
		a.nota2 = input.nextDouble();
		
		System.out.println("Informe a nota do 3� trimestre");
		a.nota3 = input.nextDouble();
		
		a.resultFinal();
		
		
		
	    input.close();
		
		

	}

}
