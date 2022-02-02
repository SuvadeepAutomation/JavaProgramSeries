package series2;

import java.util.Scanner;

public class FindAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'A';
		System.out.println("ASCII Value of " + ch + " is "+asciiFind(ch));

	}

	public static int asciiFind(char c) {
		int asc = (int) c;
		return asc;
	}

}
