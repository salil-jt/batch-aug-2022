package oopsconcept.inheritance;

public class RunTimePolymorphism {
	public static void main(String arg[]) {
		int input = 40;

		A_1 aref;

		if (input < 10) {
			aref = new A_1();
		} else if (input < 30) {
			aref = new B_1();
		} else {
			aref = new C_1();
		}

		//aref.print(); // LINE A
		
		
		
		//B_1 objB1 = new A_1();

	}

}

class A_1 {
	void print() {
		System.out.println("class A method called.");
	}
}

class B_1 extends A_1 {
	void print() {
		System.out.println("class B method called.");
	}
}

class C_1 extends A_1 {
	void print() {
		System.out.println("class C method called.");
	}
}
