package patterns;

/*
 * 
 * 
 * ---Pattern 1---
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
---Pattern 2---
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
---Pattern 3---
     A 
    B B 
   C C C 
  D D D D 
 E E E E E 
 * 
 * 
 * ---Pattern 4---
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
---Pattern 5---
     1 
    1 2 
   1 2 3 
  1 2 3 4 
 1 2 3 4 5 

 * 
 * 
 * */

public class Pattern5 {

	public static void main(String[] args) {

		System.out.println("---Pattern 1---");
		pattern1(5);
		System.out.println("---Pattern 2---");
		pattern2(5);
		System.out.println("---Pattern 3---");
		pattern3(5);
		System.out.println("---Pattern 4---");
		pattern4(5);
		System.out.println("---Pattern 5---");
		pattern5(5);
	}

	public static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int sp = 0; sp <= n - i; sp++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= i; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int sp = 0; sp <= n - i; sp++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= i; col++) {
				System.out.print((char) (col + 64) + " ");
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int sp = 0; sp <= n - i; sp++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= i; col++) {
				System.out.print((char) (i + 64) + " ");
			}
			System.out.println();
		}
	}

	public static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int sp = 0; sp <= n - i; sp++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= i; col++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void pattern5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int sp = 0; sp <= n - i; sp++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= i; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
