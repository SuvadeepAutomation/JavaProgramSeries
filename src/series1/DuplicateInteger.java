package series1;

import java.util.HashMap;
import java.util.Set;

public class DuplicateInteger {

	/*
	 * 
	 * Find duplicate numbers in a Integer Array
	 * 
	 */
	public static void main(String[] args) {

		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		int arr[]= {1,2,3,4,5,6,7,3,2,1,1,4};
		for(int i=0;i<arr.length;i++)
		{
			if(hs.containsKey(arr[i]))
			{
				hs.put(arr[i], hs.get(arr[i])+1);
				System.out.println("Duplicate Element "+arr[i]);
			}
			else
			{
				hs.put(arr[i], 1);
			}
		}
	
	
		
	}

}
