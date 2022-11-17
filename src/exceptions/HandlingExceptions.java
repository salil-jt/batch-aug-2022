package exceptions;

public class HandlingExceptions {
public static void main(String[] args) {
	
	
	int  a = 10;
	
	int b = 0;
	
	try {
		
		System.out.println("In try block // made a database connection");
		System.out.println("a/b is : " + (a/b));
		System.out.println("Done");
	}
	
	catch(Exception e){
		System.out.println("Some error occurred");
		System.out.println(e);
	}
	
	finally {
		
		System.out.println("always execute");
	}
	
	/*
	int array[] = {1,2,3};
	try {
	System.out.println(array[3]);
	}
	catch(Exception e) {
		System.out.println("Index passed is not valid");
		System.out.println(e);
	}*/
}
}
