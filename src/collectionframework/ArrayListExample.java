package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
public static void main(String[] args) {
	
	
	List<Integer> numbers = new ArrayList<Integer>();
	
	numbers.add(1);
	numbers.add(21);
	numbers.add(13);
	numbers.add(42);
	numbers.add(18);
	numbers.add(32);
	numbers.add(93);
	numbers.add(4);
	System.out.println(numbers);
	Collections.sort(numbers);
	System.out.println(numbers);
	
	
    ArrayList<String> names = new ArrayList<String>();
    names.add("Raj");
    names.add("Priya");
    names.add("Shashank");
    names.add("Ansh");
    System.out.println("Before sorting, names : " + names);
    
    //Sorting arraylist in ascending order
    Collections.sort(names);         
    System.out.println("After sorting, names : " + names);        

	
    
    ArrayList<Integer> num= new ArrayList<Integer>();
    num.add(15);
    num.add(9);
    num.add(20);
    num.add(35);
    System.out.println("Arraylist num : " + num);
    
    //Replacing element present at 0th index with 40
    num.set(0,40);        
    System.out.println("Arraylist num after updating : " + num);
    
    
    
    ArrayList<String> colors= new ArrayList<String>();
    colors.add("red");
    colors.add("orange");
    colors.add("blue");
    colors.add("pink");
    colors.add("black");
    colors.add("green");

    System.out.println("ArrayList colors : "+colors);
    
    // removing element pink from the arraylist
    colors.remove("pink");
    System.out.println("ArrayList colors : "+colors);

    // removing 3rd element from the arraylist
    colors.remove(2);
    System.out.println("ArrayList colors : "+colors); 
    
    for(int i = 0 ; i<colors.size() ; i++) {
    	System.out.println(colors.get(i)); // colors[i]
    }
    
    
    System.out.println("-------");
    System.out.println(colors);
    System.out.println(colors.isEmpty());
    colors.clear();
    System.out.println(colors.isEmpty());


	
}
}
