package multidimensionalarrayexercises;

import java.util.Scanner;

public class SumOfTwoDim {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int rowNumber = scanner.nextInt();
		System.out.print("Enter the number of columns : ");
		int columnNumber = scanner.nextInt();
		
		int[][] matrix = new int[rowNumber][columnNumber];
		
		System.out.println("Enter the " + rowNumber + " by " + columnNumber + " matrix : ");
		for(int i = 0; i < rowNumber; i++) {
			for(int j = 0; j < columnNumber; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		int sum = 0;
		for(int i = 0; i < rowNumber; i++) {
			for(int j = 0; j < columnNumber; j++) {
				sum += matrix[i][j];
			}
		}
		
		System.out.println("The sum of all elements is " + sum);
		
		scanner.close();
	}
	
}
