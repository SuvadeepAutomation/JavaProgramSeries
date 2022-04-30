package sdetQuestions;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {

		/*
		 * Write a code to sort the list of Strings using Java Collection
		 */

		String inputList[] = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };

		System.out.println("-----Input List-----------");
		showList(inputList);

		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);

		System.out.println("--------Sorted List---------");
		showList(inputList);

	}

	public static void showList(String[] arr) {
		for (String str : arr) {
			System.out.println(str);
		}
	}

}
