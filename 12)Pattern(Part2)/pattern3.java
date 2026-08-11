/*WAP to print that Inverted half pyramid with numbers.
12345
1234
123
12
1
Print this pattern*/
// public class pattern3 {
//     public static void Inverted_half_pyramid_withNumber(int n) {
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n-i+1; j++) {
//                 System.out.print(j);

//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         Inverted_half_pyramid_withNumber(4); 

//     }
// }

import java.util.*;
public class pattern3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}