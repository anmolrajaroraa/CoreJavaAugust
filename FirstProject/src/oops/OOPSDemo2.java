package oops;

import java.util.ArrayList;

class Student2{
	private short id; 
	private String name; 
	private String courseName; 
	private byte courseDuration;  
	private Address address;
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

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", courseName=" + courseName + ", courseDuration="
				+ courseDuration + ", subjects=" + subjects + ", collegeName= " + COLLEGE_NAME + 
				", address=" + address + "]";
	}
}

public class OOPSDemo2 {

	public static void main(String[] args) {
		Student2 student = new Student2(101, "XAE A-12", 4, "BTech");
//		student.id = 102;
//		student.name = "Ramu";
		student.setName(null);
		
		Address studentAddress = new Address(1, "New City", "New Delhi", 110085, "Near mall");
		student.setAddress(studentAddress);
		
		ArrayList<String> courses = new ArrayList<>();
		courses.add("Maths");
		courses.add("Accountancy");
		courses.add("CPP");
		
		Teacher teacher = new Teacher(007, "Manoj", courses);
		
		Subject subject = new Subject("Accountancy", teacher, 101);
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
