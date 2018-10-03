package week13.learningregex;

public class PreDefinedCharClasses {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		System.out.println(pra);
		// Replace any characters to #
		System.out.println(pra.replaceAll(".", "#"));
		// Replace any numbers between 0 until 9 to #
		System.out.println(pra.replaceAll("\\d", "#"));
		// Replace any non digit to #
		System.out.println(pra.replaceAll("\\D", "#"));
		// Replace any whitespace characters to #
		System.out.println(pra.replaceAll("\\s", "#"));
		// Replace any non-whitespace characters to #
		System.out.println(pra.replaceAll("\\S", "#"));
		// Replace a word character to #
		System.out.println(pra.replaceAll("\\w", "#"));
		// Replace a non-word character to #
		System.out.println(pra.replaceAll("\\W", "#"));
	}
	
}



