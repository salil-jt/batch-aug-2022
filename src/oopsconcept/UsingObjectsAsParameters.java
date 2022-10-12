package oopsconcept;

public class UsingObjectsAsParameters {
	public static void main(String[] args) {
		Test ob1 = new Test(100, 22);
		Test ob2 = new Test(100, -22);
		
		boolean result = ob1.equals(ob2);
		System.out.println("Result is :"+result);

	}
}

class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}

	// return true if o is equal to the invoking object
	boolean equals(Test o) {
		if (o.a == a && o.b == b)
			return true;
		else
			return false;
	}
}
