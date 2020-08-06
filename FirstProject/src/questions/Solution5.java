package questions;

public class Solution5 {

	public static void main(String[] args) {
//		int arr[] = {1,2,3,4}; // 1234 + 1
//		int arr1[] = {1,2,3,9};  //1240
//		int arr2[] = {9,9,9,9};  // 10000
		
		int arr1[]= {2,3,4,5,8,10};
		int arr2[]= {5,2,-2,0,7,8};
		int i;
		int j=0;
		for( i=0; i<arr1.length; i++)
		{
		for( j=0; j<arr2.length; j++)
		{
		if(arr1[i] + arr2[j]== 13)
		{
		System.out.println("pair found which is " + arr1[i]

		+ "and" + arr2[j]);

		break;
		}
		}
		}
		if(arr1[i-1] + arr2[j-1] != 13)
		{
		System.out.println("pair not found");
		}

	}

}
