package strings;

public class SBAppend {
	public static void main(String arg[]) {
		StringBuffer a1 = new StringBuffer("abc");
		StringBuffer a2 = new StringBuffer("def");
		System.out.println("Appending another StringBuffer- " + a1.append(a2));
		String a3 = "ghi";
		System.out.println("Appending a String- " + a1.append(a3));
		char c1[] = { 'j', 'k', 'l' };
		System.out.println("Appending a  character array- " + a1.append(c1));
		System.out.println("Appending part of a character array- " + a1.append(c1, 0, 2)); // LINE A
		System.out.println("Appending a boolean- " + a1.append(true));
		System.out.println("Appending a character- " + a1.append('Z'));
		System.out.println("Appending an integer- " + a1.append(1));
		System.out.println("Appending a double- " + a1.append(2.35));
	}

}
