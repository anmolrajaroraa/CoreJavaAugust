import oops.Parent;

class Test{
	
}

public class InheritanceTestOtherPackage extends Parent{

	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println(parent.propertyValue);
//		parent.luxuryCar();
		
		InheritanceTestOtherPackage obj = new InheritanceTestOtherPackage();
		System.out.println(obj.propertyValue);
		obj.luxuryCar();

	}

}
