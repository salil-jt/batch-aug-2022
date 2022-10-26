package oopsconcept.inheritance;

public class MethodOverloading {
public static void main(String[] args) {
	
	ArithemeticUtil a = new ArithemeticUtil();
	
	a.add(10, 20.0);
}
}

class ArithemeticUtil {
	int add(int a, int b) // LINE A
	{
		return a + b;
	}
	
	/*int add(int c, int d) // NOT ALLOWED
	{
	    return c + d;
	}*/

	
	/*double add(int a, int b) // NOT ALLOWED
	{
	    return a + b;
	}*/


	int add(int a, int b, int c) // LINE B
	{
		return a + b + c;
	}
	
	double add(int a, double b) {
		return a + b;
	}

	double add(double a, double b, double c) // LINE C
	{
		return a + b + c;
	}
	
	double add(int a, double b, int c, double d) {
		return a + b + c + d;
	}

	int multiply(int a, int b) {
		return a * b;
	}

	int multiply(int a, int b, int c) {
		return a * b * c;
	}

	

	

}