package series1;

public class MatchvalueArray {

	/*
	 * Compare same indexes of different arrays & create new array for match values
	 * 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a[]= {12,13,14,15,16,17,18};	
	int b[]= {11,13,14,25,16,17,28};		
	int alen=a.length;
	int blen=b.length;
	int count=0;
	int[] newArr=new int[alen];
	
	if(alen==blen)
	{
		for(int i=0;i<alen;i++)
		{
			if(a[i]==b[i])
			{
				newArr[count++]=a[i];
			}
		} 	
		for(int k=0;k<count;k++)
		{
			System.out.println(" New Array : "+newArr[k]);
		}
		
	}
	else {
		System.out.println("Size does not match");			
				}
	
	}

}
