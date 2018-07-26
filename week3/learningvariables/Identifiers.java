package week3.learningvariables;

public class Identifiers {

	public static void main(String[] args) {
//		int @age; Cannot contain symbols other than _ and $
//		int 1stStudent; Cannot start with digits
//		int static; Cannot use Java reserved word
		int studentAge;
		int student2Age;
		studentAge = 20;
		student2Age = 25;
		System.out.println(studentAge);
		System.out.println(student2Age);
		studentAge = 21;
		student2Age = 26;
		System.out.println(studentAge);
		System.out.println(student2Age);
	}
	
}
