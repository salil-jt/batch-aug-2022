class PrimeNumber{
public static void main(String[] args){

int number = 97;


boolean isPrime = true;


/*Optimization 3*/
for( int i =2 ;i <= number/2 ; i++){

System.out.println("In for loop");

if(number % i == 0){
isPrime = false;
break;

}


}

if(isPrime){
System.out.println("Prime number");


}
else{
System.out.println("Not a Prime number");

}


/* Optimization -2 

for( int i =2 ;i < number ; i++){

System.out.println("In for loop");

if(number % i == 0){
isPrime = false;
break;

}


}

if(isPrime){
System.out.println("Prime number");


}
else{
System.out.println("Not a Prime number");

}
*/







/* Optimization - 1

int count = 0;

for( int i = 2 ; i <= number ; i++){

if(number % i == 0){
count++;
}
if(count > 1){
System.out.println("Not a prime");
break;
}


}

System.out.println("value of count is :"+count);


if(count == 1)
System.out.println("Prime number");


*/



/* Basic Program
for(int i = 1; i <=number ; i++){

if(number % i == 0){
count++;
}


}

System.out.println("value of count is :"+count);

if(count == 2){
System.out.println("Prime Number");
}
else{
System.out.println("Not a Prime Number");
}
*/


}

}