package oopsconcept.inheritance;

public class MultiLevelDefaultConstructors {
	public static void main(String[] args) {
//		A1 a = new A1();
//		System.out.println("---------------");
	//	B1 b = new B1();
//		System.out.println("---------------");
		C1 c = new C1();

	}
}

class A1 {
	A1() // LINE A
	{
		System.out.println("Created A1");
	}
}

class B1 extends A1 {
	B1() {
		System.out.println("Created B1");
	}
}

class C1 extends B1 {
	C1() {
		System.out.println("Created C1");
	}
}
