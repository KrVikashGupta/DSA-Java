//numbers where each number is the sum of the previous two numbers. 
//import java.util.*;
// public class fibonacci {
//     public static int fib(int n) {
//         // base case
//         if(n == 0 || n == 1) {
//             return n;
//         }
//         int fnm1 = fib(n-1);
//         int fnm2 = fib(n-2);
//         int fn = fnm1 + fnm2;
//         return fn;
//     }
//     public static void main(String args[]) {
//         int n = 25;
//         System.out.println(fib(n)); // 75025
//         System.out.println(fib(24));
//         System.out.println(fib(25));
//         System.out.println(fib(26));
//         System.out.println(fib(27));
//         System.out.println(fib(28));
//     }
// }
/*output is 
75025
46368
75025
121393
196418
317811
*/


// public class fibonacci {
//     public static int fib(int n) {
//         // base case
//         if(n == 0 || n ==1) {
//             return n;
//         }

//         int fnm1 = fib(n-1);
//         int fnm2 = fib(n -2);
//         int fn = fnm1 + fnm2;
//         return fn;
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println(fib(n));
//     }
// }

public class fibonacci {
    public static int printFib(int n) {
        //BaseCase
        if(n == 0 || n == 1) {
            return n;
        }

        int fnm1 = printFib(n-1);
        int fnm2 = printFib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String args[]) {
        int n = 6;
        System.out.println(printFib(n));
    }
}