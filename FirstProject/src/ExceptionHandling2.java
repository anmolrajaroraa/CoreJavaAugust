import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
	
	public static Scanner scanner = new Scanner(System.in);
	public static int correctPIN = 1234;
	public static int balance = 10000;
	
	public static void checkPin() throws InputMismatchException{
		System.out.println("Enter your PIN");
		int PIN = scanner.nextInt();
		if(correctPIN != PIN) {
			throw new InputMismatchException("PIN incorrect");  // custom exception
		}
	}
	
	public static void checkBalance() throws InputMismatchException, NumberFormatException {
		System.out.println("Enter the amount to withdraw");
		int amount = scanner.nextInt();
		if(balance < amount) {
			throw new NumberFormatException("Withdrawal failed - low balance");
		}
	}
	
	public static void withdraw() throws InputMismatchException, NumberFormatException{
		checkPin();
		checkBalance();
		System.out.println("Withdrawal successful");
	}

	public static void main(String[] args) {
		try{
			withdraw();
		}
		catch(InputMismatchException | NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
