package patterns;


/*
 * 
 * 
 * --Pattern 1---
     *
    **
   ***
  ****
 *****
---Pattern 2---
     A
    AB
   ABC
  ABCD
 ABCDE
---Pattern 3---
     A
    BB
   CCC
  DDDD
 EEEEE

 * 
 
 * 
 * 
 * */




public class Pattern4 {

	public static void main(String[] args) {
		System.out.println("---Pattern 1---");
		pattern1(5);
		System.out.println("---Pattern 2---");
		pattern2(5);
		System.out.println("---Pattern 3---");
		pattern3(5);
	}

	
	
	public static void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int sp=0;sp<=n-i;sp++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=i;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int sp=0;sp<=n-i;sp++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=i;col++)
			{
				System.out.print((char)(col+64));
			}
			System.out.println();
		}
	}
	
	public static void pattern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int sp=0;sp<=n-i;sp++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=i;col++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}
