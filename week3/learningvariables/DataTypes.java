package week3.learningvariables;

public class DataTypes {

	public static void main(String[] args) {
		byte byteData = 10;
		byte byteData2 = 127;
		byte addBothBytes = (byte) (byteData + byteData2);
		System.out.println(addBothBytes);
		byteData2++;
		System.out.println(byteData2);
		
		short shortData = 30;
		System.out.println(shortData);
		
		int intData = 50;
		System.out.println(intData);
		
		long longData = 1234567891011L;
		System.out.println(longData);
		
		float floatData = 3.14F;
		System.out.println(floatData);
		
		double doubleData = 3.14;
		System.out.println(doubleData);
	}
	
}
