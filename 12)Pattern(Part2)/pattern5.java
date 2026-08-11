/*WAP to print that 0-1 Triangle 
1
01
101
0101
10101
print this pattern */
// public class pattern5 {
//     public static void zero_one_Triangle(int n) {
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 if((i+j) % 2 ==0) {  //even
//                     System.out.print("1");
//                 }
//                 else {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String args[]) {
//         zero_one_Triangle(15);
//     }
// }
/* 
1
01
101
0101
10101
010101
1010101
01010101
101010101
0101010101
10101010101
010101010101
1010101010101
01010101010101
101010101010101
*/


import java.util.*;
public class pattern5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1;j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}