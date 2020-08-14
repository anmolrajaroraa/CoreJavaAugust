package oops;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Child child = new Child();
		String x = child.propertyValue;
		int y = child.cows;
//		child.luxuryCar();
		child.useParentCar();
		
		ChildFriend cf = new ChildFriend();
		cf.wantsToDriveCar();
		
		Parent parent = new Parent();
		System.out.println(parent.propertyValue);
		parent.luxuryCar();
	}

}
