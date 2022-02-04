package patterns;

public class Pattern3 {
	
	/*
	 * 
	 * ---Pattern1----
* * * * * 
* * * * 
* * * 
* * 
* 
---Pattern2----
1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 
---Pattern3----
A B C D E 
A B C D 
A B C 
A B 
A 

	 * 
	 * */
	

	public static void main(String[] args) {
		System.out.println("---Pattern1----");
		pattern1(5);
		System.out.println("---Pattern2----");
		pattern2(5);
		System.out.println("---Pattern3----");
		pattern3(5);
	}

	public static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print((char) (65 + n - j) + " ");
			}
			System.out.println();
		}
	}

}
