package series1;

public class OddEvensInArray {

	public static void main(String[] args) {
		int a[] = { 12, 13, 45, 6, 77, 10, 90, 21 };
		
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]); 
		
		}}
	}

	
	}
