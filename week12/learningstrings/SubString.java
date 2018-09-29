package week12.learningstrings;

public class SubString {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		// Obtain substring with specific start and end index
		String subPRA = pra.substring(7, 18);
		System.out.println(subPRA);
		System.out.println(pra);
		String subPRA2 = pra.substring(0, 18);
		System.out.println(subPRA2);
		
		// Obtain substring with specific start index
		// until the end of the string
		String subPRA3 = pra.substring(10);
		System.out.println(subPRA3);
		
		String email = "jailani.rahman@pb.edu.bn";
		String username = email.substring(0, email.indexOf("@"));
		System.out.println(username);
		String domain = email.substring(email.indexOf("@") + 1);
		System.out.println(domain);
		
		String email2 = "abu.bakar@pb.edu.bn";
		String username2 = email2.substring(0, email2.indexOf("@"));
		System.out.println(username2);
		String domain2 = email2.substring(email2.indexOf("@") + 1);
		System.out.println(domain2);
	}
	
}
