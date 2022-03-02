package linearSearch;

public class Search_in_Range {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int element = 9;
		int start = 2;
		int end = 7;
		int pos = linearSearch(element, arr, start, end);

		if (pos == -1) {
			System.out.println("Element not found");
		} else
			System.out.println("Element found at " + (pos + 1));

	}

	public static int linearSearch(int element, int[] arr, int start, int end) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = start; i <= end; i++) {
			if (element == arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
