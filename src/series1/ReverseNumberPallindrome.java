package series1;

public class ReverseNumberPallindrome {

	/*
	 * 
	 * Reverse a number and check if Pallindrome
	 * 
	 */

	public static void main(String[] args) {

		int num = 121;
		if (num == reverse(num))
			System.out.println("Pallindrome Number");
		else
			System.out.println("Not Pallindrome ");

	}

	public static int reverse(int num) {
		int d = 0;
		int sum = 0;
		while (num > 0) {
			d = num % 10;
			sum = d + (sum * 10);
			num = num / 10;
		}
		return sum;
	}

}
