package week11.learningmethods;

public class BasicMethods {

	public static void main(String[] args) {
		sum(1, 10);
		sum(11, 20);
		sum(21, 30);
	}
	
	public static void sum(int firstValue, int lastValue) {
		int sum = 0;
		for(int i = firstValue; i <= lastValue; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of " + firstValue + " to " + lastValue
				+ ": " + sum);
	}
	
}
