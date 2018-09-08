package singledimensionalarrayexercises;

import java.util.Scanner;

public class AssigningGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int noOfStudent = scanner.nextInt();
		
		int[] scores = new int[noOfStudent];
		char[] grades = new char[noOfStudent];
		
		int bestScore = 0;
		System.out.println("Enter the " + noOfStudent + " scores");
		for(int i = 0; i < noOfStudent; i++) {
			int score = scanner.nextInt();
			scores[i] = score;
			if(bestScore < score) {
				bestScore = score;
			}
		}
		
		for(int i = 0; i < noOfStudent; i++) {
			int score = scores[i];
			if(score >= bestScore - 10) {
				grades[i] = 'A';
			} else if(score >= bestScore - 20) {
				grades[i] = 'B';
			} else if(score >= bestScore - 30) {
				grades[i] = 'C';
			} else if(score >= bestScore - 40) {
				grades[i] = 'D';
			} else {
				grades[i] = 'F';
			}
		}
		
		for(int i = 0; i < noOfStudent; i++) {
			System.out.println("Student " + (i+1) +
					" score is " + scores[i] + 
					" and grade is " + grades[i]);
		}
		
		scanner.close();
	}
	
}
