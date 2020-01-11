import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe em numero o tamanho da matriz");
		int n = input.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = input.nextInt();
				
			}

		}

		System.out.println("Main diagonal numbers: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");

		}

		System.out.println();

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}

			}

		}

		System.out.println("Negative Numbers: " + count);

		input.close();
	}
}