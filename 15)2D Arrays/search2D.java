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


import java.util.*;
public class search2D {
    public static boolean print_Key(int matrix[][], int key) {
        for(int i=0;i<matrix.length;i++) {
            for(int j= 0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Index at the Key : + (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Index not Found");
        return false;
    }
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        //int n = matrix.length, m = matrix[0].length;

        //input
        int n=2,m=2;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j =0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            
            }
        }
         //for output prin
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    print_Key(matrix,5);
    sc.close();
   
    }
}

// import java.util.*;
// public class search2D {
//     public static boolean search(int matrix[][], int key) {
//         for(int i=0;i<matrix.length; i++) {
//             for(int j = 0; j<matrix[0].length;j++) {
//                 if(matrix[i][j] == key) {
//                     System.out.println("Index at the Key : ("+ i + "," + j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.print("Not found");
//         return false;
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);

//         //Define the size of the matrix
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length;
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         //for print the output 
//         for(int i=0; i<n;i++) {
//             for(int j=0; j<m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         search(matrix,5);
//         sc.close();
//     }
// }
    