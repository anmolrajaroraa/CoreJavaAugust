package oops;

class Car implements Cloneable{
	int a = 10;
	int b = 20;
	
//	@Override
//	public String toString() {
//		return "Car [a=" + a + ", b=" + b + "]";
//	}
	
	@Override
	protected Car clone() throws CloneNotSupportedException {
		return (Car) super.clone();
	}
}

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Car car = new Car();
		car.a++;
		car.b++;
		
		Car car2 = car;
		car2.a = 100;
		
		Car car3 = car.clone();
		car3.a = 999;
		
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
	}

}
