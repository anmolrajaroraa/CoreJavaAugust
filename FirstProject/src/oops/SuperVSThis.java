package oops;

abstract class A1{
	int x;
	A1(){
		x = 100;
		System.out.println("A1 default cons");
	}
	A1(int x){
		this();
		this.x = x;
		System.out.println("A1 param cons");
	}
	void print() {
		System.out.println("Parent print fn");
	}
}

class A2 extends A1{
	int x;
	int y;
	A2(){
		super(200);
		x = 300;
		y = 400;
		System.out.println("A2 default cons");
	}
	A2(int x){
		this();
		this.x = x;
		System.out.println("A2 param cons");
	}
	@Override
	void print() {
		System.out.println("Child print fn");
	}
}

class A3 extends A2{
	int x;
	A3(){
		super(500);
		x = 100;
		System.out.println("A3 default cons");
	}
	A3(int x){
		this();
		this.x = x;
		System.out.println("A3 param cons");
		System.out.println(local x + this x + parent x + grandparent x);
	}
	@Override
	void print() {
		System.out.println("Grandchild print fn");
	}
}

public class SuperVSThis {

	public static void main(String[] args) {
		A3 a3 = new A3(600);
		a3.print();
	}

}
