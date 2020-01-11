package entities;

import java.util.Locale;
import java.util.Scanner;

public class MainDollar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("What´s the dollar price? ");
	    CurrencyConverter.DOLLARPRICE = input.nextDouble();
	    
	    System.out.println("How many dollars will be bought?");
	    double dollar = input.nextDouble();
	    CurrencyConverter.AmmountPay(dollar);
	    
	    System.out.printf("Amount to be paid in Reais %.2f%n " , CurrencyConverter.AmmountPay(dollar));
	    
	    input.close();
		
	}

}
