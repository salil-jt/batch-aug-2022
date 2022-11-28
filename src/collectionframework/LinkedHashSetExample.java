package collectionframework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(); // LINE A
		lhs.add("Anderson");
		lhs.add("Bharath");
		lhs.add("Cruse");
		lhs.add("Dinesh");
		System.out.println("Eements retrieved in the order they were inserted : ");
		System.out.println(lhs);
		lhs.remove("Bharath"); // LINE B
		lhs.add("Bhuwaneshwar"); // LINE C
		System.out.println("Set after removing Bharath and adding Bhuwaneshwar : ");
		System.out.println(lhs);
		Object[] names = lhs.toArray();
		System.out.println("Displaying elements in array format : "); // LINE D
		for (Object name : names) {
			System.out.print(name + ", ");
		}
		System.out.println();
		lhs.clear(); // LINE E
		System.out.println("Displaying empty set : ");
		System.out.println(lhs);

	}
}
