package javafundamentalexercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseOfInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter an integer between 100 and 999: ");
			int userInput = scanner.nextInt();
			if((userInput >= 100) && (userInput <= 999)) {
				int firstTwoDigits = userInput / 10;
				int firstDigit = firstTwoDigits / 10;
				int secondDigit = firstTwoDigits % 10;
				int thirdDigit = userInput % 10;
				String reverseDigits = thirdDigit + "" + secondDigit + "" + firstDigit;
				System.out.println("The reverse of " + userInput + " is " + reverseDigits);
			} else {
				System.out.println(userInput + " is not between 100 and 999.");
			}
		} catch(InputMismatchException e) {
			System.out.println("Invalid input.");
		}
		
		scanner.close();
	}
	
}
