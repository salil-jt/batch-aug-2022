package oopsconcept.inheritance;

public class RulesForAbstractMandC {
	public static void main(String[] args) {

	}
}

abstract class A0 {
// Valid, even with out any abstract methods
}

abstract class B0 {

	abstract void method1();

	abstract double method2(int x, int y);

	abstract boolean method3(char z);
}

abstract class D0 {
	void method1() {
		System.out.println("I am a concrete method");
	}

	abstract double method2(int x, int y);

	int method3(double z) {
		System.out.println("I am also a concrete method");
		return 0;
	}

	abstract boolean method4(char z);
}

abstract class E0 {
	abstract void method1(); // Valid

	// abstract void method2() {} // Invalid - since it has method body

}

class R extends B0 {

	@Override
	void method1() {
		// TODO Auto-generated method stub

	}

	@Override
	double method2(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	boolean method3(char z) {
		// TODO Auto-generated method stub
		return false;
	}

}

abstract class R0 extends B0 {

}

abstract class X {
	abstract void method1();

	abstract void method2();
}

abstract class Y extends X {
	void method1() {
		System.out.println("Method1 implemented here.");
	}
	
	abstract void method3();
}

class Z extends Y {

	@Override
	void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method3() {
		// TODO Auto-generated method stub
		
	}
}