package oopsconcept.inheritance;

public class FindShapeWithLargestArea {
public static void main(String[] args) {
	
    
    Shape s1 = new Rectangle(30.3, 45.4);
    Shape s2 = new Circle(23.2);
    Shape s3= new Triangle(146.2, 40.0);
    Shape s4= new Rectangle(25, 57.8);
    Shape s5 = new Triangle(120.0, 8.0);
    
    System.out.println("Area : "+s1.getArea());
    System.out.println("Area : "+s2.getArea());
    System.out.println("Area : "+s3.getArea());
    System.out.println("Area : "+s4.getArea());
    System.out.println("Area : "+s5.getArea());
    

	
	
	
}
}
abstract class Shape
{
    abstract double getArea();

    abstract void printDetails();
}
class Rectangle extends Shape
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth;
    }

    void printDetails()
    {
        System.out.println("Type = Rectangle");
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + getArea());
    }
}
class Circle extends Shape
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return 3.14 * radius * radius;
    }

    void printDetails()
    {
        System.out.println("Type = Circle");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + getArea());
    }
}

class Triangle extends Shape
{
    double base;
    double height;

    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    double getArea()
    {
        return base * height / 2.0;
    }

    void printDetails()
    {
        System.out.println("Type = Triangle");
        System.out.println("Base = " + base);
        System.out.println("Height = " + height);
        System.out.println("Area = " + getArea());
    }
}

