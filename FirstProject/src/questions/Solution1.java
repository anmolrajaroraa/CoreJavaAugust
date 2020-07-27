package questions;

import java.util.Arrays;

public class Solution1 {

	/*public static void main(String[] args) {
		String s = "aaabcccdeeef"; // -> b // input from scanner
//		String s = "aaabbcccdeeef"; // -> d
//		String s = "aaabbcccddeeef"; // -> f
//		String s = "aaabbcccddeeeff"; // -> _
		
		boolean isNonDuplicateFound = true;
		
		for(int i = 0; i < s.length(); i++) {
			isNonDuplicateFound = true;
			char c = s.charAt(i);
//			System.out.println(c);
			for(int j = 0; j < s.length(); j++) {
				if(i==j) {
					continue;
				}
				if(c == s.charAt(j)) {
					isNonDuplicateFound = false;
					break;
				}
			}
			
			if(isNonDuplicateFound) {
				System.out.println(c);
				break;
			}
			
		}
		
//		Big O notation -> n * n -> n^2 -> 2n -> 3n
		
		if(!isNonDuplicateFound) {
			System.out.println("_");
		}
	}*/
	
	public static void main(String[] args) {
		String s = "qklqnknqnldckn";
		
		int arr[] = new int[26];
		boolean isNonDuplicateFound = false;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int asciiCode = c;
			int index = asciiCode - 'a';
			arr[index]++;
		}
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int asciiCode = c;
			int index = asciiCode - 'a';
			int value = arr[index];
			if(value == 1) {
				System.out.println(c);
				isNonDuplicateFound = true;
				break;
			}
		}
		
		if(!isNonDuplicateFound) {
			System.out.println("_");
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
