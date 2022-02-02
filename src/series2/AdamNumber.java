package series2;

import java.util.Scanner;

public class AdamNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to number");
		int num = sc.nextInt();

		int n1 = num;// 12
		int n3 = reverse(n1);// 21
		int n4 = (int) Math.pow(n1, 2);// 144
		int n5 = (int) Math.pow(n3, 2);// 441
		int n6 = reverse(n5);// 144

		if (n4 == n6) {
			System.out.println("Adam Number");
		} else
			System.out.println("Not Adam");

	}

	public static int reverse(int n) {
		int d = 0, rev = 0;
		while (n > 0) {
			d = n % 10;
			rev = d + rev * 10;
			n = n / 10;
		}
		return rev;
	}

}
