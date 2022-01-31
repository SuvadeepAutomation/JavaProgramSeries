package series1;

public class BubbleSortArray {

	public static void main(String[] args) {


		int arr[]= {12,14,19,1,24,7,9};
		sortArray(arr);
		System.out.println(" Sorted Array");
		printArray(arr);

	}

	public static void sortArray(int arr[])
	{
		int n=arr.length;
		boolean swapped;
		int i,j,temp=0;
		for(i=0;i<n-1;i++)
		{
			swapped=false;
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false)		
			break;
		}	
	}
	
	public static void printArray(int arr[])
	{
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
	
	
}
