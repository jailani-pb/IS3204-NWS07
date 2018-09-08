package singledimensionalarrayexercises;

import java.util.Scanner;

public class SortingNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter ten numbers :");
		int[] numbers = new int[10];
		for(int i = 0; i < 10; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		for(int i = 1; i < 10; i++) {
			for(int j = i; j > 0 && numbers[j-1] > numbers[j]; j--) {
				int temp = numbers[j];
				numbers[j] = numbers[j-1];
				numbers[j-1] = temp;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		scanner.close();
	}
	
}
