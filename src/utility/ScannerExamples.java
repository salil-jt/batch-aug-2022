package utility;

import java.util.Scanner;

public class ScannerExamples {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value :  ");
	int a  = sc.nextInt();
	
	System.out.println("Enter second value :  ");
	int b  = sc.nextInt();
	
	System.out.println("Sum is : " + (a+b));
	
	
}
}
