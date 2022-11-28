package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
public static void main(String[] args) {
	List<Student1> list = new ArrayList<Student1>(); 
	
	list.add(new Student1("Nishan", 538, 'A')); // Adding Elements to list
    list.add(new Student1("Ram", 513, 'A'));
    list.add(new Student1("Sanath", 583, 'B'));
    list.add(new Student1("Amar", 504, 'A'));
    list.add(new Student1("Shiva", 506, 'A'));
    list.add(new Student1("Bobby", 589, 'B'));
    
    
    Collections.sort(list, new Comparator<Student1>() { // Comparator in Collections sort
        
        public int compare(Student1 a1, Student1 a2) { // Compare method
            return a1.name.compareTo(a2.name); // LINE A
        }
    });
    
    System.out.println(list);
   

}
}
class Student1 {

    String name;
    int rollno;
    char section;

    public Student1(String name, int rollno, char section) {
        this.name = name;
        this.rollno = rollno;
        this.section = section;
    }

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", rollno=" + rollno + ", section=" + section + "]";
	}
    
    
    
}
