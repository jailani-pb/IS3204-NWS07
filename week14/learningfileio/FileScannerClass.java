package week14.learningfileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerClass {

	public static void main(String[] args) {
		File file = new File("data.xml");
		try {
			Scanner readFile = new Scanner(file);
			StringBuilder fileContent = new StringBuilder();
			while(readFile.hasNextLine()) {
				fileContent.append(readFile.nextLine());
			}
			System.out.println(fileContent);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
