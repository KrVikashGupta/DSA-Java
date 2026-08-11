//import java.util.*;
//using loop
/*public class Factorial {
    public static int fact(int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;

    }
    public static void main(String args[]) {
        int n = 4;
        System.out.println(fact(n));
        
    }
    
}*/
//using recursion
// public class Factorial {
//     public static int fact(int n) {
//         //base case
//         if(n == 0) {
//             return 1;
//         }
//         int fnm1 = fact(n-1);
//         int fn =  n * fact(n-1); // inner wala
//         return fn;
//     }

//     public static void main(String args[]) {
//         int n=5;
//         System.out.println(fact(n));
//     }
// }


// public class Factorial {
//     public static int fact(int n) {
//         // base case 
//         if(n == 0) {
//             return 1;
//         }
//         int fnm1  = fact(n-1);
//         int fn = n * fact(n-1);
//         return fn;
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println(fact(n));
//     }
// }

// public class Factorial  {
//     public static int fact(int n) {
//         int f = 1;
        
//         for(int i=1; i<=n; i++) {
//             f = f * i;
//         }
//         return f;
//     }
//     public static void main(String args[]) {
//         int n= 5;
//         System.out.println(fact(n));
//     }
// }

public class Factorial {
    public static int printfact(int n) {
        if(n == 0) {
            return 1;
        }

        int fnm1 = printfact(n-1);
        int fn =  n * fnm1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println (printfact(n));
    }
}