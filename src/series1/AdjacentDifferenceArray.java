package series1;


public class AdjacentDifferenceArray {

	/*
	 * Find Difference between any adjacent index in an array
	 * 
	 * */
	public static void main(String[] args) {

		 int arr[]={12,45,7,22,19};
	      int count=0;
	      int len=arr.length;
	      int a[]=new int[len];
	      for(int i=0;i<len-1;i++)
	      {
	           a[count++]=arr[i]-arr[i+1];
	      }
	      for(int k=0;k<count;k++)
	      {
	          System.out.println("Adjacent difference : "+a[k]);
	      }
	    }
	

	}


