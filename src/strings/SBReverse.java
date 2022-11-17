package strings;

public class SBReverse {
public static void main(String[] args) {
	
	String name = "Java";
	
	String revName = "";
	
	for(int i=name.length()-1; i >=0 ;i--) {
		revName = revName + name.charAt(i);
	}
	System.out.println("RevName  :"+revName);
	

	String input = "Hello World";
	
	StringBuffer firstWord = new StringBuffer(input);
    System.out.println(firstWord);
    firstWord.reverse();
    System.out.println(firstWord);    
    
   
    

	
}
}
