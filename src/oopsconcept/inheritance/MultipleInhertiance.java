package oopsconcept.inheritance;

public class MultipleInhertiance {
public static void main(String[] args) {
	Z1 obj = new Z1();
	obj.m1();
	// Diamond Problem
}
}


class X1{

	void m1() {
		System.out.println("In m1 of X");
	}
	
}
class Y1 extends X1{
	
	void m1() {
		System.out.println("In m1 of Y");
	}
}


class Z1 extends X1{
	
	
}