import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args)  {
//		Scanner scanner = new Scanner(System.in);
//		FileInputStream fin = null;
//		
//		try{
//			int num1 = scanner.nextInt();
////			throw new InputMismatchException();
//			int num2 = scanner.nextInt();
//			System.out.println(num1 / num2);
//			
//			fin = new FileInputStream("employee.ser");
//			fin.readAllBytes();  // exception
////			fin.close();
//		}
//		catch(InputMismatchException | NumberFormatException e) {
//			System.out.println("Please enter integers only");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Second number cannot be zero");
//		}
//		catch(FileNotFoundException e) {
//			System.out.println("File with specified name is not available");
//		}
////		catch(NumberFormatException e) {
////			System.out.println("Please enter integers only");
////		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("Finally runnng..");
//			fin.close();
//		}
		
		try(FileInputStream fin = new FileInputStream("employee.ser");
				Scanner scanner = new Scanner(System.in);){
			int num1 = scanner.nextInt();
//			throw new InputMismatchException();
			int num2 = scanner.nextInt();
			System.out.println(num1 / num2);
		
			fin.readAllBytes();  // exception
		}
		catch(InputMismatchException | NumberFormatException e) {
			System.out.println("Please enter integers only");
		}
		catch(ArithmeticException e) {
			System.out.println("Second number cannot be zero");
		}
		catch(FileNotFoundException e) {
			System.out.println("File with specified name is not available");
		}
		catch(IOException e) {
			System.out.println("Some error occured while reading / closing the file");
		}
//		catch(NumberFormatException e) {
//			System.out.println("Please enter integers only");
//		}
		catch(Exception e) {
			e.printStackTrace();
		}
//		finally {
//			System.out.println("Finally runnng..");
//		}
		
//		fin.close();
//		scanner.close();
		System.out.println("If exception occurs before me, then I won't be able to run");
	}

}
