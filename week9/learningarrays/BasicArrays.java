package week9.learningarrays;

public class BasicArrays {

	public static void main(String[] args) {
//		String student1 = "Mohammad";
//		String student2 = "Jailani";
//		String student3 = "Haji";
//		String student4 = "Abdul";
//		String student5 = "Rahman";
		String[] students = new String[4];
		students[1] = "Jailani";
//		students[4] = "Rahman";
		students[0] = "Mohammad";
		students[2] = "Haji";
		students[3] = "Abdul";
		
//		students[5] = "Aji";
		
		System.out.println(students[1]);
		System.out.println(students[0]);
		students[0] = "Mohd";
		System.out.println(students[0]);
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		for(String student : students) {
			System.out.println(student);
		}
		
		int[] studentsAge = {18, 19, 18, 21};
		
		studentsAge[1] = 20;
		
		for(int age : studentsAge) {
			System.out.println(age);
		}
	}
	
}
