package oops;

abstract class Shape{
	int count = 1;
	
	void draw() {
		System.out.println("Shape draw");
	}
	void rotate() {
		System.out.println("Shape rotate");
	}
	void area() {
		System.out.println("Shape area");
	}
	void perimeter() {
		System.out.println("Shape perimeter");
	}
}

class Circle extends Shape{
	int count = 10 + super.count;
	
	@Override
	void draw() {
		System.out.println("Circle draw using radius");
	}
	@Override
	void area() {
		System.out.println("Circle area using πr2");
	}
	@Override
	void perimeter() {
		System.out.println("Circle perimeter using 2πr");
	}
	void calculateDiameter() {
		System.out.println("Calculate diameter using 2 * r");
	}
}

class Rectangle extends Shape{
	int count = 20 + super.count;
	@Override
	void draw() {
		System.out.println("Rectangle draw using length and breadth");
	}
	@Override
	void area() {
		System.out.println("Rectangle area using l*b");
	}
	@Override
	void perimeter() {
		System.out.println("Rectangle perimeter using 2(l+b)");
	}
	void calculateDiagnol() {
		System.out.println("Calculate diagnol using pythagoras");
	}
}

class Square extends Shape{
	int count = 30 + super.count;
	@Override
	void draw() {
		System.out.println("Square draw using side");
	}
	@Override
	void area() {
		System.out.println("Square area using s*s");
	}
	@Override
	void perimeter() {
		System.out.println("Square perimeter using 4*s");
	}
	void calculateDiagnol() {
		System.out.println("Calculate diagnol using pythagoras");
	}
}

public class UpcastDowncast {
	
	static void commonFn(Shape shape) {
		
		shape.draw();
		shape.rotate();
		shape.area();
		shape.perimeter();
		System.out.println("Shape count is " + shape.count);
		
		if(shape instanceof Circle) {
			Circle circle = (Circle) shape;
			circle.calculateDiameter();
		}
		else if(shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			rectangle.calculateDiagnol();
		}
		else {
			Square square = (Square) shape;
			square.calculateDiagnol();
		}
	}

	public static void main(String[] args) {
		
		commonFn(new Circle());
		commonFn(new Rectangle());
		commonFn(new Square());
		
//		Circle circle = new Circle();
//		circle.draw();
//		circle.rotate();
//		circle.area();
//		circle.perimeter();
//		System.out.println("Circle count is " + circle.count);
//		
//		Rectangle rectangle = new Rectangle();
//		rectangle.draw();
//		rectangle.rotate();
//		rectangle.area();
//		rectangle.perimeter();
//		System.out.println("Rectangle count is " + rectangle.count);
//		
//		Square square = new Square();
//		square.draw();
//		square.rotate();
//		square.area();
//		square.perimeter();
//		System.out.println("Square count is " + square.count);
		
//		Circle circle = new Circle();
//		circle.draw();
//		System.out.println("Circle count: " + circle.count);
//		
//		Shape shape = new Circle();
//		shape.draw();
//		System.out.println("Shape count: " + shape.count);
//		
//		shape = new Rectangle();
//		shape.draw();
//		System.out.println("Shape count: " + shape.count);
//		
//		shape = new Square();
//		shape.draw();
//		System.out.println("Shape count: " + shape.count);
	}

}
