package series1;

public class SumofDigits {

	public static void main(String[] args) {

		int num = 12345;
		countDigit(num);

	}

	public static void countDigit(int num) {
		int d[] = new int[10];
		int count = 0;
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
			count++;
		}
		System.out.println("Sum of Digits : " + sum);
		System.out.println("Count of digits : " + count);
	}

}
