package oopsconcept;

public class ExampleOfAMethod {

	static void add(int a, int b) {
		int c = a + b;
		System.out.println("Sum of a+b is :" + c);
		
	}
	
	static void mul(int a, int b) {
		int c = a * a;
		System.out.println("Mul of a*b is :" + c);
		
	}
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 9;
		
		add(b,a);
		mul(b,a);
		
		
		
	}
	
	
	
}
