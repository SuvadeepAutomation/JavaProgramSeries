package patterns;

/*
 *  
 *  
 ********
  *****
   ***
    *
 * 
 * 
 * */

public class pattern7 {

	public static void main(String[] args) {

		pattern1(5);
	}

	public static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int sp = 0; sp < i; sp++) {
				System.out.print(" ");
			}
			for (int j = 1; j < 2 * n - 2 * i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
