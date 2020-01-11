package entities;

import java.util.Locale;
import java.util.Scanner;

public class mainSalario {

	public static void main(String[] args) {
		Salario s = new Salario();
		Scanner input = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter employee name");
		s.name = input.next();
		
		System.out.println("Enter the salary");
		s.GrossSalary = input.nextDouble();
					
		System.out.println("Employee data: " + s.name + " , " + s.netSalary() );
		
		System.out.println("Which percentage to increase salary? ");
		double perc = input.nextDouble();
		s.IncreaseSalary(perc);
		
		System.out.println("Updated data: " + s.name + " , " + s.netSalary() );
		 input.close();

	}

}
