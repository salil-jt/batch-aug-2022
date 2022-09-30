package oopsconcept;

public class BoxDemo {

	public static void main(String[] args) {

		// first object
		Box myBox1 = new Box();
		// press ctrl+space

		// second object
		Box myBox2 = new Box(); // constructors - default constructor

		// Box myBox2; declare reference to object
		// myBox2 = new Box(); allocate a Box object

		double volume;

		// assign values to mybox1's instance variables , using dot operator
		/*myBox1.depth = 10;
		myBox1.height = 20;
		myBox1.width = 30;

		// assign values to mybox2's instance variables , using dot operator
		myBox2.depth = 15;
		myBox2.height = 10;
		myBox2.width = 12;*/

		/*
		 * compute volume of box1 volume = myBox1.depth * myBox1.height * myBox1.width;
		 * System.out.println("Volume of box1 is :"+volume);
		 */
		// syso -> press ctrl+space

		/*
		 * compute volume of box2 volume = myBox2.depth * myBox2.height * myBox2.width;
		 * System.out.println("Volume of box2 is :"+volume);
		 */

		/*
		 * call volum method to print volume
		 */
		// myBox1.volume();
		// myBox2.volume();

		// call the volume method and print the value returned

        myBox1.setDim(10, 20, 30); // set box1 dimensions

        myBox2.setDim(15, 10, 12);// set box2 dimensions


		
		System.out.println(myBox1.volume());
		System.out.println(myBox2.volume());
		
		

	}

}

class Box {
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

	// sets dimensions of box
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

}
