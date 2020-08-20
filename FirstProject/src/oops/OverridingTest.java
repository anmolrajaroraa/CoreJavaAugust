package oops;

class EmployeeDetails{
	String department;
	String managerName;
	String projectName;
	int floor;
}

// Open (for inheritance) and close (for modification) principle

class MoreEmployeeDetails extends EmployeeDetails{
	int incentives;
}

class AA{
	EmployeeDetails getEmployeeDetails() {
		EmployeeDetails details = new EmployeeDetails();
		details.department = "IT";
		details.managerName = "Ram Kumar";
		details.projectName = "NewProject";
		details.floor = 9;
		return details;
	}
}

class BB extends AA{
	@Override
	public MoreEmployeeDetails getEmployeeDetails() {
		MoreEmployeeDetails details = new MoreEmployeeDetails();
		details.department = "IT";
		details.managerName = "Ram Kumar";
		details.projectName = "NewProject";
		details.floor = 9;
		details.incentives = 10000;
		return details;
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		// Thumb rules
		// 1. Covariant types - return type of a function can be replaced a child
		//		class of that return type but rest of the signature should be same
		// 2. Weaker access rule - you can only use the same or increase the access for a fn
		// you cannot decrease the scope of a fn
	}

}
