package controlstatements;

class BreakStatement{

public static void main(String[] args){


// adding 1 - 10 numbers using a for loop
// whenevenr the sum is > 25, we want to stop the execution

int sum=0;
int i=1;
for(;i <=10; i++){
sum = sum+i;

if(sum > 25)
break;


}

System.out.println("Sum is :"+sum);
System.out.println("The value of i is: "+i);


}


}