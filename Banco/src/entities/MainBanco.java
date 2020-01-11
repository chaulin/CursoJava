package entities;

import java.util.Locale;
import java.util.Scanner;

public class MainBanco {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Bank b;
		char resp;

		System.out.print("Enter account number: ");
		int number = input.nextInt();

		System.out.print("Enter the account holder: ");
		input.nextLine();
		String holder = input.nextLine();

		System.out.print("Is there inicial deposit y/n ? ");
		resp = input.next().charAt(0);
		
		
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double inicialDeposit = input.nextDouble();
			b = new Bank(number, holder, inicialDeposit);

		} 
		
		else {

			b = new Bank(number, holder);
		}

		System.out.print("");

		System.out.println("Account data: " + b.toString());
		System.out.print("");
		System.out.println("Enter a deposit value ");
		double deposito = input.nextDouble();
		b.deposit(deposito);

		System.out.print("");
		System.out.println("Updated account data: " + b.toString());

		System.out.print("Enter withdraw value ");
		double saque = input.nextDouble();
		b.withdraw(saque);

		System.out.println("");
		System.out.println("Updated account data: " + b.toString());

		input.close();

	}

}
