package collectionframework;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {
public static void main(String[] args) {
	
	
	ArrayList<String> names = new ArrayList<>();
	names.add("Pooja");
	names.add("Sneha");
	names.add("Pooja");
	names.add("Neha");
	System.out.println("Size is : "+ names.size() + " Names : "+names );
	
	
	HashSet<String> namesHS = new HashSet<>();
	namesHS.add("Pooja");
	namesHS.add("Sneha");
	namesHS.add("Pooja");
	namesHS.add("Neha");
	System.out.println("Size is : "+ namesHS.size() + " Names : "+namesHS );
	
	
}
}
