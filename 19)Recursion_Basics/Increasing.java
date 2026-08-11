//import java.util.*;
// public class Increasing_Order {
//     public static void printInc(int n) {
//         //base case
//         if(n == 1) {
//             System.out.println(n);
//             return;
//         }
//         printInc(n-1); // inner call(ander wala)
//         System.out.print(n + " "); // n ko print karega jo ki hai 10
//     }
//     public static void main(String args[]) {
//         int n=10;
//         printInc(n);
//     }
// }

// public class Increasing_Order {
//     public static void printIncr(int n) {
//         if(n ==1) {
//             System.out.print(n + " ");
//             return;
//         }
//         printIncr(n-1);
//         System.out.print(n + " ");
//     }
//     public static void main(String args[]) {
//         int n = 10;
//         printIncr(n);
//     }
// }

// public class Increasing_Order {
//     public static void printIncre(int n) {
//         //base case
//         if(n == 1) {
//             System.out.print(n + " ");
//             return ;
//         }
        
//         printIncre(n -1);
//         System.out.print(n + " ");
//     }
//     public static void main(String args[]) {
//         int n=10;
//         printIncre(n);
//     }
// }

public class Increasing {
    public static void printInc(int n) {
        //baseCase
        if(n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}