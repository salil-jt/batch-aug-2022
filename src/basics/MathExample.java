package basics;

public class MathExample {
public static void main(String[] args) {
    int num = 9;
    if (Math.sqrt(num) * Math.sqrt(num) == num) // LINE A
        System.out.println(num + " is a perfect square");
    else
        System.out.println(num + " is not a perfect square");
    num = -2;
    System.out.println("Value of num : " + Math.abs(num)); // LINE B
    System.out.println("value when Math.ceil is used : " + Math.ceil(Math.PI)); // LINE C
    System.out.println("Value when Math.floor is used : " + Math.floor(Math.PI)); // LINE D
    num = (int) (Math.random() * 10); // LINE E
    System.out.println("Random number between 0 and 10 : " + num);    

}
}
