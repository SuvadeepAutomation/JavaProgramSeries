package javaBasics;

public class StaticArrayConcepts {

	public static void main(String[] args) {
		
		//Arrays 
		//limitations : 
		//size of array is fixed to overcome this use ArrayList(Collection)
		//similar data types can be stored only : to solve this we can use Object Array
		//but we can use ArrayList<Object> - collection
		
		
		
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println("Li ="+0);
		int len=a.length;
		System.out.println("Length :"+len);
		System.out.println("Highest :"+(len-1));
		
		/*
		 * ArrayIndexOutofBounds Exceptions
		 * negative indexing cannot be done in Array
		 * 
		 * */
		//System.out.println(a[5]);
		//System.out.println(a[-1]);
		
		//how to find all the values in array : for loop
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
		
		//forEach loop :
		for(Integer e:a)
		{
			System.out.println(e);
		}
		
		//double array 
		double d[]=new double[2];
		d[0]=12.33;
		d[1]=13.44;
		
		for(Double g:d)
		{
			System.out.println("Double "+g);
		}
		
		String lang[]=new String[3];
		lang[0]="Java";
		lang[1]="Python";
		lang[2]="Ruby";
		
		for(String s:lang)
		{
			System.out.println(s);
		}
		
		//Object Array
		Object ob[]=new Object[5];
		ob[0]="Suvadeep";
		ob[1]='M';
		ob[2]=30;
		ob[3]=5.8;
		ob[4]=true;
		
		for(Object e:ob)
		{
			System.out.println(e);
		}

		
		//Example where static arrays are used : 
		// No of days in a week
		//No of board member
		//whereever the values are not changing you can use array
		
		
	}

}
