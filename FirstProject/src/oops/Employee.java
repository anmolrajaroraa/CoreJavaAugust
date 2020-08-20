package oops;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 6820807601418527720L;
//	private static final long serialVersionUID = -7150144175995341559L;
//	private static final long serialVersionUID = -4325508051271653306L;
	private String name;
	private int id;
	private int salary;
	private transient String password;
	private String companyName = "XYZ, Inc.";
	private String designation;
	
	public Employee(String name, int id, int salary, String password) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", password=" 
				+ password + ", companyName=" + companyName + "]";
	}
}