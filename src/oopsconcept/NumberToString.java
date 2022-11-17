package oopsconcept;

public class NumberToString {
public static void main(String[] args) {
	int i = 32;
    String s1 = "" + i; // LINE A
    System.out.println("s1 = " + s1);
    
    double d = 876.54;
    String s2 = String.valueOf(d); // LINE B
    System.out.println("s2 = " + s2);
    
    float f = 156.8f;
    String s3 = Float.toString(f); // LINE C
    System.out.println("s3 = " + s3);
    
    String s4 = "" + i + d; // LINE D
    
    System.out.println("s4 = " + s4);
    int n = s4.indexOf('.');
    System.out.println(n + " Digits before decimal point of s4 string.");
    System.out.println(s4.length() - n - 1
            + " Digits after decimal point of s4 string.");    

}
}
