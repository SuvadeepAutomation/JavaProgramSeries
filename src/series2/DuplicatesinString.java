package series2;

import java.util.HashMap;
import java.util.Set;

public class DuplicatesinString {

	public static void main(String[] args) {

		String str = "Better Butter";

		HashMap<Character, Integer> occur = new HashMap<Character, Integer>();

		char[] chArray = str.toCharArray();

		for (char ch : chArray) {
			if (occur.containsKey(ch)) {
				occur.put(ch, occur.get(ch) + 1);
			} else
				occur.put(ch, 1);
		}

		Set<Character> count = occur.keySet();

		for (char c : count) {
			if (occur.get(c) > 1) {
				System.out.println("Duplicate : " + c);
			} else {
				System.out.println("Unique : " + c);
			}
		}
	}

}
