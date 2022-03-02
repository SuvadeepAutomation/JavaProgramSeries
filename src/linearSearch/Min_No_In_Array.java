package linearSearch;

public class Min_No_In_Array {

	public static void main(String[] args) {

		int arr[] = { 100, 23, 36, 44, 55, 6, 77, 8, 91, 10 };
		int min = minArray(arr);
		System.out.println("Minimum No : " + min);

	}

	public static int minArray(int arr[]) {
		int minimum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (minimum > arr[i]) {
				minimum = arr[i];
			}

		}
		return minimum;
	}

}
