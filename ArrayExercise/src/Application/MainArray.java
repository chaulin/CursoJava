package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.ArrayClass;

public class MainArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("How many rooms will be rented? ");
		int n = input.nextInt();
		ArrayClass[] vect = new ArrayClass[n];
		
		for(int i=0; i<vect.length; i++) {
			input.nextLine();
			String name = input.nextLine();
			String email = input.nextLine();
			int room = input.nextInt();
			vect[i]=new ArrayClass(name, email, room);
						
		}
		
		String nome = null;
		String email = null;
		int room = 0;
		
		for(int i=0; i<vect.length; i++) {
			nome += vect[i].getName();
			email += vect[i].getEmail();
			room += vect[i].getRoom();
					
		}
		
		for(int i=0; i<vect.length; i++) {
			nome += vect[i].getName();
			email += vect[i].getEmail();
			room += vect[i].getRoom();
					
		
		System.out.println("Rent #" + i + " Name: " + vect[i].getName());
		System.out.println(" Email: " + vect[i].getEmail());
		System.out.println(" Room: " + vect[i].getRoom());
		
				
		}
		
		input.close();

	}

}