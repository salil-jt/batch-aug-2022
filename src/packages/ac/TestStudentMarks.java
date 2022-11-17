package packages.ac;

public class TestStudentMarks {
public static void main(String[] args) {
	/*
	Student uday = new Student("Uday");
    
    uday.subject1 = 87;
    uday.subject2 = 65;
    uday.subject3 = 93;
    			//   245
    
    uday.total_marks = 280;
    
    System.out.println("Subject 1 = " + uday.subject1);
    System.out.println("Subject 2 = " + uday.subject2);
    System.out.println("Subject 3 = " + uday.subject3);
    System.out.println("Total = " + uday.total_marks);    
    */
	
    Student uday = new Student("uday ");
    
    uday.setMarks(87, 65, 93);
    
   // uday.total_marks = 280;
    
    System.out.println("Subject 1 = " + uday.getSubject1Marks());
    System.out.println("Subject 2 = " + uday.getSubject2Marks());
    System.out.println("Subject 3 = " + uday.getSubject3Marks());
    System.out.println("Total = " + uday.getTotalMarks());



}
}
/*
class Student
{
    String name;

    Student(String name)
    {
        this.name = name;
    }

    int subject1;
    int subject2;
    int subject3;
    int total_marks;
}

*/

class Student
{
    private String name;
    private int subject1;
    private int subject2;
    private int subject3;
    private int total_marks;

    Student(String name)
    {
        this.name = name;
    }

    void setMarks(int subject1, int subject2, int subject3)
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;

        this.total_marks = subject1 + subject2 + subject3; // LINE A
    }

    int getSubject1Marks()
    {
        return subject1; // LINE B
    }

    int getSubject2Marks()
    {
        return subject2;
    }

    int getSubject3Marks()
    {
        return subject3;
    }

    int getTotalMarks()
    {
        return total_marks;
    }
}

