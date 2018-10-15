package week14.learningfileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleManagingXMLFile {

	static Scanner scanUserInput = new Scanner(System.in);
	static File file;
	static StringBuilder fileContent = new StringBuilder();
	static String userInput;
	
	public static void main(String[] args) {
		System.out.println("Input xml file location:");
		userInput = scanUserInput.nextLine();
		file = new File(userInput);
		
		boolean isFileAvailable = false;
		while(!isFileAvailable) {
			if(file.exists() && file.isFile()) {
				try {
					Scanner readFile = new Scanner(file);
					fileContent = new StringBuilder();
					while(readFile.hasNextLine()) {
						fileContent.append(readFile.nextLine());
					}
					Pattern filePattern = Pattern.compile(
							"^<aList>.*</aList>$");
					Matcher fileMatcher = filePattern.matcher(fileContent);
					if(fileMatcher.matches()) {
						isFileAvailable = true;
						System.out.println("Formatting is valid.");
						System.out.println(fileContent);
					} else {
						isFileAvailable = false;
						System.out.println("Formatting is invalid.");
						System.out.println(fileContent);
						System.out.println("Re-input xml file location:");
						userInput = scanUserInput.nextLine();
						file = new File(userInput);
					}
					readFile.close();
				} catch (FileNotFoundException e) {
					System.out.println("File is not available.");
					System.out.println(file.getAbsolutePath());
				}
			} else {
				System.out.println("File is not available.");
				System.out.println(file.getAbsolutePath());
				if(!file.isDirectory()) {
					System.out.println("Do you want to create a new file?");
					System.out.println("yes/no");
					userInput = scanUserInput.nextLine();
					if(userInput.trim().equalsIgnoreCase("yes")) {
						try {
							PrintWriter writeFile = new PrintWriter(file);
							writeFile.println("<aList>");
							writeFile.println("</aList>");
							writeFile.close();
							isFileAvailable = true;
							fileContent = new StringBuilder("<aList></aList>");
						} catch (FileNotFoundException e) {
							isFileAvailable = false;
							System.out.println("Directory location invalid.");
							System.out.println("Re-input xml file location.");
							userInput = scanUserInput.nextLine();
							file = new File(userInput);							
						}
					} else {
						System.out.println("Re-input xml file location.");
						userInput = scanUserInput.nextLine();
						file = new File(userInput);
					}
				} else {
					System.out.println("It is not a file.");
					System.out.println(file.getAbsolutePath());
					System.out.println("Re-input xml file location.");
					userInput = scanUserInput.nextLine();
					file = new File(userInput);
				}
			}
		}
		
		Pattern dataPattern = Pattern.compile("<a><b>(.*?)</b><c>(.*?)</c></a>");
		while(true) {
			System.out.println("Type new data for <b></b>: (q to quit)");
			String bData = scanUserInput.nextLine();
			if(bData.trim().equalsIgnoreCase("q")) {
				System.out.println("Application terminated.");
				System.exit(0);
			}
			System.out.println("Type new data for <c></c>: (q to quit)");
			String cData = scanUserInput.nextLine();
			if(cData.trim().equalsIgnoreCase("q")) {
				System.out.println("Application terminated.");
				System.exit(0);
			}
			Matcher dataMatcher = dataPattern.matcher(fileContent);
			boolean isDataExists = false;
			int dataStart = 0;
			int dataEnd = 0;
			while(dataMatcher.find()) {
				if(dataMatcher.group(1).equals(bData)) {
					if(dataMatcher.group(2).equals(cData)) {
						dataStart = dataMatcher.start();
						dataEnd = dataMatcher.end();
						isDataExists = true;
						break;
					}
				}
			}
			if(isDataExists) {
				System.out.println("Data already exists.");
				System.out.println("Do you want to modify?");
				System.out.println("yes/no");
				userInput = scanUserInput.nextLine();
				if(userInput.trim().equalsIgnoreCase("yes")) {
					System.out.println("Type new data for <b></b>: (q to quit)");
					String editBData = scanUserInput.nextLine();
					if(editBData.trim().equalsIgnoreCase("q")) {
						System.out.println("Application terminated.");
						System.exit(0);
					}
					System.out.println("Type new data for <c></c>: (q to quit)");
					String editCData = scanUserInput.nextLine();
					if(editBData.trim().equalsIgnoreCase("q")) {
						System.out.println("Application terminated.");
						System.exit(0);
					}
					StringBuilder editData = new StringBuilder();
					editData.append("<a>");
					editData.append("<b>");
					editData.append(editBData);
					editData.append("</b>");
					editData.append("<c>");
					editData.append(editCData);
					editData.append("</c>");
					editData.append("</a>");
					fileContent.replace(dataStart, dataEnd, editData.toString());
					
					try {
						PrintWriter writeFile = new PrintWriter(new FileWriter(file, false));
						writeFile.println(fileContent);
						writeFile.close();
					} catch (IOException e) {
						System.out.println("Failed to write file.");
					}
				}
			} else {
				StringBuilder newData = new StringBuilder();
				newData.append("<a>");
				newData.append("<b>");
				newData.append(bData);
				newData.append("</b>");
				newData.append("<c>");
				newData.append(cData);
				newData.append("</c>");
				newData.append("</a>");
				fileContent.insert(
						fileContent.lastIndexOf("</aList>"), newData);
				try {
					PrintWriter writeFile = new PrintWriter(new FileWriter(file, false));
					writeFile.println(fileContent);
					writeFile.close();
				} catch (IOException e) {
					System.out.println("Failed to write file.");
				}
			}
		}
	}
	
}
