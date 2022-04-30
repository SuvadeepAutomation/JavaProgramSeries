package sdetQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		/*
		 * Write a code to filter duplicate elements from an array and print as a list
		 * 
		 */

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 3, 2, 1, 4, 7, 23, 21, 3, 1, 6 };

		Set<Integer> list = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					list.add(arr[i]);
					
				}
			}
		}
		System.out.println(list);
	}

}
