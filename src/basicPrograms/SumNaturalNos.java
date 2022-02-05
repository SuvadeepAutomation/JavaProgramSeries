package basicPrograms;

import java.util.Scanner;

public class SumNaturalNos {

	// Sum of Natural Nos
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		natural(n);

	}

	public static void natural(int n) {
		int sum = 0;
		sum = (n * (n + 1)) / 2;
		System.out.println(" Sum of Natural nos :" + sum);
	}
}
