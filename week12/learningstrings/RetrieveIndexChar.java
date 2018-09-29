package week12.learningstrings;

public class RetrieveIndexChar {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		// Retrieve the index of first instance of character "a"
		int indexFirstA = pra.indexOf("a");
		System.out.println(indexFirstA);
		// Retrieve the index of last instance of character "a"
		int indexLastA = pra.lastIndexOf("a");
		System.out.println(indexLastA);
		
		String validEmail = "jailani.rahman@pb.edu.bn";
		checkEmail(validEmail);
		
		String inValidEmail = "jailani@rahman@pb.edu.bn";
		checkEmail(inValidEmail);
		
		String inValidEmail2 = "jailani.rahman.pb.edu.bn";
		checkEmail(inValidEmail2);
		
		// Using indexOf methods, you are not limited to 1 character
		// It can be a word
		System.out.println(inValidEmail2.indexOf("pb"));
	}
	
	public static void checkEmail(String email) {
		if(email.indexOf("@") == email.lastIndexOf("@")
				&& email.indexOf("@") != -1) {
			System.out.println(email + " is valid.");
		} else {
			System.out.println(email + " is invalid.");
		}
	}
	
}
