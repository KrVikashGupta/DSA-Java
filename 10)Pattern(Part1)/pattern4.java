/*    Print character pattern
A
A B
A B C
A B C D

 */
// import java.util.*;

// public class pattern4 {
//     public static void main(String args[]) {
//         int n = 4;
//         char ch = 'A';

//         //outer loop
//         for(int line=1; line<=4; line++) {
//             for(int chars=1; chars<=line; chars++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
    
// }


// import java.util.*;
// public class pattern4 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number that you want to pattern : ");
//         int n = sc.nextInt();
//         char ch = 'A';

//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(ch + " ");
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

public class pattern4 {
    public static void main(String args[]) {
        int n = 5;
        char ch = 'A';
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}