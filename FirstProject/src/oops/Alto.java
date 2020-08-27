package oops;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

class Driver{
	public static void main(String[] args) {
		CarInterface car = new Alto();
		car.gears();
		car.window();
	}
}

class Driver2{
	public static void main(String[] args) {
		CarInterface car = new Alto();
		car.gears();
		car.window();
	}
}

class Driver3{
	public static void main(String[] args) {
		CarInterface car = new Alto();
		car.gears();
		car.window();
	}
}

class Driver4{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
//		Alto alto = new Alto();
//		alto.manualGears(4);
//		alto.manualWindow();
		
//		CarInterface car = new Alto();
//		car.gears();
//		car.window();
		
		CarInterface car = CarFactory.getCar();
		car.gears();
		car.window();
	}
}

class CarFactory {
	static CarInterface getCar() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
//		return new Climber();
		ResourceBundle rb = ResourceBundle.getBundle("config");
		CarInterface car = 
				(CarInterface) Class.forName(rb.getString("carname")).getConstructor().newInstance();
		return car;
	}
}

interface CarInterface{
	void gears();
	void window();
}

public class Alto implements CarInterface{
	void manualGears(int noOfGears, int quality) {
		System.out.println("Switch gears manually");
	}
	void fullyAutomaticWindow() {
		System.out.println("Handle window using levers");
	}
	@Override
	public void gears() {
		manualGears(5,1);
	}
	@Override
	public void window() {
		fullyAutomaticWindow();
	}
}


