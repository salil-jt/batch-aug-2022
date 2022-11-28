package collectionframework;

import java.util.TreeSet;

public class TreeSetCustomSortingDemo {
public static void main(String[] args) {
	TreeSet<Student> students = new TreeSet<Student>(); // LINE B
    students.add(new Student("Sreeram", 10, 'A'));
    students.add(new Student("Karthik", 12, 'A'));
    students.add(new Student("Ram", 14, 'B'));
    students.add(new Student("Yeshwanthi", 5, 'C'));
    students.add(new Student("Bhavya", 6, 'D'));
    
    System.out.println(students);

}
}
class Student implements Comparable<Student>
{
    String name;
    int rollNumber;
    char section;
    
    public Student(String name, int rollNumber, char section)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.section = section;
    }
    
    public String toString()
    {
        return name + " " + rollNumber + " " + section;
    }

	@Override
	public int compareTo(Student o) {
		return o.rollNumber - rollNumber;
	}
    
   
}
