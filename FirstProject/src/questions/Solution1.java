package questions;

import java.util.HashMap;

public class Solution1 {

	/*public static void main(String[] args) {
		String s = "aaabcccdeeef"; // -> b // input from scanner
//		String s = "aaabbcccdeeef"; // -> d
//		String s = "aaabbcccddeeef"; // -> f
//		String s = "aaabbcccddeeeff"; // -> _
 * 
 *      rftghyujhjh
		
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
	
//	public static void main(String[] args) {
//		String s = "qklqnknqnldckn";
//		
//		int arr[] = new int[26];
//		boolean isNonDuplicateFound = false;
//		
//		for(int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			int asciiCode = c;
//			int index = asciiCode - 'a';
//			arr[index]++;
//		}
//		
//		for(int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			int asciiCode = c;
//			int index = asciiCode - 'a';
//			int value = arr[index];
//			if(value == 1) {
//				System.out.println(c);
//				isNonDuplicateFound = true;
//				break;
//			}
//		}
//		
//		if(!isNonDuplicateFound) {
//			System.out.println("_");
//		}
//		
//		System.out.println(Arrays.toString(arr));
//	}
	
//	public static void main(String[] args) {
//		String s = "qklqnknqnldckn";
//		boolean isNonDuplicateFound = false;
//		for(int i = 0; i < s.length(); i++) {
////			char c = s.charAt(i);
////			int firstIndex = s.indexOf(c);
////			int lastIndex = s.lastIndexOf(c);
////			if(firstIndex == lastIndex) {
//			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
//				System.out.println(s.charAt(i));
//				isNonDuplicateFound = true;
//				break;
//			}
//		}
//		if(!isNonDuplicateFound) {
//			System.out.println("_");
//		}
//	}
	
	public static void main(String[] args) {
		String s = "qklqnknqnldckn";
		boolean isNonDuplicateFound = false;
		HashMap<Character, Integer> dictionary = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(dictionary.containsKey(c)) {
				
				int initialValue = dictionary.get(c);
				int newValue = initialValue + 1;
				dictionary.put(c, newValue);
				
			}
			else {
				dictionary.put(c, 1);
			}
		}
		System.out.println(dictionary);
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int characterSeenTimes = dictionary.get(c);
			if(characterSeenTimes == 1) {
				System.out.println(c);
				isNonDuplicateFound = true;
				break;
			}
		}
		if(!isNonDuplicateFound) {
			System.out.println("_");
		}
	}

}
