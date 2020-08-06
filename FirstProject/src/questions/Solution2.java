package questions;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
//		scanner
//		input - n (int) -> 3
//		
//		always believe
//		[even index holding characters][odd index holding characters]
//		[awy eiv][lasblee]
//		a l w a y s   b e l i  e  v  e
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13
//		
//		just do it
//		[js oi][utd t]
//				
//		something wonderful
//		[smtigwnefl][oehn odru]
		
//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
//		scanner.nextLine();
//		for(int i = 0; i<a; i++) {
//			String str = scanner.nextLine();
//			int even = 0;
//			int odd = 0;
//			int range = str.length()/2;
//			char strE[] = new char[ range + 1 ];
//			char strO[] = new char[ range ];
//			for(int j=0; j<str.length(); j++) {
//				if(j%2 == 0) {
//					strE[even] = str.charAt(j);
//					even++;
//				}
//				else if(j%2 == 1){
//					strO[odd] = str.charAt(j);
//					odd++;
//				}
//			}
//			System.out.println(strE);
//			System.out.println(strO);
//			
//		}
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < n; i++) {
			String s = scanner.nextLine();
			
			System.out.print("[");
			for(int j = 0; j < s.length(); j=j+2) {
				System.out.print(s.charAt(j));
			}
			System.out.print("][");
			for(int j = 1; j < s.length(); j+=2) {
				System.out.print(s.charAt(j));
			}
			System.out.println("]");
		}
		
		scanner.close();

	}
}
