import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;


public class cursoClass {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Digite os lados A do triangulo X: ");
	    x.a = input.nextDouble();
	    x.b = input.nextDouble();
	    x.c = input.nextDouble();
	  	
	    System.out.println("Digite os lados B do triangulo X: ");
	    y.a = input.nextDouble();
	    y.b = input.nextDouble();
	    y.c = input.nextDouble();
		
	    double areax = x.area();
	    double areay = y.area();
	    
	    System.out.println("A area do Trinagulo X é :" + areax );
	    System.out.println("A area do Trinagulo Y é :" + areay );
	    
	    if (areax > areay) {
	    	
	    	System.out.println("Triangulo X é o maior");
	    	
	    	}else {
	    		
	    		System.out.println("Triangulo Y é o maio");    	}
	    
	    
		input.close();

	}

}
