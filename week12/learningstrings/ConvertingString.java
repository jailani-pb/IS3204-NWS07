package week12.learningstrings;

public class ConvertingString {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		// Convert to all uppercase
		String upperCasePRA = pra.toUpperCase();
		System.out.println(upperCasePRA);
		// Conversion does not change the content of that String
		System.out.println(pra);
		// Convert to all lowercase
		String lowerCasePRA = pra.toLowerCase();
		System.out.println(lowerCasePRA);
		// Remove all trailing spaces at front and back of that String
		String quit = "   q u i t   ";
		String trimQuit = quit.trim();
		System.out.println(trimQuit);
		System.out.println(quit);
	}
	
}
