package series1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (isPrime(n) == true)
			System.out.println(n + " is Prime no");
		else
			System.out.println(n + " is not Prime");
	}

	public static boolean isPrime(int n) {
		if (n == 1 || n == 2)
			return true;
		else

			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0)
					return false;
				break;
			}
		return true;
	}

}
