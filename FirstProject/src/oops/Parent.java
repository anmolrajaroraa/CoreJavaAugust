package oops;

class GrandParent{
	public int cows = 10;
}

public class Parent extends GrandParent{
	public String propertyValue = "10 Crores";
	
	protected void luxuryCar() {
		System.out.println("Mercedes Benz");
		System.out.println("Property value is " + propertyValue);
	}
	
	private void parentsBetterHalf(){
		luxuryCar();
	}
}
class Child extends Parent{
	void useParentCar() {
		Parent parent = new Parent();
		System.out.println(parent.propertyValue);
		parent.luxuryCar();
	}
}
class ChildFriend{
	void wantsToDriveCar() {
		Parent parent = new Parent();
		System.out.println(parent.propertyValue);
		parent.luxuryCar();
	}
}

// default keyword is used only with interfaces
// if you want to specify default access modifier then you don't need to specify anything

// Access Modifiers
//1. Private -> Only in same class, private variables and methods cannot be inherited
//2. Default (no keyword used) -> Same as private + all classes in same package
//3. Protected -> Same as default + all the child classes (extends) in any package
//4. Public - same as above 3 + universal access to any class