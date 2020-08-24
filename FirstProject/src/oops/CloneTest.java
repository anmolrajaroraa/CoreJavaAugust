package oops;

class Accessory implements Cloneable{
	int c = 30;
	
	@Override
	protected Accessory clone() throws CloneNotSupportedException {
		return (Accessory) super.clone();
	}
}

class Car implements Cloneable{
	int a = 10;
	int b = 20;
	Accessory accessory;
	
//	@Override
//	public String toString() {
//		return "Car [a=" + a + ", b=" + b + "]";
//	}
	
	@Override
	protected Car clone() throws CloneNotSupportedException {
		Car car = (Car) super.clone();
		car.accessory = car.accessory.clone();
		return car;
	}
}

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Car car = new Car();
		car.a++;
		car.b++;
		car.accessory.c++;
		
		Car car2 = car;
		car2.a = 100;
		
		Car car3 = car.clone();
		car3.a = 999;
		
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
	}

}
