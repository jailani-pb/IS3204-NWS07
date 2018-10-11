package week13.learningregex;

public class Quantifiers {

	public static void main(String[] args) {
		String msg = "abbbbbcccddddd";
		// zero or more
		System.out.println(msg.replaceAll("^ab*", "#"));
		System.out.println(msg.replaceAll("^af*", "#"));
		// one or more
		System.out.println(msg.replaceAll("^ab+", "#"));
		System.out.println(msg.replaceAll("^af+", "#"));
		// exactly n times, {n}
		System.out.println(msg.replaceAll("^ab{5}", "#"));
		System.out.println(msg.replaceAll("^ab{7}", "#"));
		System.out.println(msg.replaceAll("^ab{3}", "#"));
		// zero or one
		System.out.println(msg.replaceAll("^ab?", "#"));
		System.out.println(msg.replaceAll("^af?", "#"));
		// at least n times, {n,}
		System.out.println(msg.replaceAll("^ab{5,}", "#"));
		System.out.println(msg.replaceAll("^ab{7,}", "#"));
		// at least n times but not more than m times, {n,m}
		System.out.println(msg.replaceAll("^ab{3,7}", "#"));
		System.out.println(msg.replaceAll("^ab{3,4}", "#"));
	}
	
}




