package series1;

public class LinearSearch {

	public static void main(String[] args) {

		int a[] = { 12, 34, 56, 78, 99, 23 };
		int n = 56;
		int flag = 0;

		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				System.out.println("Element found at " + (i + 1) + " position");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Element Not found");
	}

}
