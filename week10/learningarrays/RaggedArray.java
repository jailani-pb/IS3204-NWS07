package week10.learningarrays;

public class RaggedArray {

	public static void main(String[] args) {
		byte[][] age = 
			{
					{1},
					{2, 3},
					{4},
					{5, 6, 7}
			};
		
		for(int x = 0; x < age.length; x++) {
			for(int y = 0; y < age[x].length; y++) {
				System.out.println(age[x][y]);
			}
		}
	}
	
}



