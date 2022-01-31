package series1;

public class MinMax1DArray {

	public static void main(String[] args) {

		int a[] = { 12, 11, 23, 45, 67, 7, 91, 24, 8 };

		System.out.println("Minimun in an array" + findmin(a));
		System.out.println("Maximun in an array" + findmax(a));

	}

	public static int findmin(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int findmax(int arr[]) {
		int max = arr[0];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
			}
		}
		return max;
	}

}
