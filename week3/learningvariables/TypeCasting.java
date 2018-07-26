package week3.learningvariables;

public class TypeCasting {

	public static void main(String[] args) {
		// From smaller range data type to larger range
		// 01111111
		byte byteData = 127;
		// 00000000000000000000000001111111
		int byteToInt = byteData;
		System.out.println(byteToInt);
		
		// From larger range data type to smaller range
		// 00000000000011110100001000111111
		int intData = 999999;
		// 00111111
		byte intToByte = (byte) intData;
		System.out.println(intToByte);
	}
	
}
