package exceptions;

public class BasicException {
	public static void main(String[] args) {
		
        int number_of_students = 0;
        int number_of_chocolates = 15;
        
        if( number_of_students <= 0 )
        {
            System.out.println("Chocolates can not be distributed since there are no students or negative number of students.");
        }
        else
        {
            int number_of_chocolates_per_student = number_of_chocolates / number_of_students;
            System.out.println("Every student gets " + number_of_chocolates_per_student + " chocolates.");
        }

	}

}
