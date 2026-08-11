//import java.util.*;
// public class sum_natural_no {
//     public static int sum(int n) {
//         //base case
//         if(n == 1) {
//             return 1;
//         }
//         int Snm1 = sum(n-1);
//         int Sn = n + Snm1;
//         return Sn;
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         System.out.print(sum(n));
//     }
// }

// public class sum_natural_no {
//     public static int Sum(int n) {
//         //base case
//         if(n == 1){
//             return 1;
//         }

//         int Snm1 = Sum(n-1);
//         int Sn = n + Snm1;
//         return Sn;
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         System.out.print (Sum(n));
//     }
// }

public class sum_natural_no {
    public static int printSum(int n) {
        //base case
        if(n == 1) {
            return 1;
        }

        int fnm1 = printSum(n-1);
        int fn = n + fnm1;
        return fn;

    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(printSum(n));
    }
}