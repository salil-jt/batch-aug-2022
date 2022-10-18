package oopsconcept.programs;

public class ClassDataValidation {
public static void main(String[] args) {

	Student neha = new Student("Neha");
	neha.setDetails(100, 'A');
	neha.print(":::");
	
	
	
	Student uday = new Student("Uday");
	uday.setDetails(150, 'a');
	uday.print(":::");
	
	
	
	Student pooja = new Student("Pooja");
	
	// Name, Marks, Section
	
	// Neha, 100, 'A'
	// Uday, 150 , 'a'
	// Pooja, 200, 'A'
	
	
	// Neha, 100, 'A'
	// Uday, 0 , 
	// Pooja, 0, 'A'
	
}
}

class Student
{
    String name;
    int marks;
    char section;

    Student(String name)
    {
        this.name = name;
    }
    
    
    void setMarks(int marks)
    {
        if( marks >= 0 && marks <= 100 )
        {
            this.marks = marks;
        }
    }
    void setSection(char section)
    {
        if( section == 'A' || section == 'B' || section == 'C' || section == 'D')
        {
            this.section = section;
        }
    }
    
    void setDetails(int marks, char section)
    {
        setMarks(marks);
        setSection(section);
    }
    
    void print(String prefix)
    {
        System.out.println(prefix + " : " + name + " - " + marks + " - " + section);
    }





}