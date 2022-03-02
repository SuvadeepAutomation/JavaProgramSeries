package linearSearch;

public class Linear_Search_Int_array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int element = 5;
		int pos = linearSearch(element, arr);

		if (pos == -1) {
			System.out.println("Element not found");
		} else
			System.out.println("Element found at " + (pos + 1));
	}

	public static int linearSearch(int element, int[] arr) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
