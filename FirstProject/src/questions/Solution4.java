package questions;

public class Solution4 {

	public static void main(String[] args) {
		
		//int arr1[] = {1,4,6,18,19,3};  // first number from here
		//int arr2[] = {4,5,3,6,0,-2};   // second number from here
		
		//int sum = 13;  // sum should be this
		
		//Pair is - 7 and 6
		//Pair not found
		int arr1[] = {1,4,6,9,9,10};
		int arr2[] = {5,5,0,-4,6,5};
		int sum = 13;
		int c=0;
		
		outer:
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){
				c = arr1[i] + arr2[j];
				if(c==sum) {
					System.out.println("Pair is" + arr1[i] + "and" + arr2[j]);
					break outer;
				}
			}
				 
		}
		if(c!=sum)
			System.out.println("Pair not found");
		
		

	}

}
