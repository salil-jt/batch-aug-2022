package controlstatements;
class ReturnStatement{


public static void main(String[] args){
/*
	boolean t = true;
    System.out.println("Before the return.");
  if(t) return; // return to caller
  System.out.println("This won't execute.");

*/



int sum=0;
int i=1;
for(;i <=10; i++){
sum = sum+i;

if(sum > 25)
return;


}

System.out.println("Sum is :"+sum);
System.out.println("The value of i is: "+i);

}

}