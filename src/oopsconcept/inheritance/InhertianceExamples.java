package oopsconcept.inheritance;

public class InhertianceExamples {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.name = "vehicle1";
		vehicle.print();

		Car chevrolet = new Car();
		chevrolet.name = "chevy car";
		chevrolet.print();

	}

}

class Vehicle {

	String name;

	void print() {

		System.out.println("Name is : " + this.name);
	}

}

class Car extends Vehicle {

	
}
