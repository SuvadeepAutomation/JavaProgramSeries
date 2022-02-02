package series2;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String str = "I am Suvadeep Basu";
		String newstr = "";
		String st[] = str.split("\\s");

		int l = st.length;

		for (int i = l - 1; i >= 0; i--) {
			newstr = newstr +" "+ st[i];
		}

		System.out.println("Reverse String : " + newstr);

	}

}
