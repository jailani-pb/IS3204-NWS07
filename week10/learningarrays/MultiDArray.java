package week10.learningarrays;

public class MultiDArray {

	public static void main(String[] args) {
		byte[][][] value = new byte[3][3][3];
		value[1][1][1] = 15;
		value[2][1][1] = 12;
		
		for(int x = 0; x < value.length; x++) {
			for(int y = 0; y < value[x].length; y++) {
				for(int z = 0; z < value[x][y].length; z++) {
					System.out.println(value[x][y][z]);
				}
			}
		}
	}
	
}
