import java.util.ArrayList;

public class OverloadingDemo {

	static void add() {
		System.out.println(0);
	}
	
	static void add(int a) {
		System.out.println(a);
	}
	
	static void add(double a) {
		System.out.println(a);
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	static int add(ArrayList<Integer> numbers) {
		return 0;
	}
	
//	static int add(int[] numbers) {
//		return 0;
//	}
	
	static int add(int ...numbers) {   // varargs -> multiple(variable) args (internally this is an array)
		int sum = 0;
		for(int num: numbers) {
			sum += num;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		add(10);
		add(10.1);
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		add(new ArrayList<Integer>());
		add(new int[5]);
		"Ram".toLowerCase();
		String s = "Ram".toLowerCase();
		
//		int flag = 1;
//		
//		switch(flag) {
//		case 1:
//			System.out.println("Case 1 ran..");
//			break;
//		case 2:
//			System.out.println("Case 2 ran..");
//			break;
//		default:
//			System.out.println("Default case ran..");
//		}
		
		String day = "MONDAY";
		
		switch(day) {
		case "MONDAY":
			System.out.println("Case 1 ran..");
			break;
		case "TUESDAY":
			System.out.println("Case 2 ran..");
			break;
		default:
			System.out.println("Default case ran..");
		}
		
	}

}
