package javafundamentalexercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int firstNumber = (int) (Math.random() * 100);
			int secondNumber = (int) (Math.random() * 100);
			System.out.println("What is " + firstNumber + " + " + secondNumber + " ?");
			int userAnswer = scanner.nextInt();
			boolean isCorrect = ((firstNumber+secondNumber) == userAnswer) ? true : false;
			System.out.println(firstNumber + " + " + secondNumber + " = " + userAnswer + " is " + isCorrect);
		} catch(InputMismatchException e) {
			System.out.println("Invalid input.");
		}
		scanner.close();
	}
	
}
