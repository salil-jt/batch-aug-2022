package operators;

class BooleanOperators{


public static void main(String[] args){

/*
boolean a = true;
boolean b = false;

System.out.println(a);
System.out.println(b);
System.out.println(a&b);
System.out.println(a|b);
System.out.println(a^b);
*/



int a = 10;

int b = 5;

int c = 0;
// assign c to 1 when a > 15 and b++ > 7


// && and || - short circuit operators

if(a > 15 && b++ > 7){
	c = 1;
}





System.out.println(a); //10
System.out.println(b); // 6
System.out.println(c); // 1






}

}