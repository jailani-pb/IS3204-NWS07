package singledimensionalarrayexercises;

public class PrintingAlphabet {

	public static void main(String[] args) {
		char[] alphabet = {
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		};
		
		int fromA, fromZ;
		for(fromA = 0, fromZ = alphabet.length-1;
				fromA < alphabet.length && fromZ >= 0;
				fromA++, fromZ--) {
			System.out.print(alphabet[fromA] + " " + alphabet[fromZ] + " ");
		}
	}
	
}
