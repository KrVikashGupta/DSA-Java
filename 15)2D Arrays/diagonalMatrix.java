//import java.util.*;
//this code run for n= odd , n*n , n aur m ki value same hona chaiya
// tc 0(n^2) but below 0(n) linear tc
/*public class diagonalMatrix {
    public static int printMatrix(int matrix[][]) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                //primary diagonal ka condition
                if(i == j) {
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length - 1) { // i+j == n-1
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4,},
                          {5, 6, 7, 8,},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        /*int matrix[][] = {{1, 2, 3,},
                          {4, 5, 6,},
                          {7, 8, 9}};*/
        //System.out.println(printMatrix(matrix));
                          
    //}
    
//}*/


// import java.util.*;
// //timecomplexity = 0(n);
// public class diagonalMatrix {
//     public static int printmatrix(int matrix[][]) { 
//         int  sum = 0;
//         for(int i=0; i<matrix.length; i++) {
//             // pd ki condition
//             sum += matrix[i][i];
//             // secondary diagonal ki condition
//             if( i != matrix.length-1-i); {
//                 sum += matrix[i] [matrix.length-i-1];
//             }
//         }
//         return sum;

//     }
//     public static void main(String args[]) {
//         int matrix[][] = {{1, 2, 3,},
//         {4, 5, 6,},
//         {7, 8, 9}}; 
//         System.out.println(printmatrix(matrix));

//     }
// }
    

// public class diagonalMatrix {
//     public static int print_Sum(int matrix[][]) {
//         int sum =0;
//         for(int i=0; i<matrix.length; i++) {
//             for(int j=0; j<matrix[0].length; j++) {
//                 if(i==j) {
//                     sum += matrix[i][i];
//                 }
//                 else if(i+j == matrix.length-1) { // n-1
//                     sum += matrix[i][j];
//                 }
//             }
//         }
//         return sum;
//     }
//     public static void main(String args[]) {
//         int matrix[][] = {{1,2,3,4},
//                           {5,6,7,8},
//                           {9,10,11,12},
//                           {13, 14, 15, 16}};
//                           System.out.println(print_Sum(matrix));

                         
//     }
// }

public class diagonalMatrix {
    public static int print_Sum(int matrix[][]) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            //pd
            sum += matrix[i][i];
            //sd
            if(i != matrix.length-i-1) {
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},
                         {3,5,6,9},
                         {7,8,9,3},
                         {3,9,3,3}};
                         System.out.print(print_Sum(matrix));

    }
}

c