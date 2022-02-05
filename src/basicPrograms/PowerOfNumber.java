package basicPrograms;

import java.util.Scanner;

public class PowerOfNumber {

	//Power of Number
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Enter power");
		int pr = sc.nextInt();

		System.out.println(" Power of Number : " + power(n, pr));

	}

	public static int power(int n, int power) {
		int num=1;
		while (power>0) {
			num = num * n;
			power--;
		}
		return num;
	}

}
