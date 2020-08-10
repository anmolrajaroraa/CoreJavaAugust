package oops;

class Student{
	short id; // 2
	String name; // 30
	String courseName; // 50
	byte courseDuration; // 1
	byte marksObtained[]; // 5  = 92 bytes
	static final String COLLEGE_NAME = "XYZ College"; // 4

	// Don't Repeat Yourself
	// static says I will get binded to the class
	// static will be loaded in memory when class is loaded
	// static is only created once and will be shared by all the objects
	// final variable should always be written in capital/block letters
	
//	void add() {
//		
//	}
	
	void takeInput(int student_id, String student_name, int duration, String course) {
		id = (short) student_id;
		name = student_name;
		courseName = course;
		courseDuration = (byte) duration;
	}
}

class Book{
	void add() {
		
	}
}

public class OOPSDemo {
	
//	void add() {
//		
//	}
//	void add() {
//		
//	}

	public static void main(String[] args) {
		Student student = new Student();
//		student.id = 101;
//		student.name = "Ram Kumar";
//		student.college_name = null;
//		student.courseDuration = 4;
//		student.courseName = "BTech";
		student.takeInput(101, "Ram Kumar", 4, "BTech");
		student.marksObtained = new byte[]{90,80,70,65,75};
//		student.add();
		
		Student student2 = new Student();
//		student2.id = 102;
//		student2.name = "Anna";
//		student2.courseDuration = 3;
//		student2.courseName = "BCA";
		student.takeInput(102, "Anna", 3, "BCA");
		student2.marksObtained = new byte[]{90,90,80,85,75};
		
		Student student3 = new Student();
//		student3.id = 103;
//		student3.name = "Shakti";
//		student3.courseDuration = 3;
//		student3.courseName = "BBA";
		student.takeInput(103, "Shakti", 3, "BBA");
		student3.marksObtained = new byte[]{90,80,70,75,65};
		
		System.out.println(student);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(Student.COLLEGE_NAME);
	}

}
