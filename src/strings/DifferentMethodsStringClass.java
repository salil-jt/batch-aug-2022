package strings;

public class DifferentMethodsStringClass {
public static void main(String[] args) {
	
	String s1 ="Good ";
	String s2 ="morning ";
	String s3 = "!";
	
	//concatentation
	
	System.out.println(s1+s2+s3);
	
	
	
	// length
	System.out.println(s1.length());
	
	//charAt
	
	System.out.println(s1.charAt(2));
	
	
	// for loop + length + charAt
	
	for(int i=0; i < s1.length() ; i++) {
		System.out.println(s1.charAt(i));
	}
	
	
	
	char[] char_one = s1.toCharArray();
	for(int i=0;i<char_one.length;i++)
		System.out.println(char_one[i]);
	
	
	
	String name = "Design";
	
	System.out.println(name.indexOf("si"));
	
	
	
	
}
}
