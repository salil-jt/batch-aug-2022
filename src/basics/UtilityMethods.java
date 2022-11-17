package basics;

public class UtilityMethods {
	public static void main(String[] args) {

		long t1 = System.currentTimeMillis();
		System.out.println(t1);
		
		int num  = 0;
		
		while(num < 1001) {
			
			for(int i=0;i<num;i++) {
				int a = 5*2;
				System.out.println("A");
			}
			num++;
		}
		System.out.println("Done");
		long t2 = System.currentTimeMillis();
		System.out.println("Time for the program :  " + (t2 -t1 ) + " ms");
		
		
	}

}
