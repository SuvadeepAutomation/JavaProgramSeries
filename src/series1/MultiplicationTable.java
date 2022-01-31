package series1;

public class MultiplicationTable {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("9 * " + i + " = " + multiply(9, i));
		}
	}

	public static int multiply(int n, int x) {
		int mult = 0;
		for (int i = 1; i <= x; i++) {
			mult = mult + n;
		}
		return mult;
	}

}
