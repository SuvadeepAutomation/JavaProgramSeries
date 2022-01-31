package series1;

import java.util.Scanner;

public class FinoacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n");
		int n=sc.nextInt();
		fibonnaci(n);

	}

	public static void fibonnaci(int n)
	{int a=0,b=1;
	int count=0;
	int sum=0;
		System.out.println("Fibonacci Series");
		System.out.println(a);
		System.out.println(b);
		while(count<n-2)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			count++;
		}
		
	}
	
}
