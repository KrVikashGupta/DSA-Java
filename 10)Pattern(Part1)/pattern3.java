/*     Print Half Pyramid pattern.
1
1 2
1 2 3 
1 2 3 4 
 */
// import java.util.*;

// public class pattern3 {
//     public static void main(String args[]) {
//         int n = 15;
//         for(int line=1; line<=n; line++) {
//             for(int number=1; number<=line; number++) {
//                 System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
    
// }

import java.util.*;
public class pattern3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to print a pattern: ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n; i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}