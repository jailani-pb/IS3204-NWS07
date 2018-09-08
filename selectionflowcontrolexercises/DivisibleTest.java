package selectionflowcontrolexercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisibleTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter an integer : ");
			int userInput = scanner.nextInt();
			boolean divisibleBy3 = ((userInput % 3) == 0);
			boolean divisibleBy7 = ((userInput % 7) == 0);
			System.out.println("Is 9 divisible by 3 and 7? " + (divisibleBy3 && divisibleBy7));
			System.out.println("Is 9 divisible by 3 or 7? " + (divisibleBy3 || divisibleBy7));
			System.out.println("Is 9 divisible by 3 or 7, but not both? " + ((divisibleBy3 || divisibleBy7) && !(divisibleBy3 && divisibleBy7)));
		} catch(InputMismatchException e) {
			System.out.println("Invalid input.");
		}
		
		scanner.close();
	}

}
