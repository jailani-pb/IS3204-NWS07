package selectionflowcontrolexercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PaperRockScissor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int computerChoice = (int) ((Math.random() * 100) % 3);
		String computerChoiceString;
		if(computerChoice == 0) {
			computerChoiceString =  "scissor";
		} else if(computerChoice == 1) {
			computerChoiceString = "rock";
		} else {
			computerChoiceString = "paper";
		}
		
		try {
			System.out.println("Enter scissor (0), rock (1), paper (2)");
			int userChoice = scanner.nextInt();
			if((userChoice >= 0) && (userChoice <= 2)) {
				String userChoiceString;
				String result;
				boolean isDraw = false;
				boolean isUserWin = false;
				if(userChoice == 0) {
					userChoiceString =  "scissor";
					if(computerChoice == 0) {
						isDraw = true;
					}
					if(computerChoice == 1) {
						isUserWin = false;
					}
					if(computerChoice == 2) {
						isUserWin = true;
					}
				} else if(userChoice == 1) {
					userChoiceString = "rock";
					if(computerChoice == 0) {
						isUserWin = true;
					}
					if(computerChoice == 1) {
						isDraw = true;
					}
					if(computerChoice == 2) {
						isUserWin = false;
					}
				} else {
					userChoiceString = "paper";
					if(computerChoice == 0) {
						isUserWin = false;
					}
					if(computerChoice == 1) {
						isUserWin = true;
					}
					if(computerChoice == 2) {
						isDraw = true;
					}
				}
				
				result = "The computer is " + computerChoiceString + ". You are " + userChoiceString + ". ";
				if(isDraw) {
					System.out.println(result + "It is a draw");
				} else {
					if(isUserWin) {
						System.out.println(result + "You Win");
					} else {
						System.out.println(result + "You Lose");
					}
				}
				
			} else {
				System.out.println(userChoice + " is not the correct choice.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
		}
		System.out.println();
		scanner.close();
	}
	
}
