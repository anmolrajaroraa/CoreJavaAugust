
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
		
		String s1 = "Ram";
		String s2 = "Ram";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
		String s3 = new String("Ram");
		System.out.println(s1 == s3);   // compare objects (memory location)
		System.out.println(s1.equals(s3));
//		
//		int a = 10;
//		int b = 10;
//		System.out.println(a == b);  // compare values (primitive)
//		
	}
}
