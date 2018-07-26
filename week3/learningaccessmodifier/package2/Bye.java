package week3.learningaccessmodifier.package2;

/*
 * if no modifier stated, Welcome.java cannot access Bye.java
 * due to Bye.java in different package
 */
public class Bye {

	public static void printBye() {
		System.out.println("Bye");
	}
	
}
