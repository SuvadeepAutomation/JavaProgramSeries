package series1;

import java.util.HashMap;
import java.util.Set;

public class CountOccurences {

	public static void main(String[] args) {

/*
 * 
 * Logic to count the no of occurences of characters in the String 
 * 
 * 
 * */
		String str="Better Butter";
		HashMap<Character,Integer> charCountMap=new HashMap<Character,Integer>();
		
		char[] strArray=str.toCharArray();
		
		for(char c:strArray)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
				charCountMap.put(c, 1);
		}
		Set<Character> charInString=charCountMap.keySet();

		for(char ch:charInString)
		{
			if(charCountMap.get(ch)>1)
			{
				System.out.println("Count of "+ch+" is "+charCountMap.get(ch));
			}
			else 
				System.out.println(" No duplicate : "+ch+" is "+ charCountMap.get(ch));
		}

		
	}

	}


