package oopsconcept;

public class FinalKeyword {
public static void main(String[] args) {
	int a = 10;
	
	System.out.println("The value of a is :"+a);
	
	a = 15;
	System.out.println("The value of a is :"+a);
	
	
	final int MONTHS_IN_A_YEAR = 12;
	System.out.println("Month's in a year:"+MONTHS_IN_A_YEAR);
	
	//code
	//months_in_a_year = 13; // this wont be allowed
	System.out.println("Month's in a year:"+MONTHS_IN_A_YEAR);
	
}
}
