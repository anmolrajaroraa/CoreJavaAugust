// import java.lang.*;
import java.math.BigInteger;
import java.math.BigDecimal;

class DataTypes2{
	public static void main(String args[]){

		int a = 1234;

		if(a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE){
			System.out.println("It can be stored in byte");
		}

		int i = (int)10.5;
		System.out.println(i);

		// double d = 1027428984272332993283829392939732883239.52252552525252525;
		double d = 1000000.555555555555;
		System.out.println(d);   // 8 bytes memory -> 16 decimal digits

		float f = 10000000000.5555555f;

		char x = 'Ω';
		char y = '≈';
		char z = '®';
		// f = (float)d;
		System.out.println(f);		// 4 bytes memory -> 7 decimal digits

		// by default numbers containing decimal point are considered as double


		// String - reference type
		// char - primitive type
		// char[] - reference type in java
		// wrapper classes
		// 2 utility classes - BigInteger, BigDecimal

		String s = new String("hello");
		System.out.println(s.hashCode());
		System.out.println(s);
		DataTypes2 obj = new DataTypes2();
		System.out.println(obj);
		System.out.println(obj.hashCode());

		// String num1 = "12341234123412341234";
		// String num2 = "34563456345634563456";
		BigInteger bi = new BigInteger("12341234123412341234");
		BigInteger bi2 = new BigInteger("34563456345634563456");
		BigDecimal bi2 = new BigDecimal("3456345634.5634563456");
		System.out.println(bi.add(bi2));
	}
}