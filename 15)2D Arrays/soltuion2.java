/*
Question 2:
Print out the sum of the numbers in the second row of the "nums" array
Example :
Input-
int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
output is 18
*/
public class soltuion2 {
    public static void print_Sum(int matrix[][]) {
        int sum = 0;
        //sum of second row element
        for(int j=0; j<matrix.length; j++) {
            sum += matrix[1][j];
        }
        System.out.println("Sum is : "+ sum);
    }
    public static void main(String args[]) {
        int matrix[][] ={{1,4,9},
                         {11,4,3},
                         {2,2,3}};
                        print_Sum(matrix);
    }
}
