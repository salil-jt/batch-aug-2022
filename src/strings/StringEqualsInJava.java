package strings;

public class StringEqualsInJava {
public static void main(String[] args) {
	
	String s1 = "Tuesday";
	String s2 = "Tuesday";
	String s3 = new String("Tuesday");
	String s4 = new String("Tuesday");
	
	
	System.out.println(s1==s2); //T
	System.out.println(s1==s3); // F
	System.out.println(s1.equals(s2)); //T
	System.out.println(s3.equals(s4)); //T
	System.out.println(s3==s4);  // F
	
	
	
	
	String s5 = "tuesday";
	
	System.out.println(s1.equalsIgnoreCase(s5));
	
	
	System.out.println(s1.startsWith("Tue"));
	System.out.println(s1.endsWith("Tue"));
	
	
	
	
	
	
	
	/*
	if(s1 == s2) {
		System.out.println("Strings s1,s2 are equal");
	}
	else {
		System.out.println("Strings s1,s2 are not equal");
	}
	
	
	if(s3 == s4) {
		System.out.println("Strings s3,s4 are equal");
	}
	else {
		System.out.println("Strings s3,s4 are not equal");
	}
	
	
	
	if(s1.equals(s2)) {
		System.out.println("Strings s1,s2 are equal");
	}
	
	if(s3.equals(s4)) {
		System.out.println("Strings s3,s4 are equal");
	}
	
	
	if(s1==s3) {
		System.out.println("Strings s1,s3 are equal");
	}
	else {
		System.out.println("Strings s1,s3 are  not equal");
	}
	
	if(s1.equals(s3)){
		System.out.println("Strings s1,s3 are equal");
	}
	else {
		System.out.println("Strings s1,s3 are  not equal");
	}
	*/
	
}
}
