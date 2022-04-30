package javaBasics;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {

		// ArrayList - Dynamic Array
		// It is class
		// Index based collection-- linear collection

		ArrayList ar = new ArrayList();

		ar.add(100);
		ar.add(200);
		ar.add(300);

		System.out.println(ar.size());

		ar.add(400);
		ar.add(500);

		System.out.println(ar.size());

		ArrayList<Object> ob = new ArrayList<Object>();
		ob.add(100);
		ob.add("testing");
		ob.add('c');
		ob.add(true);
		ob.add(12.33);

		System.out.println(ob.get(1));

		// generic arraylist

		// Integer arraylist
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);

		// String arraylist

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("test");
		ar2.add("dev");
		ar2.add("uat");

		System.out.println(ar2.get(1));

		for (String e : ar2) {
			System.out.println(e);
		}

		// why Arraylist is so important in Selenium

		/*
		 * In web-automation, it is very dynamic in nature. Today we might have 100
		 * links , tomorrow we can have 150 links Due to this ,dynamic array is
		 * important
		 */

		/*
		 * What is virtual capacity of Arraylist What is default capacity of Arraylist
		 * In debugger mode show the vc of arraylist What is the implementation of
		 * Arraylist
		 * 
		 */
	}

}
