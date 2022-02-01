package series2;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		System.out.println("Factorial of number :" + factorial(n));

	}

	public static int factorial(int num) {

		if (num >= 1)
			return num * factorial(num - 1);
		else
			return 1;

	}

}
