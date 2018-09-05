package week9.learningarrays;

import java.util.Scanner;

public class ParallelArrays {

	public static void main(String[] args) {
		String[] username = new String[10];
		String[] password = new String[10];
		
		Scanner userInput = new Scanner(System.in);
		String input = "";
		byte menuLevel = 0;
		byte numberRegistered = 0;
		boolean loggedIn = false;
		boolean stop = false;
		while(stop == false) {
			switch(menuLevel) {
				case 0:
					System.out.println("Welcome to Account" +
							" Management");
					System.out.println("(1) Register");
					System.out.println("(2) Login");
					System.out.println("(3) Quit");
					System.out.println("Type the option number.");
					input = userInput.nextLine();
					try {
						byte optionNumber = Byte.parseByte(input);
						if(optionNumber >= 1 && optionNumber <= 3) {
							menuLevel = optionNumber;
						} else {
							System.out.println("Invalid input.");
							System.out.println("Must be between 1 - 3");
						}
						
					} catch (Exception e) {
						System.out.println("Invalid Input.");
						System.out.println("Input has to be number");
					}
					break;
				
				case 1:
					System.out.println("Registration menu");
					if(numberRegistered > 9) {
						System.out.println("Unable to Register.");
						System.out.println("It is full.");
					} else {
						System.out.println("Key in username:");
						String usernameInput = userInput.nextLine();
						System.out.println("Key in password:");
						String passwordInput = userInput.nextLine();
						username[numberRegistered] = usernameInput;
						password[numberRegistered] = passwordInput;
						System.out.println("You are registered.");
					}
					numberRegistered++;
					menuLevel = 0;
					break;
					
				case 2:
					System.out.println("Login Menu");
					System.out.println("Username:");
					String usernameInput = userInput.nextLine();
					System.out.println("Password:");
					String passwordInput = userInput.nextLine();
					for(int i = 0; i < username.length; i++) {
						if(usernameInput.equals(username[i])) {
							if(passwordInput.equals(password[i])) {
								System.out.println("You are logged in.");
								menuLevel = 0;
								loggedIn = true;
								break;
							}
						}
					}
					if(loggedIn == false) {
						System.out.println("Invalid username and password.");
						menuLevel = 0;
					}
					break;
	
				case 3:
					stop = true;
					break;
				default:
			}
		}
	}
	
}
