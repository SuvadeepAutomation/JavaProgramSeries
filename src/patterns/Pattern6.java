package patterns;

public class Pattern6 {

	/*
	 * 
	 * *
*
**
***
****
*****
****
***
**
*
	 * 
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pattern1(5);
	}
	
	
	
	public static void pattern1(int n)
	{
		int col=0;
		for(int row=1;row<=2*n-1;row++)
		{
			if(row<=n)
			{
				col=row;
			}
			else
			{
				col=2*n-row;
			}
			for(int j=1;j<=col;j++)
			{
			System.out.print("*");	
			}
			System.out.println();
		}
	}
	
	
}
