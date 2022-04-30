package arrays_level_1;

public class Peak_Element {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int l=a.length;
		int index=peakElement(a,l);	
		System.out.println(index);
	}

	
	public static int peakElement(int[] arr,int n)
    {
		int peak=arr[0];
		int i;
       for(i=0;i<n;i++)
       {
    	while(peak<arr[i])
    	{
    	peak=arr[i];	
    	}
       }
       return i;
    }
}
