package oopsconcept.programs;

public class ClassComposition {
public static void main(String[] args) {
	Room hall = new Room("Hall"); 
	hall.area = 200.0;
    hall.paintColor = "Voilet";
    hall.flooring = "Marble";
    
    hall.ceilingFan=new Fan("Hall Fan");
    hall.ceilingFan.speed = 500;     // LINE B1
    hall.ceilingFan.numberOfSpeeds = 5;
    
    
    hall.tube = new Light("Hall tube light"); // LINE C
    hall.tube.color = "White";
    hall.tube.watts = 40;
    hall.tube.tube = true;    // LINE C1
    
    Light bl = new Light("Yellow bed light"); // LINE D
    hall.bedLight = bl;
    hall.bedLight.color = "Yellow";
    hall.bedLight.watts = 50;
    hall.bedLight.tube = false;
    
    
    System.out.println("Hall fan speed : " + hall.ceilingFan.speed);
    System.out.println("Bed Light color : " + hall.bedLight.color);    




    

}
}


class Fan
{
    String name;
    double speed;
    String color;
    int numberOfSpeeds;

    Fan(String name)
    {
        this.name = name;
    }
}
class Light
{
    String name;
    String color;
    int watts;
    boolean tube;

    Light(String name)
    {
        this.name = name;
    }
}

class Chair{
	
	String name;
	String color;
	String shape;
	
}

class Room
{
    String name;
    double area;
    String paintColor;
    String flooring;
   
    Fan ceilingFan;

    Light tube;
    
    Light bedLight;
    
    Chair chair;

    Room(String name)
    {
        this.name = name;
    }
}
