package patterns;

/*
 *
 * Pattern 1
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 

 * 
 * 
 * Pattern 2
 * 
 * 1 2 3 4 5 
   1 2 3 4 5 
   1 2 3 4 5 
   1 2 3 4 5 
   1 2 3 4 5
 * 
 * 
 * 
 * Pattern 3
 * 
 * A B C D E 
   A B C D E 
   A B C D E 
   A B C D E 
   A B C D E 
 * 
 * 
 * */

public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("----Pattern 1------------");
		pattern1(5);
		System.out.println("----Pattern 2------------");
		pattern2(5);
		System.out.println("----Pattern 3------------");
		pattern3(5);
	}

	public static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char) (64 + j) + " ");
			}
			System.out.println();
		}
	}

}
