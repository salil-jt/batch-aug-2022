package oopsconcept.inheritance;

public class MultiLevelMethodOverriding {
	public static void main(String[] args) {
		A a = new A();
		//a.print();
		
		
        B b = new B();
       // b.print();
        
        C c = new C();
      //  c.print();
        
        
        D d = new D();
//        d.print();
        
        E e = new E();
        e.print();





	}
}

class A {
	void print() {
		System.out.println("In class A");
	}
}

class B extends A {
	void print() {
		super.print();
		System.out.println("In class B");
	}
}

class C extends B {
	void print() {
		super.print();
		System.out.println("In class C");
	}
}

class D extends A {
	void print() {
		System.out.println("In class D, printing before super class A");
	    super.print();
	}
}

class E extends A {
	void print() {
		System.out.println("In class E, not calling the super class method at all.");
	}
}
