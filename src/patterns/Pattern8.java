package patterns;

public class Pattern8 {

	
	/*
	 * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 

	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		System.out.println("----Pattern1----");
		pattern1(5);

	}

	public static void pattern1(int n) {
		int col, sp;
		for (int i = 1; i <= 2 * n; i++) {
			if (i <= n) {
				col = n - i;
				sp = i - 1;
			} else {
				col = i - n-1;
				sp = i - (2 * col)-2;
			}

			for (int k = 0; k <= sp; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= col; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
