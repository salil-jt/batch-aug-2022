package strings;

public class SBLength {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java Programming");
		System.out.println(sb + "\nLength = " + sb.length());
		sb.setLength(18); // LINE A
		System.out.println(sb + "\nLength = " + sb.length());
		sb.setCharAt(16, '.');
		sb.setCharAt(17, '.');
		System.out.println(sb + "\nLength = " + sb.length());
		sb.setLength(4); // LINE B
		System.out.println(sb + "\nLength = " + sb.length());

	}
}
