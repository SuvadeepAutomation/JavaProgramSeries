package linearSearch;

public class Linear_Search_String_array {

	public static void main(String[] args) {

		String str = "Suvadeep";
		char ch = 'e';

		int pos = linearsearch(str, ch);
		if (pos == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at " + (pos + 1));
		}

	}

	public static int linearsearch(String str, char ch) {
		if (str.length() == 0) {
			return -1;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				return i;
		}

		return -1;
	}

}
