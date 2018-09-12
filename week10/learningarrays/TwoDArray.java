package week10.learningarrays;

import java.util.Scanner;

public class TwoDArray {

	static char[][] ticTacToeBoard = 
		{
				{' ', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', ' '}
		};
	
	public static void main(String[] args) {
		// [x][y]
//		char[][] ticTacToeBoard = new char[3][3];
//		ticTacToeBoard[2][1] = 'O';
		Scanner userInput = new Scanner(System.in);
		String input = "";
		boolean playerWins = false;
		boolean draws = false;
		char playerSymbol = 'O';
		boolean player1Turns = true;
		
		while(playerWins == false && draws == false) {
			printTicTacToeBoard();
			
			if(player1Turns == true) {
				playerSymbol = 'O';
			} else {
				playerSymbol = 'X';
			}
			
			System.out.println("Player " + playerSymbol + " turns.");
			System.out.println("Please input xy coordinate:");
			input = userInput.nextLine();
			
			if(input.length() == 2) {
				char[] inputArray = input.toCharArray();
				int x = Character.getNumericValue(inputArray[0]);
				int y = Character.getNumericValue(inputArray[1]);
				
				if(x >= 0 && x < ticTacToeBoard.length &&
						y >= 0 && y < ticTacToeBoard[x].length) {
					
					if(ticTacToeBoard[x][y] == ' ') {
						ticTacToeBoard[x][y] = playerSymbol;
						
						// Check if player wins
						// Check for all rows
						for(int rows = 0; rows < ticTacToeBoard.length; rows++) {
							if(ticTacToeBoard[rows][0] == playerSymbol &&
									ticTacToeBoard[rows][1] == playerSymbol &&
									ticTacToeBoard[rows][2] == playerSymbol) {
								playerWins = true;
								break;
							}
						}
						// Check for all columns
						if(playerWins == false) {
							for(int columns = 0; columns < 3; columns++) {
								if(ticTacToeBoard[0][columns] == playerSymbol &&
										ticTacToeBoard[1][columns] == playerSymbol &&
										ticTacToeBoard[2][columns] == playerSymbol) {
									playerWins = true;
									break;
								}
							}
						}
						// Check diagonals
						if(playerWins == false) {
							if(ticTacToeBoard[0][0] == playerSymbol &&
									ticTacToeBoard[1][1] == playerSymbol &&
									ticTacToeBoard[2][2] == playerSymbol) {
								playerWins = true;
							} else {
								if(ticTacToeBoard[0][2] == playerSymbol &&
										ticTacToeBoard[1][1] == playerSymbol &&
										ticTacToeBoard[2][0] == playerSymbol) {
									playerWins = true;
								}
							}
						}
						
						if(playerWins == false) {
							boolean containEmptySpace = false;
							for(int rows = 0; rows < 3; rows++) {
								for(int columns = 0; columns < 3; columns++) {
									if(ticTacToeBoard[rows][columns] == ' ') {
										containEmptySpace = true;
										break;
									}
								}
								if(containEmptySpace == true) {
									break;
								}
							}
							if(containEmptySpace == false) {
								draws = true;
								printTicTacToeBoard();
								System.out.println("Its a draw.");
							} else {
								if(player1Turns == true) {
									player1Turns = false;
								} else {
									player1Turns = true;
								}
							}
						} else {
							printTicTacToeBoard();
							System.out.println("Player " + playerSymbol + " wins.");
						}
						
					} else {
						System.out.println("Coordinate used.");
					}
					
				} else {
					System.out.println("Invalid coordinate.");
				}
				
			} else {
				System.out.println("Invalid input.");
			}
		}
		
	}
	
	public static void printTicTacToeBoard() {
		System.out.println("\\ y   0    1    2");
		System.out.println("x   ===============");
		for(byte x = 0; x < ticTacToeBoard.length; x++) {
			System.out.print(x + "   ");
			for(byte y = 0; y < ticTacToeBoard[x].length; y++) {
				System.out.print("| " + ticTacToeBoard[x][y] + " |");
			}
			System.out.println();
			System.out.println("    ===============");
		}
	}
	
}
