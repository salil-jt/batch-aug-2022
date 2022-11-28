package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
public static void main(String[] args) {
	HashMap<String, String> lhm = new HashMap<String, String>();
    lhm.put("Ramesh", "Intermediate");
    lhm.put("Shiva", "B-Tech");
    lhm.put("Santosh", "B-Com");
    lhm.put("Asha", "Msc");
    lhm.put("Raghu", "M-Tech");
    
    Set set = lhm.entrySet();
    Iterator i = set.iterator();
    while (i.hasNext()) {
        Map.Entry me = (Map.Entry) i.next();
        System.out.println(me.getKey() + " : " + me.getValue());
    }
            
    System.out.println("The Key Contains : " + lhm.containsKey("Shiva"));
    System.out.println("The value to the corresponding to key : " + lhm.get("Asha"));    

}
}
