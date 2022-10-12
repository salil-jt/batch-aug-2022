package oopsconcept;

public class ReturningAValue {
	


	static int add(int a, int b) {
		int c = a + b;
		return c;
		
	}
	
	static void mul(int a, int b) {
		int c = a * a;
		System.out.println("Mul of a*b is :" + c);
		
	}
	
	public static void main(String[] args) {
		
		int a = 15;
		int b = 91;
		
		int sum = add(b,a);
		System.out.println("Sum is : "+sum);
		
		
		System.out.println(add(10,60));
		
		// if my sum is > 10 then only I want to call the mul method
		
		
		//mul(b,a);
		
		
		
	}
	
	
	


}
