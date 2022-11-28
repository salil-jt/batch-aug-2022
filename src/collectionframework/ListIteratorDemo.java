package collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
public static void main(String[] args) {
    ArrayList ar = new ArrayList();
    ar.add("Black");
    ar.add("Red");
    ar.add("Blue");
    ListIterator litr = ar.listIterator();
    while (litr.hasNext()) // In forward direction
    {
        System.out.print(litr.next() + " ");
    }
    System.out.println();
    while (litr.hasPrevious()) // In reverse direction
    {
        System.out.print(litr.previous() + " ");
    }
    System.out.println();
    litr = ar.listIterator(2); // LINE A - Set iterator at specified index
    System.out.println(litr.previousIndex() + " " + litr.nextIndex()); // Indices
    litr.add("Orange"); // LINE B
    System.out.println("After adding Orange : " + litr.previous());
    litr.remove(); // LINE C
    System.out.println("After removing : " + litr.previous());
    litr.set("Yellow"); // LINE D
    System.out.println("After setting : " + litr.next());    

}
}
