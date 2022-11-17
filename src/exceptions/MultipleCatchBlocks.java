package exceptions;

public class MultipleCatchBlocks {
public static void main(String[] args) {
	
	int a[] = {1,2,3,4,5};
	
	
	try {
		
		System.out.println(a[2]);
		
		int res = a[2]/0;
		System.out.println("Res is: "+res);
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("In catch block");
		System.out.println(e);
		System.out.println("Accessing incorrect index of array");
	}
	catch(Exception e) {
		System.out.println("In catch block");
		System.out.println(e);
		System.out.println("Denominator cannot be 0");
	}
	
	
	
}
}
