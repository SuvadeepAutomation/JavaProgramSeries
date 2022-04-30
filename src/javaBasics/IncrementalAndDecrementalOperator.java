package javaBasics;

public class IncrementalAndDecrementalOperator {

	public static void main(String[] args) {

		//post increment
		
		int a=1;
		int b=a++;//left to right operation
		//first give original value of a to b and then increment
		
		System.out.println(a);
		System.out.println(b);		
		
		int c=-99;
		int d=c++;
		System.out.println(c);
		System.out.println(d);
		
		int g=-1000;
		int h=g++;
		System.out.println(g);
		System.out.println(h);
		
		//pre-increment 
		int m=1;
		int n=++m;
		System.out.println(m);
		System.out.println(n);
		
		//post decrement 
		int x=2;
		int y=x--;
		System.out.println(x);
		System.out.println(y);
		
		int total=100;
		System.out.println(total++);
		System.out.println(total);
		
		int bal=999;
		System.out.println(++bal);
		
		double d1=99.99;
		System.out.println(++d1);
		
		char c1='a';
		System.out.println(++c1);
		
		
		
		
	}

}
