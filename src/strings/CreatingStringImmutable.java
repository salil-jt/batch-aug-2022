package strings;

public class CreatingStringImmutable {
	public static void main(String[] args) {
		String s = "Rohit";
		s=s.concat(" Shetty");// concat() method appends the string at the end
		System.out.println(s);// will print Rohit because strings are immutable objects

	}
}
