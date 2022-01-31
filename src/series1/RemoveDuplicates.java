package series1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

/*
 * 
 * Remove duplicates from an Integer Array
 * 
 * 
 * */

		int arr[]= {1,2,3,2,5,6,7,5,1,2};
		int n=arr.length;
		LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			s.add(arr[i]);
		}
	
		System.out.println("Array without Duplicates : "+s);
	}

	
	
	
}
