//import java.util.*;

// public class spiralmatrix {
//     public static void printspiral(int matrix [][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;

//         while(startRow <= endRow && startCol <= endCol) {
//             // for top
//             for(int j=startCol; j<=endCol; j++) {
//                 System.out.print(matrix[startRow] [j] + " ");
//             }
//             // for right
//             for(int i=startRow+1; i<=endRow;i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }
//             // for bottom 
//             for(int j=endCol-1; j>= startCol; j--) {
//                 if(startRow == endRow) {
//                     break;
//                 }
//                 System.out.print(matrix[endRow] [j] + " ");
//             }
//             // for left
//             for(int i= endRow-1; i>=startRow+1; i--) {
//                 if(startCol == endCol) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }
//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;
//         }

//     }
//     public static void main(String args[]) {
//         int matrix[][] = {{1, 2, 3, 4,},
//                           {5, 6, 7, 8,},
//                           {9, 10, 11, 12},
//                           {13, 14, 15, 16}};
//                           printspiral(matrix);  // output is 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
                        
//     }
    
// }


// public class spiralmatrix {
//     public static void print_Spiral(int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;

//         while(startRow <= endRow && startCol <= endCol) {
//             //top
//             for(int j=startCol; j<=endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }
//             //right
//             for(int i=startRow+1; i<=endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }
//             //bottom
//             for(int j=endCol-1; j>=startCol;j--) {
//                 if(startRow == endRow) { // if odd no. of box then last box will be sr=er and sc= ec
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }
//             //left
//             for(int i=endRow-1; i>=startRow+1;i--) {
//                 if(startCol == endCol) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }
//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;
//         }
//     }
//     public static void  main(String args[]) {
//         int matrix[][] = {{1, 2, 3, 4,},
//                           {5, 6, 7, 8},
//                           {9, 10, 11, 12},
//                           {13, 14, 15, 16}};
//                           print_Spiral(matrix);
//     }
// }


// public class spiralmatrix {
//     public static void print_Spiral(int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;

//         while(startRow <= endRow && startCol <= endCol) {
//             //top
//             for(int j=startCol; j<=endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }
//             //left
//             for(int i=startRow+1; i<=endRow; i++) {
//                 System.out.print(matrix[i][endCol] +" ");
//             }
//             //bottom
//             for(int j=endCol-1; j>=startCol;j--) {
//                 if(startRow == endRow) {
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j]+ " ");
//             }
//             //left
//             for(int i=endRow-1; i>=startRow+1;i--){
//                 if(startCol == endCol) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol]+ " ");
//             }
//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;
            
//         }
    
//     }
//     public static void main(String args[]) {
//         int matrix[][] = {{1,2,3,4},
//                           {5,6,7,8},
//                           {9,10,11,12},
//                           {13,14,15,16}};+
//                           print_Spiral(matrix);
//     }
// }

public class spiralmatrix {
    public static void print_Spiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+ " ");
            }
            //bottom
            for(int j=endCol-1; j>=startCol;j--) {
                if(startRow == endCol) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            //left
            for(int i=endRow-1; i>=endRow+1;i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }

    }
    public static void main(String args[]) {
        int matrix[][] = {{2,9,8,4,5},
                          {3,9,4,5,4},
                          {3,5,3,4,3},
                          {3,4,4,5,5}};
                          print_Spiral(matrix);

    }
}