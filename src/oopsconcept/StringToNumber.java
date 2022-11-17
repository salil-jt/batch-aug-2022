package oopsconcept;

public class StringToNumber {
public static void main(String[] args) {
	String s1 = "25";
    int i1 = Integer.valueOf(s1); // LINE E
    int i2 = Integer.parseInt(s1); // LINE F
    System.out.println(i1 + " " + i2);
    
    float f1 = Float.valueOf(s1);
    float f2 = Float.parseFloat(s1);
    System.out.println(f1 + " " + f2);
//    
    double d1 = Double.valueOf(s1);
    double d2 = Double.parseDouble(s1);
    System.out.println(d1 + " " + d2);
//    
    System.out.print("The sum of all numbers is : ");
    System.out.println(i1 + i2 + f1 + f2 + d1 + d2); // LINE G
    
    String s2 = "ABCD";
    char c1[] = new char[s2.length()];
    for (int i = 0; i < s2.length(); i++) {
        c1[i] = Character.valueOf(s2.charAt(i)); // LINE H
    }
    for (int j = 0; j < c1.length; j++) {
        System.out.print(c1[j] + " ");
    }    

}
}
