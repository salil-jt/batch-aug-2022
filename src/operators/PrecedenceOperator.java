package operators;

class PrecedenceOperator{

public static void main(String[] args){



int a=7;
int b=5;
int c=3;
int d= 7;

int res = (a + b) * (c-d);
int res1 = a + b * c-d;
System.out.println(res) ;
System.out.println(res1) ;



}

}