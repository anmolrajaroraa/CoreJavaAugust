package oops;

abstract class A1{
	int x;  // x -> 200
	A1(){
		x = 100;
		System.out.println("A1 default cons");
	}
	A1(int x){   // x -> 200
		this();
		this.x = x;
		System.out.println("A1 param cons");
	}
	void print() {
		System.out.println("Parent print fn");
	}
}

class A2 extends A1{
	int x;  // 500
	int y;  // 400
	A2(){
		super(200);
		x = 300;
		y = 400;
		System.out.println("A2 default cons");
	}
	A2(int x){  // x -> 500
		this();
		this.x = x;
		System.out.println("A2 param cons");
	}
	@Override
	void print() {
		super.print();
		System.out.println("Child print fn");
	}
	int getX() {
		return super.x;
	}
}

class A3 extends A2{
	int x; // 600
	A3(){
		super(500);
		x = 100;
		System.out.println("A3 default cons");
	}
	A3(int x){  // x -> 600
		this();
		this.x = x;
		System.out.println("A3 param cons");
		System.out.println(x + this.x + super.x + ((A1)this).x + y); 
		// 600 + 600 + 500 + 200 + 400 = 2300
	}
	@Override
	void print() {
		super.print();
		System.out.println("Grandchild print fn");
	}
}

public class SuperVSThis {

	public static void main(String[] args) {
		A3 a3 = new A3(600);
		a3.print();
	}

}
