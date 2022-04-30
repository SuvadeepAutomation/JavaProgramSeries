package javaBasics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();

		ar.add("A");
		ar.add("B");
		ar.add("C");

		System.out.println(ar);
		System.out.println(ar.size());

		System.out.println("********Clearing ArrayList***********");

		ar.clear();
		System.out.println(ar);

		ArrayList<String> ar1 = new ArrayList<String>();

		System.out.println("************************");
		ar1.add("A");
		ar1.add("B");
		ar1.add("C");

		System.out.println(ar1);

		// Clone ArrayList
		System.out.println("**********Clone ArrayList");

		ArrayList<String> ar2 = (ArrayList<String>) ar1.clone();
		System.out.println(ar2);

		// contains

		System.out.println("*********Contains*************");
		System.out.println(ar1.contains("C"));
		System.out.println(ar1.contains("D"));
		System.out.println("************Index of ***********");

		System.out.println(ar1.indexOf("B"));
		System.out.println(ar1.indexOf("C") > 3);

		System.out.println("**********Check default capacity*****");
		// Virtual capacity is bydefault 10
		// Once we reach 10
		// It will increase 5 more automatically
		/*
		 * We dont give free memory in Java so for which Java gives virtual capacity 10
		 * once we add more values then virtual capacity increase
		 * 
		 */
		ArrayList<String> ar3 = new ArrayList<String>(2);

		ar3.add("Test");
		ar3.add("Dev");

		System.out.println(ar3);

		// Increase capacity of ArrayList
		ar3.ensureCapacity(15);

		// for Each JDK with lambda

		System.out.println("***********for Each lambda ");

		ar1.forEach(e -> System.out.println(e));
		ar1.forEach(e1 -> System.out.println(e1.toLowerCase()));
		
		
		//Sorting 
		System.out.println("********Sorting***********");
		ArrayList<String> empList=new ArrayList<String>();
		
		empList.add("Tom");
		empList.add("Cummins");
		empList.add("Basu");
		empList.add("Musk");
		
		System.out.println(empList);
		
		Collections.sort(empList);
		System.out.println("Sorted List" +empList);
		
		Collections.sort(empList, Collections.reverseOrder());
		System.out.println("Sorted AL in reverse : "+ empList);
		
		
		
		
		
		

	}

}
