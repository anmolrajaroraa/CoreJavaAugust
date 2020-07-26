import java.math.BigInteger;
import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		// a collection of characters but it's not same as character array
		// char[] and string both are objects in java
		// char[] - it's an array and it's mutable(changeable)
		// string - object of String class - and it's immutable
		
//		String s = "abc";
//		System.out.println(s.hashCode());
//		char arr[] = {'a', 'b', 'c'};
//		System.out.println(arr[0]);
//		System.out.println(s.charAt(0));
//		
//		arr[0] = 'x';
//		
//		s = "x" + s;
//		System.out.println(s.hashCode());
//		System.out.println(s);
//		
//		s = s.replace('a', 'x');
//		System.out.println(s.hashCode());
//		System.out.println(s);
		
		// string pool has a rule that every string should be unique 
		// and if duplicate string is coming then pool is not going to store that object
		// String s1 = new String("Ram");  
		// String s2 = "Ram";   // this object is created in pool if it doesn't exist already
		// String s3 = new String("Ram");   // this object is created in heap and pool both
		// but the address signed to s3 variable is the address of object created in heap
		
//		String s1 = "Ram";
//		String s2 = "Ram";
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s1 == s2);
		String s3 = new String("Ram").intern();
//		System.out.println(s1 == s3);   // compare objects (memory location)
//		System.out.println(s1.equals(s3));
//		
//		int a = 10;
//		int b = 10;
//		System.out.println(a == b);  // compare values (primitive)
		
		String s4 = "java ,is! very[ dEnse} lAngu_Age".intern();
		String s5 = "jAva is - very dEnse lAnguAge - and OOPS is - heavily used";
		System.out.println(s4.compareTo(s5));
		System.out.println(s4.compareToIgnoreCase(s5));
		
		System.out.println(s4.contains("jAva"));
		s4.startsWith("java");
		s4.endsWith("language");
		s4.equalsIgnoreCase(s5);
		System.out.println(s5.indexOf(','));
		System.out.println(s4.indexOf("lAnguAge"));
		System.out.println(s5.indexOf('a', 44));
		System.out.println(s5.lastIndexOf('a'));
		System.out.println(s5.length());
		System.out.println("ram@gmail.com".matches("^(.+)@(.+)$"));
		System.out.println(s4.replaceAll("[,!\\[}_]", "yay"));
		String s_arr[] = s5.split("-");
		System.out.println(Arrays.toString(s_arr));
		
		String newString = String.join("$$$", s_arr);
		System.out.println(newString);
		
		System.out.println(s5.substring(10));
		System.out.println(s5.substring(10, 25));
		char arr[] = s5.toCharArray();
		System.out.println(Arrays.toString(arr));
		arr[0] = 'l';
		String s6 = String.valueOf(arr);
		System.out.println(s6);
//		"hello" -> {'h', 'e', 'l', 'l', 'o'}
		s4.toUpperCase();
		s4.toLowerCase();
		
		System.out.println("[" + (int)Character.MIN_VALUE + "]");
		System.out.println("[" + (int)Character.MAX_VALUE + "]");
		
//		long a = (long)12345678912345678999l;
		BigInteger bi = new BigInteger("12345678912345678");
		byte a = bi.byteValue();
		System.out.println(a);
	}
}
