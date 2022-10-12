package oopsconcept;

public class OverloadingMethods {
	
//	public int add(int a, int b) {
//		System.out.println("In add method with 2 paramters");
//		return a+b;
//	}
	
	
	public float add(float a, int b) {
		System.out.println("In add method with 2 paramters - float");
		return a+b;
	}
	
	
	
//	public int add(int a, int b, int c) {
//		System.out.println("In add method with 3 paramters");
//		return a+b+c;
//	}
	
	public double add(double a, double b) {
		System.out.println("In add method with 2 paramters - double");
		return a+b;
	}
	
	//ellipsis
	public int add(int ...a) {
		System.out.println("In method which can take any no of int argumentss");
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		OverloadingMethods o = new OverloadingMethods();
		System.out.println(o.add(5, 10)); // add method with  2 int parameters
		
		System.out.println(o.add(5, 3, 19)); // add method with  3 int parameters
		
		
		// doubles
		System.out.println(o.add(5.1, 10.3)); 
		
		//float
		System.out.println(o.add(1.1f, 10.3));
		
		//float
		System.out.println(o.add(1.1f, 10)); 
		
		
		System.out.println(o.add(1,2,3,4,5,67,5));
		
		
		
		
		
		
	}

	
}
