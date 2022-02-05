package basicPrograms;

public class AlphabetCheck {

	// Check if the character entered is an Alphabet

	public static void main(String[] args) {

		char ch = '/';
		if (isAlphabet(ch)) {
			System.out.println(ch + " is Alphabet");
		} else
			System.out.println(ch + " is not Alphabet");

	}

	public static boolean isAlphabet(char ch) {

		int ascii = (int) (ch);
		System.out.println("ASCII value : "+ascii);
		if (ascii >= 65 && ascii <= 122)
			return true;
		else
			return false;
	}

}
