package linearSearch;

public class LeetcodeProblem1 {

	/*
	 * 
	 * Given array num of integers , returns how many of them contains an even no of
	 * digits Input : num=[12,345,2,6,7896] Output : 2
	 * 
	 * 12 contains 2 digit(Even) 345 contains 3 digit 2 contains 1 digit 6 contains
	 * 1 digit 7896 contains 4 digit(Even)
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int arr[] = { 12, 345, 2, 6, 7896 };

		System.out.println("No of elements with even digits :" + evenDigits(arr));

	}

	public static int evenDigits(int arr[]) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (digitcount(arr[i]) % 2 == 0) {
				cnt++;
			}
		}
		return cnt;
	}

	public static int digitcount(int n) {
		int count = 0;
		while (n > 0) {
			int rem = n % 10;
			count++;
			n = n / 10;
		}
		return count;
	}

}
