/*      Print inverted Star Pattern
 ****
 ***
 **
 *
 */
/*import java.util.*;

public class pattern2 {
    public static void main(String args[]) {
        
        for(int line=1; line<=4; line++) {
            for(int star=1; star<=4-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }
}*/
// import java.util.*;

// public class pattern2 {
//     public static void main(String args[]) {
//         int n = 15;
        
//         for(int line=1; line<=n; line++) {
//             for(int star=1; star<=n-line+1; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }   
//     }
// }


// import java.util.*;
// public class pattern2 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n-i+1;j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

public class pattern2 {
    public static void main(String args[]) {
        int n = 4;
        for(int i=1; i<=n;i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("7");
            }
            System.out.println();
        }
    }
    
}