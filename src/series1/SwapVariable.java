package series1;

public class SwapVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Swap with temp variable");
		withTemp(23,34);
		System.out.println("Swap without temp variable");
		withoutTemp(23,34);
		
	}

	
	//With temporary variable 
	
	public static void withTemp(int a,int b)
	{
		int temp=0;
		if(a==b) 
			System.out.println("Nos are equal");
		else 
		{
			temp=a;
			a=b;
			b=temp;
			
		}
		System.out.println("Variable a ="+a);
		System.out.println("Variable b ="+b);
	}
	
	//Without temporary variable
	
	public static void withoutTemp(int a,int b)
	{
		if(a==b)
			System.out.println(" Both are equal no");
		else
			
			{
				a=a-b;
				b=b+a;
				a=b-a;
			}
		System.out.println("Variable a ="+a);
		System.out.println("Variable b ="+b);
	}
	
}
