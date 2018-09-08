package iterationflowcontrolexercises;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Additional implementation to allow user to calculate another value.
		while(true) {
			System.out.println("Please enter the term (or quit to stop) :");
			String userInput = scanner.nextLine();
			if(userInput.toLowerCase().equals("quit")) {
				break;
			} else {
				try {
					int sum = 0;
					int firstValue = 0;
					int secondValue = 1;
					int convertUserInput = Integer.parseInt(userInput);
					for(int i = 2; i <= convertUserInput; i++) {
						sum = firstValue + secondValue;
						firstValue = secondValue;
						secondValue = sum;
					}
					System.out.println("At term " + userInput 
							+ " the number is " + sum);
				} catch(NumberFormatException e) {
					System.out.println("Invalid Input.");
				}
				System.out.println();
			}
		}

		scanner.close();
	}

}
