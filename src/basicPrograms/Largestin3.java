package basicPrograms;

import java.util.Scanner;

public class Largestin3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no");
		int a=sc.nextInt();
		System.out.println("Enter second no");
		int b=sc.nextInt();
		System.out.println("Enter third no");
		int c=sc.nextInt();
		
		largest(a,b,c);

	}

	
	
	public static void largest(int a,int b,int c)
	{
		if(a==b&&b==c)
		{
			System.out.println("Equal nos");
		}
		else if(a>b&&b>c)
		{
			System.out.println("Largest No : "+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("Largest No :"+b);
		}
		else
		{
			System.out.println("Largest No : "+c);
		}
	}
}
