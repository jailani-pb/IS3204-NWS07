package week10.learningarrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// [x][y]
//		char[][] ticTacToeBoard = new char[3][3];
//		ticTacToeBoard[2][1] = 'O';
		
		char[][] ticTacToeBoard = 
			{
					{' ', ' ', ' '},
					{' ', ' ', ' '},
					{' ', ' ', ' '}
			};
		Scanner userInput = new Scanner(System.in);
		String input = "";
		
		System.out.println("Please input xy coordinate:");
		input = userInput.nextLine();
		
		if(input.length() == 2) {
			char[] inputArray = input.toCharArray();
			int x = Character.getNumericValue(inputArray[0]);
			int y = Character.getNumericValue(inputArray[1]);
			
			if(x >= 0 && x < ticTacToeBoard.length &&
					y >= 0 && y < ticTacToeBoard[x].length) {
				
				if(ticTacToeBoard[x][y] == ' ') {
					ticTacToeBoard[x][y] = 'O';
				} else {
					System.out.println("Coordinate used.");
				}
				
			} else {
				System.out.println("Invalid coordinate.");
			}
			
		} else {
			System.out.println("Invalid input.");
		}
		
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
