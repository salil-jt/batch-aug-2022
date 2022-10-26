package oopsconcept.inheritance;

public class AbstractClasses {
	public static void main(String[] args) {

		Parent p = new Parent();

		Child child = new Child();
		

	}
}

class Parent {

}

class Child extends Parent {

}

abstract class Caravan {
	private double price;
	private String model;
	private String year;

	public abstract void goFast(); // an abstract method
	public void changeColor() {
		System.out.println("SOmthing");
	}
}

abstract class SubClassCaravan extends Caravan{

	
	
}
