package strings;

public class StringBufferExample {
public static void main(String[] args) {

	StringBuffer sb = new StringBuffer("Hello world");
	
	System.out.println(sb);
	
	sb.setCharAt(6, 'W');
	
	System.out.println(sb);
}
}
