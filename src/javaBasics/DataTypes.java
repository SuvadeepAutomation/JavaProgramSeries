package javaBasics;

public class DataTypes {

	public static void main(String[] args) {


		//DataTypes
		//primitive data types--> take the space inside the memory directly . 
		//We dont need to create object for that
		//Integer family : byte,short,long,int
		//floating family: double ,float
		//character : char
		//boolean: true/false.
		
		//1. byte 
		//size: 8 bits =1 byte
		//range: -128 to 127
		byte b=10;//allocation
		
		
		//2. short
		//size : 16 bits=2 bytes
		//range : -32768 to 32767
		
		short s=10;
		
		//3. integer
		//size :32 bits = 4 bytes
		//range : -2^31 to 2^32
		int i=123;
		
		
		//4. long 
		//size : 8 bytes 
		//range : -2^63 to 2^63-1
		long phone=999999999;
		long distance=1001010101;
		
		//5. float
		//size :4 bytes =32 bits
		//range : after point it can take upto 7 digits
		float f1=12.33f;
		float g=(float)34.44;
		
		//6.double
		//size : 8 bytes=64 bits
		//range : after point it can take upto 15 digits
		
		double d=12.33333;
		
		//yellow line warning is because we are not using the variable
		//if you use it the error will be gone
		
		System.out.println(d); //warning is gone now
		
		//7. char
		//size : 16 bits=2 bytes
		//only single digit value is allowed
		char c='a';
		
		//8. boolean
		//size : ~1 bit
		boolean b1=true;
		
		
		
		
		
		
	}

}
