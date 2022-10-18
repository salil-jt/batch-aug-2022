package oopsconcept.programs;

public class FindRectangleArea {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle(100, 5);
		System.out.println("Area is : " + rect1.getArea());
		
		Rectangle rect2 = new Rectangle(3, 4);
		System.out.println("Area is : " + rect2.getArea());
		
		rect1.totalSurfaceArea();
	}
}

class Rectangle {
	double length;
	double breadth;

	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	double getArea() {
		return length * breadth;
	}
	
	double totalSurfaceArea() {
		return length * breadth * 2;
	}
}
