package javaBasics;

public class IfElseConditional {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println(a == b);

		if (a == b) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}

		// dead code or unreachable code
		// else condition will never satisfy
		if (true) {
			System.out.println("Java");
		} else {
			System.out.println("Selenium");
		}

		String s1 = "Selenium";
		String s2 = "selenium";

		if (s1.equals(s2)) {
			System.out.println("Both are equal");
		} else
			System.out.println("Both are not equal");

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Both are equal");
		}

		if (s1 == s2) // Compare the object references not the value
		{
			System.out.println("References are equal");
		}

		// Nested if condition

		/*
		 * 
		 * the problem here is once the first condition is satisfied unnecesarily checks
		 * are going to be performed at each of the if statements if 100 if conditions
		 * are present, it will check for all 100
		 * 
		 */

		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		if (browser.equals("safari")) {
			System.out.println("launch safari");
		}

		/*
		 * the problem here is it will check for each of the if conditions until the
		 * condition satisfies if there are 100 if conditions and our condition
		 * satisfies at 50th then it will check till 50 condition once condition is
		 * satisfied it will not execute the other if conditions better approach than
		 * the above one To solve this problem we use switch case
		 */

		String browser1 = "chrome";

		if (browser1.equals("chrome")) {
			System.out.println("launch chrome");
		} else if (browser1.equals("firefox")) {
			System.out.println("launch firefox");
		} else if (browser1.equals("safari")) {
			System.out.println("launch safari");
		} else
			System.out.println("Please pass a correct browser");

		/*
		 * switch case
		 * it first find out the matching case
		 * once matching case is found then only it goes inside the block
		 * once executed it breaks out of the block
		 * 
		 */

		String browser2 = "chrome";

		switch (browser2) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("Please pass the correct browser" + browser2);
			break;
		}
	}

}
