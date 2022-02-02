package series2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "MA DAM";
		String str2 = "DA MMA";

		isAnagram(str1, str2);
	}

	public static void isAnagram(String str1, String str2) {
		String newstr1 = str1.replace("\\s", "");
		String newstr2 = str2.replace("\\s", "");

		boolean status = true;

		if (newstr1.length() != newstr2.length()) {
			status = false;
		} else {
			char[] array1 = newstr1.toLowerCase().toCharArray();
			char[] array2 = newstr2.toLowerCase().toCharArray();

			Arrays.sort(array1);
			Arrays.sort(array2);

			status = Arrays.equals(array1, array2);
		}
		if (status) {
			System.out.println("Anagram");
		} else
			System.out.println("Not Anagram");
	}

}
