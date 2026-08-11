/*   Print Star pattern
*
**
***
****
*/
/*import java.util.*;

public class pattern1 {
    public static void main(String args[]) {
        for(int i=1; i<=50; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/


// import java.util.*;
// public class pattern1 {
//     public static void main(String args[]) {
//         for(int line=1; line<=5; line++) {
//             for(int star=1; star<=line; star++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// public class pattern1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number that u want print * :");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern1 {
//     public static void main(String args[]) {
//         for(int i=1; i<=4;i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


import java.util.*;
public class pattern1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to print pattern :");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}