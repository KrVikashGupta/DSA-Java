/*
Question 3:
Write a program to Find Transpose of a matrix.What is transpose ?
Transpose of a matrix is the process of swapping the rows to columns. For a 2*3 matrix

Matrix
a11 a12 a13
a21 a22 a23
Transposed Matrix
a11 a21
a21 a22
a13 a23

*/ 

public class TransposeMatrix {

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int transpose[][] = new int[cols][rows]; // Note the switch of dimensions

        // Transposing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j]; // Swap row and column indices
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        // Example 2x3 matrix
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Get the transpose
        int transpose[][] = transposeMatrix(matrix);

        System.out.println("\nTransposed Matrix:");
        printMatrix(transpose);
    }
}
