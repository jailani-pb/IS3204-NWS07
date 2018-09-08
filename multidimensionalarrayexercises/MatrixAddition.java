package multidimensionalarrayexercises;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		
		System.out.println("Enter 3 rows and 3 columns for matrix1 : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter 3 rows and 3 columns for matrix2 : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix2[i][j] = scanner.nextInt();
			}
		}
		
		int[][] sum = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("The sum of matrix1 and matrix2 is : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println();
		}
		
		scanner.close();
	}
	
}
