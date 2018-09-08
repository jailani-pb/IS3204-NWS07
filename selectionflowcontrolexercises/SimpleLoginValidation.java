package selectionflowcontrolexercises;

import java.util.Scanner;

public class SimpleLoginValidation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your username : ");
		String username = scanner.nextLine();
		System.out.println("Please enter your password : ");
		String password = scanner.nextLine();
		boolean isUsernameCorrect = username.equals("fitri");
		boolean isPasswordCorrect = password.equals("12345");
		if(isUsernameCorrect && isPasswordCorrect) {
			System.out.println("Welcome " + username);
		} else {
			if(!isUsernameCorrect) {
				System.out.println("Invalid username");
			}
			if(!isPasswordCorrect) {
				System.out.println("Password does not match");
			}
		}
		scanner.close();
	}

}
