package questions;

public class Solution3 {

	public static void main(String[] args) {
		String s = "abcdef";
		
		boolean isDuplicateFound = false;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for(int j = i + 1; j < s.length(); j++) {
				if(c == s.charAt(j)) {
					isDuplicateFound = true;
					break;
				}
			}
			
			if(isDuplicateFound) {
				System.out.println(c);
				break;
			}
		}
		if(!isDuplicateFound) {
			System.out.println("_");
		}
	}

}
