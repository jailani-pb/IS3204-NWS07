package week14.learningfileio;

import java.io.File;
import java.util.Date;

public class FileClass {

	public static void main(String[] args) {
		// For Windows:
		// "C:\\Users\\PC-NAME\\Desktop\\FILE-NAME"
		// "C:\\Users\\PC-NAME\\FILE-NAME"
		// For Mac:
		// "/Users/PC-NAME/FILE-NAME"
		File file = new File("/home/jailanihar/NWS07.txt");
		System.out.println("Does it exists? " + file.exists());
		System.out.println("Is it a Directory? " + file.isDirectory());
		System.out.println("Is it a File? " + file.isFile());
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("File name: " + file.getName());
		System.out.println("Last Modified: " + 
								new Date(file.lastModified()));
		// For the next statements, please make sure you are
		// reading file that is not important.
		File file2 = new File("/home/jailanihar/NWS07-PRA.txt");
		file.renameTo(file2);
		file2.delete();
	}
	
}



