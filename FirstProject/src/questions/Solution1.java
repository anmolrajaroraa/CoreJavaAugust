package questions;

public class Solution1 {

	public static void main(String[] args) {
		String s = "aaabbcccddeeeff"; // -> b // input from scanner
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
		
		if(!isNonDuplicateFound) {
			System.out.println("_");
		}
	}

}
