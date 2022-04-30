package sdetQuestions;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse(123));

	}

	public static int reverse(int a) {
		int n = a;
		int d = 0;
		int rev = 0;

		while (a >0) {
			d = n % 10;
			rev = (rev * 10)+d;
			a = a / 10;
		}
		return rev;
	}
}
