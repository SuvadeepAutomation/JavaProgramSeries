package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) {

		// while loop
		int j = 1;// initialization
		while (j <= 10) // conditional
		{
			System.out.println(j);// statement
			j++;// Increment/decrement
		}

		// infinite loop
		/*
		 * int i = 1; while (i <= 10) { System.out.println(i); }
		 * 
		 * while (true) { System.out.println("Welcome home"); }
		 */

		// For loop

		/*
		 * 
		 * When no of iterations are not predefined --> use while when no of iterations
		 * are pre-defined-->for loop
		 * 
		 */

		for (int k = 0; k <= 10;) {
			System.out.println(k);
			k++;
		}
		/*
		 * for(;;) { System.out.println("Hello"); }
		 */
		// a to z

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
		}

		
		//do while
		/*
		int p=1;
		do {
			System.out.println(p);
		}
		while(p<=10)
		{
			
		}
		*/
		//4. foreach
		//5.streams-->JDK8 for Arraylist
		//6. forEach loop method
		
	
	}

}
