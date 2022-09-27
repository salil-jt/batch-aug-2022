package arrays;
class MultiDimensionArrays{


public static void main(String[] args){


//int matrix[][] = new int[3][3];

/*
int matrix[][] = new int[3][3];

matrix[0][0]=1;
matrix[0][1]=2;
matrix[0][2]=4; */

int matrix[][] = {  {10,7,5} ,{6,4,3} ,{1,2,9}    };

//System.out.println(matrix[0][0]);


for(int row = 0; row < 3 ; row ++) {

	for(int column=0 ; column < 3 ; column++){ 
		
		System.out.print(matrix[row][column] + " ");
	}
	
	System.out.println();

}





}
}