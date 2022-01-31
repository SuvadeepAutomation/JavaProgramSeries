package series1;

public class CheckPallindrome {

	public static void main(String[] args) {
	

		String s="MADAM";
		if(s.equals(reverse(s)))
		{
			System.out.println("String is Pallindrome");
		}
		else
			System.out.println("String is not Pallindrome");
	}
	
	/*
	 * Reverse of a number 
	 * 
	 * */
	
	public static String reverse(String str)
	{
		String rev="";
		int n=str.length();
		char ch[]=str.toCharArray();
		for(int i=n-1;i>=0;i--)
		{
		rev=rev+ch[i];	
		}
		return rev;
	}
	
}