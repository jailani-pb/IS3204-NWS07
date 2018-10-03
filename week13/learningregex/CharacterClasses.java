package week13.learningregex;

public class CharacterClasses {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		System.out.println(pra);
		// Replace letter a to #
		System.out.println(pra.replaceAll("a", "#"));
		// Replace letter a or i or o to #
		System.out.println(pra.replaceAll("[aio]", "#"));
		// Replace any character except a, i or o to #
		System.out.println(pra.replaceAll("[^aio]", "#"));
		System.out.println(pra.replaceAll("[b-hj-np-zA-Z0-9 ]", "#"));
		// Replace all letters between a until z to #
		System.out.println(pra.replaceAll("[a-z]", "#"));
		// Replace letters a, m until t or z to #
		System.out.println(pra.replaceAll("[am-tz]", "#"));
		// Replace word Programming to #
		System.out.println(pra.replaceAll("Programming", "#"));
		// Replace all letters between A until Z to #
		System.out.println(pra.replaceAll("[A-Z]", "#"));
		// Replace all numbers between 0 until 9 to #
		System.out.println(pra.replaceAll("[0-9]", "#"));
		// Replace all letters A until Z or 0 until 9 to #
		System.out.println(pra.replaceAll("[A-Z0-9]", "#"));
		// Replace all letters d until o to #
		System.out.println(pra.replaceAll("[d-o]", "#"));
		// Replace all letters H until Q to #
		System.out.println(pra.replaceAll("[H-Q]", "#"));
		// Replace all numbers between 3 until 7 to #
		System.out.println(pra.replaceAll("[3-7]", "#"));
		// Replace all letters a until k except for c or g to #
		System.out.println(pra.replaceAll("[a-k&&[^cg]]", "#"));
	}
	
}
