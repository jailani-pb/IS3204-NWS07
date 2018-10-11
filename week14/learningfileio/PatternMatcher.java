package week14.learningfileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		File file = new File("data.xml");
		try {
			Scanner readFile = new Scanner(file);
			StringBuilder fileContent = new StringBuilder();
			while(readFile.hasNextLine()) {
				fileContent.append(readFile.nextLine());
			}
			System.out.println(fileContent);
			
			Pattern fileFormat = 
				Pattern.compile("^<students>.*</students>$");
			Matcher fileMatcher = fileFormat.matcher(fileContent);
			
			if(fileMatcher.matches()) {
				System.out.println("File is compatible.");
				
				Pattern studentFormat =
					Pattern.compile(
							  "<student>"
							+ "<id>(\\d+?)</id>"
							+ "<name>(\\w+?)</name>"
							+ "</student>"
					);
				Matcher studentMatcher =
						studentFormat.matcher(fileContent);
				
				while(studentMatcher.find()) {
					System.out.println(studentMatcher.start());
					System.out.println(studentMatcher.group(1));
					System.out.println(studentMatcher.group(2));
					System.out.println(studentMatcher.end());
				}
				
			} else {
				System.out.println("File is not compatible.");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
