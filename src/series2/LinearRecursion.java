package series2;

public class LinearRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 12, 23, 45, 67, 89, 21, 43 };
		int ele = 45;
		int start = 0;
		int l = a.length;

		System.out.println("Linear Search :" + isLinear(a, ele, start, l));

	}

	public static int isLinear(int a[], int ele, int start, int l) {
		if (l < start)
			return -1;
		if (a[start] == ele)
			return start;
		return isLinear(a, ele, start + 1, l);
	}

}
