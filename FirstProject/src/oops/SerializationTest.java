package oops;

import java.io.IOException;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "employee.ser";
		Employee employee = new Employee("Ram Kumar", 100, 15000, "ram1234");
		
//		SerializationUtil.serialize(employee, fileName);
//		System.out.println("Serialization done...");
//		
		Employee newEmployee = (Employee) SerializationUtil.deserialize(fileName);
		
		System.out.println("Original object: " + employee);
		System.out.println("Deserialzed object: " + newEmployee);
	}

}
