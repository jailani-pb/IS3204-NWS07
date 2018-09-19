package week11.learningstrings;

public class InternedString {

	public static void main(String[] args) {
		// Constructing String
		String s1 = "Java";
		String s2 = new String("Java");
		char[] c1 = {'J', 'a', 'v', 'a'};
		String s3 = new String(c1);
		
		// Strings are Immutable (refer to lecture notes)
		
		// Interned String
		String s4 = "HTML";
		String s5 = "HTML";
		String s6 = new String("HTML");
		System.out.println("s4 == s5 is " + (s4 == s5));
		System.out.println("s4 == s6 is " + (s4 == s6));
		// s4 and s5 is referencing to the same memory location
		// s6 is referencing to different memory location
		// So using == operator is not a good way to compare String
		
		// String comparison
		// Comparison that returns boolean
		System.out.println("s4.equals(s5) is " + s4.equals(s5));
		System.out.println("s4.equals(s6) is " + s4.equals(s6));
		System.out.println("\"html\".equalsIgnoreCase(s6) is " 
				+ "html".equalsIgnoreCase(s6));
		// Comparison that returns int based on each Character
		// unicode value
		System.out.println("s4.compareTo(s5) is " + s4.compareTo(s5));
		System.out.println("s4.compareTo(s6) is " + s4.compareTo(s6));
		System.out.println("s1.compareTo(s5) is " + s1.compareTo(s5));
		System.out.println("s5.compareToIgnoreCase(s1) is " 
				+ s5.compareToIgnoreCase(s1));
		
		// Comparison to check the beginning or end word of a String
		String ins03Student = "ins03_12345678@pb.edu.bn";
		String nws07Student = "nws07_12312312@pb.edu.bn";
		System.out.println(ins03Student.startsWith("nws07"));
		System.out.println(nws07Student.startsWith("nws07"));
		System.out.println(ins03Student.endsWith("@pb.edu.bn"));
		
		// Retrieve the number of characters in a String
		String zeroToNine = "0123456789";
		System.out.println(zeroToNine + " length is " 
				+ zeroToNine.length());
		
		// Retrieve a specific characters in a String
		System.out.println("Index 6 of " + zeroToNine + " is " 
				+ zeroToNine.charAt(6));
		String aToL = "ABCDEFGHIJKL";
		System.out.println("Index 2 of " + aToL + " is " 
				+ aToL.charAt(2));
		
		// Combine (Concatenate) Strings
		System.out.println(s1 + " / " + s5);
		System.out.println(s1.concat(" / ").concat(s5));
		System.out.println(s1.concat(" / ".concat(s5)));
	}
	
}



