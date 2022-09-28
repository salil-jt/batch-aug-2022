package oopsconcept;

public class BoXDemoRefVariables {

	public static void main(String[] args) {

		BoxSteel b1 = new BoxSteel();

		BoxSteel b2 = b1;

		b1.width = 10;
		b1.depth = 15;
		b1.height = 20;

		double vol = b1.width * b1.depth * b1.height;

		System.out.println("Voume of b1 is  : " + vol);

		vol = b2.width * b2.depth * b2.height;
		System.out.println("Voume of b2 is  : " + vol);

	// change the height of b1
		
		b1.height = 15;

		vol = b1.width * b1.depth * b1.height;

		System.out.println("Voume of b1 is  : " + vol);

		vol = b2.width * b2.depth * b2.height;
		System.out.println("Voume of b2 is  : " + vol);
		
		
		// change the height of b2
		
				b1 = null;

				//vol = b1.width * b1.depth * b1.height;

				//System.out.println("Voume of b1 is  : " + vol);

				vol = b2.width * b2.depth * b2.height;
				System.out.println("Voume of b2 is  : " + vol);

	}

}

class BoxSteel {
	double width;
	double height;
	double depth;
}
