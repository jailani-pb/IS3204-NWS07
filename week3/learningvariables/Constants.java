package week3.learningvariables;

public class Constants {

	public static void main(String[] args) {
		final int MULTIPLIER = 4;
		final String MESSAGE = "Multiplied Square Area";
		int areaSquare = 20;
		int multipliedSquare;
		
		multipliedSquare = areaSquare * MULTIPLIER;
		System.out.println(MESSAGE);
		System.out.println(multipliedSquare);
		
		areaSquare = 40;
		
		multipliedSquare = areaSquare * MULTIPLIER;
		System.out.println(MESSAGE);
		System.out.println(multipliedSquare);
	}
	
}
