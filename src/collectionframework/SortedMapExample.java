package collectionframework;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortedMapExample {
public static void main(String[] args) {
    TreeMap<String, Double> tm = new TreeMap<String, Double>();
    tm.put("Santosh", new Double(3020.55));
    tm.put("Ram", new Double(2550.22));
    tm.put("Nishan", new Double(2060.66));
    tm.put("Amar", new Double(1890.88));
    tm.put("Om", new Double(1650.11));
    System.out.println("Map after initialization : " + tm);
    
    tm.put("Abhishek", new Double(1232.11));
    System.out.println("Map after adding ele, : " + tm);

//    Set set = tm.entrySet(); // Setting entry set
//    Iterator i = set.iterator(); // Iterating to set
//    while (i.hasNext()) {
//        // Assigning iterator to map entry
//        Map.Entry m = (Map.Entry) i.next();
//        if (m.getKey().equals("Ram")) {
//            m.setValue(3550.33); // Set value for Ram key
//        }
//        // Getting key and value from map entry
//        System.out.println(m.getKey() + " : " + m.getValue());
//    }
//    System.out.println("Map after changing Ram value : " + tm);
//    
    System.out.println("First key : " + tm.firstKey());
    System.out.println("Last key : " + tm.lastKey());
    System.out.println("Keys set : " + tm.keySet());
    System.out.println("Values set : " + tm.values());
    System.out.println("Head map : " + tm.headMap("Om"));
    System.out.println("Sub map : " + tm.subMap("Nishan", "Santosh"));
    System.out.println("Tail map : " + tm.tailMap("Om"));

}
}
