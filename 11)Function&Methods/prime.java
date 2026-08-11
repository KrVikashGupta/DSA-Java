// WAP to print that check if a number is Prime or not.
/*import java.util.*;

public class prime {
    public static boolean isPrime(int n) {
        for(int i=2; i<=n-1; i++) {
            if(n % 2 == 0) { //completely dividing 
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println(isPrime(4));
    }
}*/

// public class prime {
//     public static boolean isP(int n) {
//         if(n == 2) {
//             return true;
//         }
//         for(int i=2; i<=Math.sqrt(n); i++) {
//             if(n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         System.out.println(isP(8));
//     }
// }


public class prime {
    public static boolean print_Prime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println(print_Prime(4));
    }
}

