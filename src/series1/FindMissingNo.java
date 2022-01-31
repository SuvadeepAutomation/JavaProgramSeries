package series1;

public class FindMissingNo {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int n = a.length;

		int sum = 0;
		int missNo;
		int sumArr = 0;
		sum = ((n + 2) * (n + 1)) / 2;
		for (int i = 0; i < n; i++) {
			sumArr = sumArr + a[i];
		}

		missNo = sum - sumArr;
		System.out.println("Missing No : " + missNo);
	}

}
