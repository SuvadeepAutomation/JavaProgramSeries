package series2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		System.out.println("Factorial of number : " + factorial(n));

	}

	public static int factorial(int num) {
		int fact = 1;
		if (num == 1 || num == 0)
			return 1;
		else {
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			return fact;
		}
	}

}
