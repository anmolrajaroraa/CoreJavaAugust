import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
//		System.out.println("Loops Demo Going On... ");
		
//		for( start; stop; step )
		
//		for(int i = 0; i < 10; i++) {
//			if(i == 3) {
//				continue;  // continue back to next iteration (jump)
//			}
//			System.out.println(i);
			
//			if(i != 3) {
//				System.out.println(i);
//			}
//			if(i == 3) {
//				break;    // break the loop that is direct parent to me
//			}
//			System.out.println(i);
//		}
		
//		int counter = 0;
//		outer:
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Outer loop still running...");
//			for(int j = 0; j < 10; j++) {
//				counter++;
//				System.out.println(counter);
//				
//				if(counter == 55) {
//					break outer;
//				}
//			}
//			
//			if(counter == 75) {
//				break;
//			}
//		}
		
		long initialTime = System.currentTimeMillis();
		for(int i = 0; i < 10; i++) {
			String s = String.valueOf(i * i);
			System.out.println(s);
		}
		long currentTime = System.currentTimeMillis();
		System.out.println(currentTime - initialTime);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter full name: ");
		String name = scanner.next();
		System.out.println("Name is " + name);
		String lastName = scanner.next();
		System.out.println("Lastname is " + lastName);
		
	}

}
