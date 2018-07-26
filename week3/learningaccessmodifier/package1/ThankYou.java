package week3.learningaccessmodifier.package1;

/*
 * if no modifier stated, Welcome.java can access ThankYou.java
 * due to ThankYou.java in same package
 */
public class ThankYou {

	/*
	 * if private modifier stated, printThankYou method
	 * can only be access by ThankYou.java
	 */
	public static void printThankYou() {
		System.out.println("Thank You");
	}
	
}
