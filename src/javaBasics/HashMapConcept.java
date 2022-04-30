package javaBasics;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
	
		//key value
		
		HashMap<String , String> empList=new HashMap<String,String>();
		
		empList.put("A", "Tom");
		empList.put("B", "Kate");
		empList.put("C", "Monalisa");
		empList.put("D", "Jonny");
		
		System.out.println(empList.get("B"));
		System.out.println(empList.size());
		
		
		
		
	}

}
