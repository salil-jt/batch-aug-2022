package strings;

public class CreatingStringsInJava {
public static void main(String[] args) {
	String s = "Hello World";
	
	String s1 = new String("Hello World 2");
	
	char c[] = {'j', 'a', 'v', 'a'};
	String s2 = new String(c);
	
	
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);

}
}
