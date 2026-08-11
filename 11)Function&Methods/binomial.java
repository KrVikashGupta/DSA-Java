// WAP to print binomial Coefficient , n = 5, r = 2
// import java.util.*;

// public class binomial {                  
//       public static int factorial(int n) {   // factorial code first wrote 
//         int f = 1;
//         for(int i=1; i<=n; i++) {
//             f = f * i;
//         }
//             return f;
//         }
//     public static int binCoeff(int n, int r) {
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);

//         int binCoeff = fact_n / (fact_r * fact_nmr);
//         return binCoeff;
//     }
//     public static void main(String args[]) {
//         System.out.println (binCoeff(5,2));
//     }
    
// }

// 


public class binomial {
    public static int find_factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
            f = f*i;
        }
        return f;
    }
    public static int find_binomial(int n, int r) {
        int find_n = find_factorial(n);
        int find_r = find_factorial(r);
        int find_nmr = find_factorial(n-r);

        int find_binomial = find_n / (find_r*find_nmr);
        return find_binomial;
    }
    public static void main(String args[]) {
        System.out.println(find_binomial(5,2));

    }
}
