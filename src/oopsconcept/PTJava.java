package oopsconcept;

public class PTJava {
	public static void main(String[] args) {
		byte b;
		short s;
		int a;
		long l;
		double c;
		float f;
		char e;
		boolean k;

		Byte b1;

		double res = 2.0/0.0;
		System.out.println(res);
		
		
		Double d1 = new Double(2.0 / 0.0);
		Double d2 = new Double(0 / 0.0);
		System.out.println(d1);
		System.out.println(d1 + ": " + d1.isInfinite());
		System.out.println(d2 + ": " + d2.isNaN());

	}
}
