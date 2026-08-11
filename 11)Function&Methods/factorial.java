 //WAP to print a factorial number n, n = 4 .

/*import java.util.*;

public class factorial{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number: " );
        int n = sc.nextInt();
        int num;
        int fact = 1;  // Initialize fact to 1
        

        for(int i=1; i<=n; i++) {
            fact *= i; //factorial = factorial * i
        }
        System.out.println("Factorial is: " + fact);
    }
}*/

// import java.util.*;

// public class factorial {
//     public static int factorial(int n) {
//         int f = 1;
//         for(int i=1; i<=n; i++) {
//             f = f * i;
//         }
//             return f;
//         }
    
//     public static void main(String args[]) {
//         System.out.println(factorial(4));
//     }
    
// }


// public class factorial {
//     public static int find_factorial(int n) {
//         int fact = 1;
//         for(int i=1; i<=n;i++) {
//             fact = fact*i;
//         }
//         return fact;
//     }
//     public static void main(String args[]) {
//         System.out.println(find_factorial(4));
//     }
//}


public class factorial {
    public static int find_factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]) {
        System.out.println(find_factorial(5));

    }
}
