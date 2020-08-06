import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// arrays are treated as objects 
//		int arr[] = {12,23,34,45,56};
		
//		String arr[] = new String[100];
		
		int arr[] = new int[]{12,23,34,45,56};
//		arr[0] = 12;
//		arr[1] = 23;
//		arr[2] = 34;
//		arr[3] = 45;
//		arr[4] = 56;
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
////		arr[99]= "x";
//		
//		for(int element : arr) {
//			System.out.println("Element is " + element);
//		}

		System.out.println(arr);
		System.out.println( Arrays.toString(arr) );
	}

}
