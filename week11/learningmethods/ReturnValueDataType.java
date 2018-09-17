package week11.learningmethods;

public class ReturnValueDataType {

	public static void main(String[] args) {
//		System.out.println(sum(1, 10));
//		System.out.println(sum(11, 20));
//		System.out.println(sum(41, 50));
//		System.out.println(sum(1, 10) + sum(11, 20) + sum(41, 50));
		int x = sum(1, 10);
		int y = sum(11, 20);
		int z = sum(41, 50);
//		System.out.println("Total Sum " + (x + y + z));
//		System.out.println("Total Sum " + (x + z));
		System.out.println(textTotal(x + y + z));
		System.out.println(textTotal(x + z));
		System.out.println(textTotal(x + y) + " and " + textTotal(y + z));
		printTotal(x + x);
	}
	
	public static void printTotal(int total) {
		System.out.println(textTotal(total));
	}
	
	public static String textTotal(int total) {
		return "Total Sum " + total;
	}
	
	public static int sum(int firstValue, int lastValue) {
		int sum = 0;
		for(int i = firstValue; i <= lastValue; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
