import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
	
	public static Scanner scanner = new Scanner(System.in);
	public static int correctPIN = 1234;
	
	public static void checkPin() throws InputMismatchException{
		System.out.println("Enter your PIN");
		int PIN = scanner.nextInt();
		if(correctPIN != PIN) {
			throw new InputMismatchException();  // custom exception
		}
	}
	
	public static void checkBalance() throws InputMismatchException, NumberFormatException {
		System.out.println("Enter the amount to withdraw");
		int amount = scanner.nextInt();
	}
	
	public static void withdraw() throws InputMismatchException, NumberFormatException{
		checkPin();
		checkBalance();
	}

	public static void main(String[] args) {
		try{
			withdraw();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
