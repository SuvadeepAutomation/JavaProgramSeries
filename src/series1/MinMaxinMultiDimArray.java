package series1;

public class MinMaxinMultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 23, 34, 12 }, { 33, 7, 11 }, { 9, 45, 22 } };
		System.out.println(" Minimum values : " + minArray(arr));
		System.out.println(" Maximum values : " + maxArray(arr));
	}

	/*
	 * Finding minimum
	 * 
	 * */
	
	public static int minArray(int a[][]) {
		int min = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
		}

		return min;
	}

	
	/*
	 * Finding maximum
	 * 
	 * */
	public static int maxArray(int a[][]) {
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}

		return max;
	}

}
