package linearSearch;

public class Search_In_2D_Array {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9 } };

		int ele = 5;

		int a[] = search2D(arr, ele);

		if (a[0] == -1 && a[1] == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at row no :" + (a[0]+1) + " columns " + (a[1]+1));
		}

	}

	public static int[] search2D(int arr[][], int ele) {
		int row = arr.length;
		for (int i = 0; i < row; i++) {
			int col = arr[i].length;
			for (int j = 0; j < col; j++) {
				if (ele == arr[i][j]) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}

}
