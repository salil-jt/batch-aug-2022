class TernaryOperator{

public static void main(String[] args){


int a = 10;
int b = 1;


// int c  = (a + b) > 15 ? 1 : 0;
// 
int c = (a + b ) > 15 ? (b > 5) ? 2:1 : (a > 11) ? 4;

// int c = <expr1> ? <expr2> : <expr3>

/*
if( a + b > 12){
c = 1;
}
else{
c=0;
}
*/

System.out.println(c);


}

}