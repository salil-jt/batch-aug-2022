package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
public static void main(String[] args) {
	LinkedList characters = new LinkedList(); // LINE A
    characters.add('A');
    characters.add('C');
    characters.add('D');
    System.out.println("Original list: " + characters);
    characters.add(1, 'B'); // LINE B
   
    System.out.println("After adding B: " + characters);
    List numbers = new ArrayList(); // LINE C
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    characters.addAll(numbers); // LINE D
    System.out.println("After adding numbers: " + characters);
    characters.addFirst("First"); // LINE E
    characters.addLast("Last"); // LINE F
    System.out.println("After adding First and Last: " + characters); // LINE G
    characters.removeFirst(); // LINE H
    characters.removeLast(); // LINE I
    System.out.println("After removing First and Last:" + characters);
//    //converting characters to char[] array
    Object[] newCharacters = characters.toArray(); // LINE J
//    System.out.println("Conveting LinkedList to Array of objects: ");
    for (Object newCharacter : newCharacters)
    {
        System.out.print(newCharacter + ", ");
    }


}
}
