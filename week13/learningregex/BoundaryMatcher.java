package week13.learningregex;

public class BoundaryMatcher {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application IS3204";
		System.out.println(pra);
		// Replace all instance of IS3204 to #
		System.out.println(pra.replaceAll("IS3204", "#"));
		// Replace IS3204 if it is at the beginning of the string to #
		System.out.println(pra.replaceAll("^IS3204", "#"));
		// Replace IS3204 if it is at the end of the string to #
		System.out.println(pra.replaceAll("IS3204$", "#"));
		// Replace any word boundary to #
		System.out.println(pra.replaceAll("\\b", "#"));
		// Replace any non-word boundary to #
		System.out.println(pra.replaceAll("\\B", "#"));
	}
	
}
