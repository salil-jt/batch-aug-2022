package controlstatements;
class SumOfElementsInArray{

public static void main(String[] args){


int nums[]={2,3,4,65,3,18,6,3,4,9,12,14,119,23,45,34,76};

System.out.println("Length : "+nums.length);

int sum=0;

for(int i=0 ;i <nums.length;i++){
sum = sum + nums[i];
}
System.out.println("Sum is :"+sum);


}
}