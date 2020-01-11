package application;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira a quantidade de linhas da matriz");
		int n = input.nextInt();
		
		System.out.println("Insira a quantidade de colunas da matriz");
		int m = input.nextInt();

		int[][] mat = new int[n][m];
		
		System.out.println("Informe os valores da martiz");
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j]=input.nextInt();
				
			}
								
		}
		
		int c = input.nextInt();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				
				
			if (mat[i][j] == c) {
				
				System.out.println("Position " + i + "," + j + ":");
				if (j > 0) {
					System.out.println("Left: " + mat[i][j-1]);
				}
				if (i > 0) {
					System.out.println("Up: " + mat[i-1][j]);
				}
				if (j < mat[i].length-1) {
					System.out.println("Right: " + mat[i][j+1]);
				}
				if (i < mat.length-1) {
					System.out.println("Down: " + mat[i+1][j]);
				
				
			}			
					
			
			}
								
		}
		
		
		input.close();

	}

}
}