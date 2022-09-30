package oopsconcept;

public class BoxDemoConstructors {

	public static void main(String[] args) {

		
		BoxSt myBox1 = new BoxSt(10, 20, 30);

		BoxSt myBox2 = new BoxSt(15,10,12); 
	

		System.out.println(myBox1.volume());
		System.out.println(myBox2.volume());
	}

}

class BoxSt {
	double width;
	double height;
	double depth;

	/*
	 * display volume of a box void volume() { System.out.print("Volume is ");
	 * System.out.println(width * height * depth); }
	 */

	double volume() {
		return width * height * depth;
	}

	/* This is the constructor for BoxSt - non parameterized.
	  BoxSt() {
	    System.out.println("Constructing Box");
	    width = 10;
	    height = 20;
	    depth = 30;
	}*/
	
	
	// Added parameterized constructor
	BoxSt(double w, double h, double d) {
	    width = w;
	    height = h;
	    depth = d;
	}

	  
	 
	


}
