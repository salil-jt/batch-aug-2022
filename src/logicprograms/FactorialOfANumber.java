package logicprograms;

class FactorialOfANumber{
public static void main(String[] args){


int number = 5;

int fact = 1;


for(int i=number ; i > 0 ; i--){
fact = fact * i;

}


/* Way1
for(int i=1; i <=number ; i++){

fact = fact * i;

}
*/


System.out.println("Fact is :"+fact);

}

}