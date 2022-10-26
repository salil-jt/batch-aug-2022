package oopsconcept.inheritance;

public class CallOverriddenMethods {
	public static void main(String[] args) {
//        A2 a = new A2();
//        a.print();
//        
//       
//        
        C2 c = new C2();
        //c.print();
        
        
        B2 b = new B2();
       // b.print();
        
        
//        A2 obj = b;
//        obj.print();
//        
        
        
//        B2 b1_obj = c; 
//        b1_obj.print();
        
        
        A2 a2 = c; 
        a2.print();

	}

}
class A2
{
    void print()
    {
        System.out.println("Print method in class A called");
    }
}

class B2 extends A2
{
    void print()
    {
        System.out.println("Print method in class B called");
    }
}

class C2 extends B2
{
    void print()
    {
        System.out.println("Print method in class C called");
    }
}
