package javaBasics;

public class StringConcat {

	public static void main(String[] args) {

		// String is written in caps becoz it is a class
		String s1 = "Hello World";

		String s2 = "1000";

		int a = 100;
		int b = 200;

		double d1 = 12.33;
		double d2 = 10.34;

		String x = "Hello";
		String y = "Selenium";

		System.out.println(a + b);
		System.out.println(x + y);

		// execution happens from left to right

		System.out.println(a + b + x + y);
		System.out.println(x + y + a + b);
		System.out.println(x + y + (a + b));
		System.out.println(a + b + d1 + d2);
		System.out.println(a + b + d1 + d2 + x + y);
		System.out.println(x+y+a+b+d1+d2);

		System.out.println("Value of a :" + a);
		System.out.println("Value of b :" + b);
		System.out.println("Value of sum :" + a + b);
		System.out.println("Value of sum :" + (a + b));
		
		char c1='a';
		char c2='b';
		System.out.println(c1+c2);//ascii operation is done as arithmatic operator is given
		
		//Range of Ascii
		//a--> z : 97 - 122 --> small letters
		//A-->Z : 65-90 --> capital letters
		//0-9--> 48-57
		
		//String + char
		System.out.println(x+c1);
		
		System.out.println(4/2);
		System.out.println(5/2);
		System.out.println(5.0/2);
		System.out.println(5/2.0);
		System.out.println(5.0/2.0);
		
		//System.out.println(9/0); --> Exception
		System.out.println(0/10);
		
		System.out.println(17%3);
		
		
	}

}
