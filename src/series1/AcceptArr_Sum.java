package series1;

public class AcceptArr_Sum {

	public static void main(String[] args) {


		int arr[]= {1,2,3};
		System.out.println("Sum : "+sumArray(arr));
	
	}

	//Method to accept array and return sum of all the elements in array
	
	public static int sumArray(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
}
