package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
public static void main(String[] args) {
	Map<String, String> m = new HashMap<String, String>();
    Map<String, String> m1 = new HashMap<String, String>();
    System.out.println("Map objects equal : " + m.equals(m1)); 
    
    m.put("8", "Prakash");
    m.put("31", "Shabaz");
    m.put("12", "Raj");
    m.put("14", "Praveen");
    m.put("5", "Gopi");
    m.put("51", "Mihir");

    System.out.println(m);
    
    System.out.println("Size of Map : " + m.size());
    System.out.println("Key contains : " + m.containsKey("31")); // LINE A
    System.out.println("Value contains : " + m.containsValue("Raj")); 
    
    System.out.println("Get value : "+m.get("31"));
    
    System.out.println(m.hashCode());
    
    System.out.println("Is map empty : " + m.isEmpty());
    
    
    System.out.println("Removes the key value : " + m.remove("12")); 
    System.out.println(m);
    
    
    
    System.out.println("Key set : " + m.keySet()); // LINE E
    System.out.println("Collection values : " + m.values()); // 
    
    
    m1.putAll(m); 
    System.out.println("M Map :"+m);
    System.out.println("M1 map: "+m1);
    
    m.clear();
    
    System.out.println("M Map :"+m);
    System.out.println("M1 map: "+m1);


}

}
