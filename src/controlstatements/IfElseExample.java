package controlstatements;
class IfElseExample{

public static void main(String[] args){


/* Basic if else
int a = 1;

if(a > 5){
System.out.println("a is greater");
}
else{
System.out.println("a is smaller");
}
*/

/*
int i = 10;
int j = 19;
int k = 30;
int a = 0;
int b = 20;
int c =1;
int d = 12;

if(i == 10) {
  if(j < 20) a = b;
  if(k > 100) c = d; // this if is
  else a = c;        // associated with this else
}
else a = d;

System.out.println("a is :"+a);
System.out.println("c is :"+c);


*/


/*Nested Ladder*/

    int month = 14; // April
    String season;
    if(month == 12 || month == 1 || month == 2)
      season = "Winter";
    else if(month == 3 || month == 4 || month == 5)
      season = "Spring";
    else if(month == 6 || month == 7 || month == 8)
      season = "Summer";
    else if(month == 9 || month == 10 || month == 11)
      season = "Autumn";
    else
      season = "Bogus Month";
    System.out.println("Season of the selected month is " + season + ".");

}
}