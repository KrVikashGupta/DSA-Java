// import java.util.*;

// public class staircaseMatrix {
//     public static boolean staircaseSearch(int matrix[][],int key) {
//         int row = 0, col = matrix[0].length-1;
//            // loop
//         while(row < matrix.length && col >= 0) {
//             if(matrix[row] [col] == key) {
//                 System.out.println("Found key at ("+ row + " ," + col +")");
//                 return true;
//             }
//             else if(key < matrix[row][col]) {
//                 col--;
//             }
//             else {
//                 row++;
//             }
        
//         }
//         System.out.println("Key not found "); // if dono mai sai kisi mai key nahi mila to knf  return  ho jahaega
//         return false;
//     }
//     public static void main(String args[]) {
//         int matrix[][] = {{10, 20, 30, 40},
//                           {15, 20, 30, 40},
//                           {27, 29, 37, 48},
//                           {37, 33, 39, 50}};
//         int key = 33;
//         System.out.println(staircaseSearch(matrix,key));

//     }
    
// }

public class staircaseMatrix {
    static boolean print_Staircase(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println("Key at the : (" + row + "," + col + ")"); // i and j
                return true; // if we  want not print return true then write only change is that void -> then only write return
            }
            else if(key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }

        }
        System.out.println("Key not Found");
        return false;
    }
    public static void main(String arg[]) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 20, 30, 40},
                          {27, 29, 37, 48},
                          {37, 33, 39, 50}};
        int key = 33;
        System.out.println(print_Staircase(matrix,key));
    }
}
