package iterationflowcontrolexercises;

import java.util.Scanner;

public class PaperRockScissorLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int roundNumber = 0;
		int playerScore = 0;
		int computerScore = 0;
		while(true) {
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
				int userChoice = Integer.parseInt(scanner.nextLine());
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
							playerScore++;
						} else {
							System.out.println(result + "You Lose");
							computerScore++;
						}
					}
					roundNumber++;
					
				} else {
					System.out.println(userChoice + " is not the correct choice.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input.");
			}
			System.out.println();
			System.out.println("Enter y to play again:");
			String inputPlayAgain = scanner.nextLine();
			if(!inputPlayAgain.toLowerCase().equals("y")) {
				System.out.println("Application has been terminated.");
				System.out.println("In the total of " + roundNumber + " rounds" 
						+ ", You scored " + playerScore 
						+ ", the computer scored " + computerScore);
				break;
			}
		}
		scanner.close();
	}
	
}
