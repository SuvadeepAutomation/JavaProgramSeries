package linearSearch;

/*
 * 
 * Account={{1,2,3},{1,5,10},{2,1,2}}
 * 
 * Outer array are persons
 * Elements inside the array is the wealth they are carrying
 * Person 1=1+2+3=6
 * Person 2=1+5+10=16
 * Person 3=2+1+2=5
 * 
 * O/P --> Person 2
 * 
 * 
 * 
 * */

public class LeetcodeProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int account[][] = { { 1, 2, 3 }, { 1, 5, 10 }, { 20, 1, 2 } };

		System.out.println(" Highest sum of account balance " + checkHighest(account));

	}

	public static int checkHighest(int account[][]) {
		int arr[] = new int[10];
		int count = 0;
		int sum = 0;
		int max = 0;
		for (int i = 0; i < account.length; i++) {
			for (int j = 0; j < account[i].length; j++) {
				sum = sum + account[i][j];
			}
			arr[count++] = sum;
			sum=0;
		}
		max = arr[0];
		for (int k = 0; k < count; k++) {
			if (max < arr[k]) {
				max = arr[k];
			}

		}
		return max;

	}

}
