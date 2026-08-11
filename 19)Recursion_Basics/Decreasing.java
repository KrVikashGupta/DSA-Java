// //import java.util.*;
// public class Decreasing_Order {
//     public static void printDec(int n) {
//         //base case
//         if(n == 1) {
//             System.out.println(n);
//             return;
//         }

//         System.out.print(n + " "); // n ko print karega jo ki hai 10
//         printDec(n-1); // inner call(ander wala)
//     }
//     public static void main(String args[]) {
//         int n=10;
//         printDec(n);
//     }
// }
// public class Decreasing_Order {
//     public static void main(String[] args) {
//         // Using a for loop
//         for (int i = 10; i >= 1; i--) {
//             System.out.print(i + " ");
//         }
        
       
//     }
   
// }

// public class Decreasing_Order {
//     public static void printdecr(int n) {
//         //base case 
//         if(n == 1) {
//             System.out.println(n + " ");
//             return;
//         }
//         System.out.print(n + " "); // step 1 n ko print karengae
//         printdecr(n-1); // step 2 ander wala
        

//     }
//     public static void main(String args[]) {
//         int n = 10;
//         printdecr(n);
//     }
// }

public class Decreasing {
    public static void printdec(int n) {
        // basecase
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printdec(n-1);

    }
    public static void main(String[] args) {
        int n=10;
        printdec(n);
    }
}