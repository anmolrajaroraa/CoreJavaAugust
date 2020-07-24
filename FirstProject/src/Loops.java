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
		
//		long initialTime = System.currentTimeMillis();
//		for(int i = 0; i < 10; i++) {
//			String s = String.valueOf(i * i);
//			System.out.println(s);
//		}
//		long currentTime = System.currentTimeMillis();
//		System.out.println(currentTime - initialTime);
//		
//		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter full name: ");
//		String name = scanner.next();
//		System.out.println("Name is " + name);
//		String lastName = scanner.next();
//		System.out.println("Lastname is " + lastName);
//		
//		System.out.print("Enter your age: ");
//		byte age = scanner.nextByte();
//		System.out.println("Age is " + age);
//		
//		System.out.print("Enter your salary: ");
//		int salary = scanner.nextInt();
//		System.out.println("Age is " + salary);
//		
//		System.out.print("Enter your role: ");
//		scanner.nextLine();   // consumes \n which is leftover in buffer by nextInt()
//		String role = scanner.nextLine();
//		System.out.println("Role is " + role);
//		
//		System.out.print("Enter your address: ");
//		String address = scanner.nextLine();
//		System.out.println("Address is " + address);
//		
//		scanner.close();
		
		// user is slow as compared to cpu so cpu (jre) is going to store our data in a buffer
		// and when you want to fetch that data then it will be fetched from the buffer
		
		while(scanner.hasNextInt()) {
			int input = scanner.nextInt();
			System.out.println(input + " is a prime number");
		}
		
		scanner.close();
		
	}

}

















