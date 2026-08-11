//import java.util.*;

// public class oddOrEven {
//     public static void printOddOrEven(int n){
//         int bitMask = 1;
//         if((n & bitMask) == 0) {
//             System.out.println("Even Number");
//         }
//         else {
//             System.out.println("Odd Number");
//         }
//     }
//     public static void main(String args[]) {
//         printOddOrEven(3);
//         printOddOrEven(11);
//         printOddOrEven(8);
//         printOddOrEven(399);
//     }
// }

// public class oddOrEven {
//     public static void printOddEven(int n) {
//         int bitmask = 1;
//         if((n & bitmask ) == 0) {
//             System.out.println("Even number");
//         }
//         else {
//             System.out.println("Odd Number");
//         }
//     }
//     public static void main(String args[]) {
//         printOddEven(4);
//         printOddEven(3);
//         printOddEven(11); 
//         printOddEven(8);
//     }
// }

public class oddOrEven {
    public static void printOddOrEven(int n) {
        int bitmask = 1;
        if((n & bitmask) == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[]) {
        printOddOrEven(3);
        printOddOrEven(5);
        printOddOrEven(8);
        printOddOrEven(10);
    }
}