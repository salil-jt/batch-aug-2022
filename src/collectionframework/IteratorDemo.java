package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String arg[])
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) 
        {
            int number = itr.next();
            System.out.print(number + " ");
            if (number == 30)
                itr.remove();
        }
        System.out.println("\n..................");
        itr = numbers.iterator();//LINE A
        while (itr.hasNext()) 
        {
            int number = itr.next();
            System.out.print(number + " ");
        }        
    }

}
