package series2;

import java.util.Scanner;

public class AmgstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();

		int n = 0;
		int num = 0;
		n = number;
		num = number;

		int count = digit(n);
		int sum = isAmgstrong(num, count);

		if (number == sum) {
			System.out.println("Amgstrong Number");
		} else {
			System.out.println("Not Amgstrong");
		}

	}

	public static int digit(int n) {
		int d = 0, count = 0;
		while (n > 0) {
			d = n % 10;
			count++;
			n = n / 10;
		}
		return count;
	}

	public static int isAmgstrong(int num, int count) {
		int div = 0, sum = 0;
		while (num > 0) {
			div = num % 10;
			sum = (int) (sum + Math.pow(div, count));
			num = num / 10;
		}
		return sum;
	}
}
