// import java.util.*;
// // we can also serch in 2d array by using previous code 
// public class search2D {
//     public static boolean search(int matrix[][], int key) {
//         for(int i=0; i<matrix.length; i++) {
//             for(int j=0; j<matrix[0].length; j++) {
//                 if(matrix[i][j] == key) {
//                     System.out.println("Found at cell (" +i+ "," +j+ ")"); 
//                     return true;

//                 }
//             }
//         }
//         System.out.println("Key not found");
//         return false;

//     }
//     public static void main(String args[]) {
//         int matrix[][] = new int[3][3]; 
//         // or int n = matrix.length, m = matrix[0].length
//         int n=3, m=3;
//         Scanner sc = new Scanner(System.in);
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 matrix[i][j] = sc.nextInt();

//             }
//         }
//         // output for print the array same code print
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         search(matrix,5);
//     }
// }
/*
o/p
1 2 3 4 5 6 7 8 9 
1 2 3
4 5 6
7 8 9
Found at cell (1,1)*/


// import java.util.*;
// public class search2D {
//     public static boolean print_Key(int matrix[][], int key) {
//         for(int i=0;i<matrix.length;i++) {
//             for(int j= 0; j<matrix[0].length; j++) {
//                 if(matrix[i][j] == key) {
//                     System.out.println("Index at the Key : + (" + i + "," + j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Index not Found");
//         return false;
//     }
//     public static void main(String args[]) {
//         int matrix[][] = new int[3][3];
//         //int n = matrix.length, m = matrix[0].length;

//         //input
//         int n=2,m=2;
//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<n; i++) {
//             for(int j =0; j<m; j++) {
//                 matrix[i][j] = sc.nextInt();
            
//             }
//         }
//          //for output prin
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//             System.out.print(matrix[i][j] + " ");
//         }
//         System.out.println();
//     }
//     print_Key(matrix,5);
   
//     }
// }

// import java.util.Scanner;

// public class search{

//     // Function to search for a key in a 2D matrix
//     public static boolean search(int matrix[][], int key) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == key) {
//                     System.out.println("Index at the Key: (" + i + "," + j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Not found");
//         return false;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // Define the size of the matrix
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length;

//         // Input matrix elements
//         System.out.println("Enter elements for a 3x3 matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // Print the matrix
//         System.out.println("The matrix is:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println(); // Newline after each row
//         }

//         // Debugging: Print a message before searching for the key
//         System.out.println("Searching for the key 5 in the matrix...");

//         // Search for the key (e.g., 5)
//         search(matrix, 5);

//         sc.close(); // Close the scanner to prevent resource leaks
//     }
// }

import java.util.*;
public class search {
    public static boolean printSearch(int matrix[][], int key) {
        for(int i=0; i<matrix.length;i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.print("Key at the key: (" + i + ","+ j + ")");
                    return true;
                }

            }
        }
        System.out.println("Not found");
        return false;
    }
    public static void main(String args[]) {
        int matrix[][] = new int[4][4];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        printSearch(matrix, 6);
        sc.close();
       
    }
}


