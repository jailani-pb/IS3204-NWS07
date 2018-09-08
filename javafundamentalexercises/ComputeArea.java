package javafundamentalexercises;

public class ComputeArea {

	public static void main(String[] args) {
		// double data type is fine as well.
		float side = 4.0f;
		float height = 6.0f;
		float pi = 3.14f;
		float radius = 8.0f;
		
		System.out.printf("The area of square is %.1f%n", side * side);
		System.out.printf("The area of triangle is %.1f%n", 1f / 2f * side * height);
		System.out.printf("The area of circle is %.2f%n", pi * radius * radius);
	}

}
