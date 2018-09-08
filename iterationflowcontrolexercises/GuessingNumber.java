package iterationflowcontrolexercises;

import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean playAgain = false;
		/*
		 * This outer while loop is just an additional implementation
		 * It was not required in the exercises but it would be great
		 * if the player can play the game again without running
		 * the application every time.
		 */
		while(true) {
			int randomNumber = (int) (Math.random() * 100);
			if(playAgain) {
				System.out.println("\nNew random number is generated.");
			}
			
			while(true) {
				System.out.println("Enter your guess (1-100):");
				try {
					int userGuess = Integer.parseInt(scanner.nextLine());
					if(userGuess == randomNumber) {
						System.out.println("Yes! the number is " + randomNumber);
						break;
					} else {
						if(userGuess < randomNumber) {
							System.out.println("Your guess is too low");
						} else {
							System.out.println("Your guess is too high");
						}
					}
				} catch(NumberFormatException e) {
					System.out.println("Invalid Input.");
				}
			}
			
			// Additional Implementation: To allow user to play again.
			System.out.println("\nDo you want to play again?");
			System.out.println("Input yes to play again or any other keys to quit.");
			String inputPlayAgain = scanner.nextLine();
			if(inputPlayAgain.toLowerCase().equals("yes")) {
				playAgain = true;
			} else {
				System.out.println("Application has been terminated.");
				break;
			}
		}
		scanner.close();
	}

}
