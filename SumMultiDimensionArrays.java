class SumMultiDimensionArrays{


public static void main(String[] args){



int matrix[][] = {  {10,7,5} ,{6,4,3} ,{1,2,9}    };
int sum=0;


for(int row = 0; row < 3 ; row ++) {

	for(int column=0 ; column < 3 ; column++){ 
		
		sum = sum + matrix[row][column];
	}
	
	

}

System.out.println("Sum is : "+sum);



}
}