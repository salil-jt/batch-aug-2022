package collectionframework;

public class EmployeeExample {
public static void main(String[] args) {
	
	Employee e1  = new Employee("Pooja", 20, 123, "US");
	Employee e2  = new Employee("Neha", 21, 143, "India");
	Employee e3  = new Employee("Sneha", 22, 111, "US");
	Employee e4  = new Employee("Kiran", 25, 413, "India");
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	System.out.println(e4);
	/*
	 * collectionframework.Employee@15db9742
collectionframework.Employee@6d06d69c
collectionframework.Employee@7852e922
collectionframework.Employee@4e25154f

	 */
}
}

class Employee{
	
	String name;
	int age;
	int empId;
	String address;
	
	public Employee(String name, int age, int empId, String address){
		this.name=name;
		this.age=age;
		this.empId=empId;
		this.address=address;
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", empId=" + empId + ", address=" + address + "]";
	}
	
	
	
	
}
