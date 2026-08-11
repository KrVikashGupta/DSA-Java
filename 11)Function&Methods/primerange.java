// WAP to print all primes in  RANGE , N = 10
// import java.util.*;

// public class primerange {
//     public static boolean isPrime(int number) {
//         if (number <= 1) {
//             return false;
//         }
        
//         for (int i = 2; i <= Math.sqrt(number); i++) {
//             if (number % i == 0) {
//                 return false;
//             }
//         }
        
//         return true;
//     }
    
//     public static void primesInRange(int n) {
//         for (int i = 2; i <= n; i++) {
//             if (isPrime(i)) {
//                 System.out.print(i + " ");
//             }
//         }
        
//         System.out.println();
//     }
    
//     public static void main(String[] args) {
//         primesInRange(100);       //output is 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
//     }
// }


public class primerange {
    public static boolean isPrime(int n) {
        if(n==2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void findInRange(int n) {
        for(int i=2;i<=n; i++) {
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        findInRange(20);
    }
}
