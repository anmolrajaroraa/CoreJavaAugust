package oops;

public class Subject {
	private String name;
	private Teacher teacher;
	private short roomNo;
	private byte theoryMarks;
	private byte vivaMarks;
	private byte practicalMarks;
	private byte totalMarks;
	
	public Subject(String name, Teacher teacher, int roomNo) {
		this.name = name;
		this.teacher = teacher;
		this.roomNo = (short) roomNo;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", teacherName=" + teacher + ", roomNo=" + roomNo + ", theoryMarks="
				+ theoryMarks + ", vivaMarks=" + vivaMarks + ", practicalMarks=" + practicalMarks + ", totalMarks="
				+ totalMarks + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacherName) {
		this.teacher = teacherName;
	}

	public short getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(short roomNo) {
		this.roomNo = roomNo;
	}

	public byte getTheoryMarks() {
		return theoryMarks;
	}
	public void setTheoryMarks(byte theoryMarks) {
		this.theoryMarks = theoryMarks;
	}

	public byte getVivaMarks() {
		return vivaMarks;
	}
	public void setVivaMarks(byte vivaMarks) {
		this.vivaMarks = vivaMarks;
	}

	public byte getPracticalMarks() {
		return practicalMarks;
	}
	public void setPracticalMarks(byte practicalMarks) {
		this.practicalMarks = practicalMarks;
	}

	public byte getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(byte totalMarks) {
		this.totalMarks = totalMarks;
	}
	
}
