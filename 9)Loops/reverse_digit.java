// import java.util.*;
// public class reverse_no {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number to reverse?");
//         int n = sc.nextInt();

//         while(n > 0) {
//             int last_digit = n % 10;
//             System.out.print(last_digit);
//             n = n/10;
//         }
//         System.out.println();
//     }
// }

// using for loop
// import java.util.*;
// public class reverse_no {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number to reverse ?");

//         int n = sc.nextInt();
//         for(;n>0; n=n/10) {
//             int last_Digit = n % 10;
//             System.out.print(last_Digit);
//         }
//         System.out.println();
//     }
// }


// import java.util.*;
// public class reverse_digit {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number to reverse ?");
//         int n = sc.nextInt();
//         int rev = 0;

//         while(n > 0) {
//             int last_Digit = n % 10;
//             rev = (rev*10) + last_Digit;
//             n = n/10;
//         }
//         System.out.println(rev);
//     }
// }


import java.util.*;
public class reverse_digit {
    public static void main(String args[]) {
        int n = 20042004;
        while(n > 0) {
            int last_Digit = n % 10;
            System.out.print(last_Digit);
            n = n/10;
        }
        System.out.println();
    }
}
