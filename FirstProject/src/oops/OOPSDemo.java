package oops;

import java.util.Arrays;

class Student{
	short id = 0; // 2
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
	// this keyword => current object which has called the function right now
	// this() => constructor call for the class in which we're sitting 
//	void add() {
//		
//	}
	
	// Default constructor
	private Student(){
		System.out.println("I am constructor...");
	}
	
	// Parameterized constructors
	Student(int id, String name){
		this.id = (short) id;
		this.name = name;
	}
	
	Student(int id, String name, int courseDuration, String courseName){
		this(id, name);
		this.courseName = courseName;
		this.courseDuration = (byte) courseDuration;
	}
	
	void takeInput(int courseDuration, String courseName, byte[] marksObtained) {
//		id = (short) student_id;
//		name = student_name;
		this.courseName = courseName;
		this.courseDuration = (byte) courseDuration;
		this.marksObtained = marksObtained;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + ", courseDuration="
				+ courseDuration + ", marksObtained=" + Arrays.toString(marksObtained) + 
				", collegeName=" + COLLEGE_NAME + "]";
	}

//	void showDetails() {
//		System.out.println("Student id is " + id );
//		System.out.println("Student name is " + name );
//		System.out.println("Student course is " + courseName );
//		System.out.println("Student courseDuration is " + courseDuration );
//		System.out.println("Student marksObtaianed is " + Arrays.toString(marksObtained));
//		System.out.println("Student college is " + COLLEGE_NAME );
//	}
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
		Student student = new Student(101, "Ram Kumar", 4, "BTech");
//		student.id = 101;
//		student.name = "Ram Kumar";
//		student.college_name = null;
//		student.courseDuration = 4;
//		student.courseName = "BTech";
//		student.takeInput(101, "Ram Kumar", 4, "BTech");
//		student.marksObtained = new byte[]{90,80,70,65,75};
//		student.takeInput(4, "BTech", new byte[]{90,80,70,65,75});
		student.marksObtained = new byte[]{90,80,70,65,75};
//		student.showDetails();
//		student.add();
		
		Student student2 = new Student(102, "Anna");
//		student2.id = 102;
//		student2.name = "Anna";
//		student2.courseDuration = 3;
//		student2.courseName = "BCA";
		student2.takeInput(3, "BCA", new byte[]{90,90,80,85,75});
//		student2.showDetails();
		
		Student student3 = new Student(103, "Shakti");
//		student3.id = 103;
//		student3.name = "Shakti";
//		student3.courseDuration = 3;
//		student3.courseName = "BBA";
		student3.takeInput(3, "BBA", new byte[]{90,80,70,75,65});
//		student3.showDetails();
		
		Student student4 = new Student(104, "Shyam");
//		student4.showDetails();
		
		System.out.println(student);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
//		System.out.println(Student.COLLEGE_NAME);
		
//		System.out.println("Student id is " + student.id );
//		System.out.println("Student name is " + student.name );
//		System.out.println("Student course is " + student.courseName );
//		System.out.println("Student courseDuration is " + student.courseDuration );
//		System.out.println("Student marksObtaianed is " + Arrays.toString(student.marksObtained));
//		System.out.println("Student college is " + Student.COLLEGE_NAME );
//		
//		System.out.println("Student2 id is " + student2.id );
//		System.out.println("Student2 name is " + student2.name );
//		System.out.println("Student2 course is " + student2.courseName );
//		System.out.println("Student2 courseDuration is " + student2.courseDuration );
//		System.out.println("Student2 marksObtaianed is " + Arrays.toString(student2.marksObtained));
//		System.out.println("Student2 college is " + Student.COLLEGE_NAME );
//		
//		System.out.println("Student3 id is " + student3.id );
//		System.out.println("Student3 name is " + student3.name );
//		System.out.println("Student3 course is " + student3.courseName );
//		System.out.println("Student3 courseDuration is " + student3.courseDuration );
//		System.out.println("Student3 marksObtaianed is " + Arrays.toString(student3.marksObtained));
//		System.out.println("Student3 college is " + Student.COLLEGE_NAME );
		
	}

}
