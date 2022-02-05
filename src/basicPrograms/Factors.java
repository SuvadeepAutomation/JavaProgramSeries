package basicPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println("Factors : " + factors(n));

	}

	public static List<Integer> factors(int n) {
		List<Integer> fact = new ArrayList<Integer>();
		for (int i = 1; i <=n; i++) {
			if (n % i == 0) {
				fact.add(i);
			} else
				continue;
		}
		return fact;
	}

}
