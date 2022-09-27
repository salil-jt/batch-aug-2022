package primitivedatatypes;
public class AddNumbers{

public static void main(String[] args){

	byte a = 125;
	byte b = 125;
	byte c = (byte)(a+b); // -128 to 127
	System.out.println(c);
	
	
	int num1  = 2147483647 ;
	int num2 = 30;
	int sum = num1+num2;
	System.out.println(sum);
	
	
}

}