package javafundamentalexercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertBitsToBytes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			// Assumption: the bytes conversion result is in whole number.
			System.out.print("Enter the number of bits: ");
			int bitsEntered = scanner.nextInt();
			System.out.println(bitsEntered + " bits is " + (bitsEntered / 8) + " bytes.");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
		}
		
		scanner.close();
	}

}
