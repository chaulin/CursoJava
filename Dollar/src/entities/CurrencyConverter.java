package entities;

public class CurrencyConverter {
	
	public static double DOLLARPRICE;
	public static double BUYDOLLAR;
	public static double totalPay;
	
	public static double AmmountPay(double BUYDOLLAR) {
		totalPay = DOLLARPRICE * BUYDOLLAR;
		totalPay += totalPay * 6 / 100;
		return totalPay;
	}
	

}
