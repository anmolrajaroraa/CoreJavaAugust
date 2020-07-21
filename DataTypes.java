class DataTypes{
	public static void main(String args[]){
		// primitive data types
		// byte, short, int, long, char, float, double, boolean
		// primitive means that the variables are containers
		// and the value on the right side is directly stored in them

		// reference data types
		// String, BigInteger, BigDecimal, objects
		// class - custom type made by us

		// wrapper classes - reference data types
		// Byte, Short, Integer, Long, Character, Float, Double, Boolean

		byte a = (byte)1300;
		boolean x = true;
		boolean y = false;

		char c = 'x';
		System.out.println("A is " + a);
		System.out.println("Min value for byte is " + Byte.MIN_VALUE);
		System.out.println("Max value for byte is " + Byte.MAX_VALUE);
		short b = 10000;
		int i = 1324342; // 4 bytes memory 
		long l = 29030302002020202l; // 8 bytes of memory
		System.out.println("l is " + l);
		System.out.println("Min value for short is " + Short.MIN_VALUE);
		System.out.println("Max value for short is " + Short.MAX_VALUE);
		System.out.println("प्रवेश करें \u090B\u0937\u093F -> \u20B9  \u069C");
		System.out.println("Min value for int is " + Integer.MIN_VALUE);
		System.out.println("Max value for int is " + Integer.MAX_VALUE);
		System.out.println("Min value for long is " + Long.MIN_VALUE);
		System.out.println("Max value for long is " + Long.MAX_VALUE);
	}
}