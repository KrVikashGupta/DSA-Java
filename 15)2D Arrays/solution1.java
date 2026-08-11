/*
Question 1:
Print the number of 7's that are in the 2d array.
Example :
I/p int arr[] ={{4,7,8},{11,4,3},{2,2,3}};
output -2


*/

public class solution1 {
    public static void print_Seven(int matrix[][]) {
        int countSeven = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 7) {
                    countSeven++;
                }
            }
        }
        System.out.println("Count of Seven: "+ countSeven);
    }
    public static void main(String args[]) {
        int matrix[][] = {{4,7,3},
                          {3,8,7}};
                          print_Seven(matrix);
    }
    
}
