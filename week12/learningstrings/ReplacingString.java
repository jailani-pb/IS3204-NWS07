package week12.learningstrings;

public class ReplacingString {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		String replacedPRA = pra.replace(" ", "#");
		System.out.println(pra);
		System.out.println(replacedPRA);
		
		String replacedFirstPRA = pra.replaceFirst(" ", "#");
		System.out.println(replacedFirstPRA);
		
		String replacedAllPRA = pra.replaceAll("a", "#");
		System.out.println(replacedAllPRA);
		
		String replacedAllPRA2 = pra.replaceAll("[amn]", "#");
		System.out.println(replacedAllPRA2);
	}
	
}
