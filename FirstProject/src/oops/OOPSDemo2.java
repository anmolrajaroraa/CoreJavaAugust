package oops;

import java.util.ArrayList;
import java.util.HashMap;

class Student2{
	private short id; 
	private String name; 
	private String courseName; 
	private byte courseDuration;  
	private ArrayList<Subject> subjects = new ArrayList<>();
	static final String COLLEGE_NAME = "XYZ College";
//	private HashMap<String, Integer> marksObtained = new HashMap<>();
	
	// Default constructor
	private Student2(){
		System.out.println("I am constructor...");
	}
	
	// Parameterized constructors
	Student2(int id, String name){
		this.id = (short) id;
		this.name = name;
	}
	
	Student2(int id, String name, int courseDuration, String courseName){
		this(id, name);
		this.courseName = courseName;
		this.courseDuration = (byte) courseDuration;
	}
	
//	void takeInput(int courseDuration, String courseName, HashMap<String, Integer> marksObtained) {
//		this.courseName = courseName;
//		this.courseDuration = (byte) courseDuration;
//		this.marksObtained = marksObtained;
//	}
	
	// setter - getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && name != "") {
			this.name = name;
		}
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public byte getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(byte courseDuration) {
		this.courseDuration = courseDuration;
	}

	public short getId() {
		return id;
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", courseName=" + courseName + ", courseDuration="
				+ courseDuration + ", subjects=" + subjects + ", collegeName= " + COLLEGE_NAME + "]";
	}
}

public class OOPSDemo2 {

	public static void main(String[] args) {
		Student2 student = new Student2(101, "XAE A-12", 4, "BTech");
//		student.id = 102;
//		student.name = "Ramu";
		student.setName("");
		
		Subject subject = new Subject("English", "Paromita", 304);
		student.getSubjects().add(subject);
		subject = new Subject("Physics", "SurajPal", 103);
		student.getSubjects().add(subject);
		subject = new Subject("Chemistry", "Vandana", 1);
		student.getSubjects().add(subject);
		subject = new Subject("CS", "Shalu", 2);
		subject.setPracticalMarks((byte) 24);
		student.getSubjects().add(subject);
		subject = new Subject("Maths", " Manoj", 101);
		student.getSubjects().add(subject);
		
//		student.marksObtained = new byte[] {100,100,100,100,100};
//		student.getMarksObtained().put("English", 100);
//		student.getMarksObtained().put("Maths", 90);
//		student.getMarksObtained().put("Physics", 80);
//		student.getMarksObtained().put("Chemistry", 70);
//		student.getMarksObtained().put("CS", 60);
		System.out.println(student);

		// Aggregation
	}

}
