//Q: Print the largest of three numbers ( A:1, B:3, C:6)
// import java.util.*;

// public class largest3 {
//     public static void main(String args[]) {
//         int A = 1, B = 3, C = 6;
//         if((A >= B) && (A >= C)) {
//         System.out.println("largest is A");
//         }
//         else if (B >= C) {
//         System.out.println("largest is B");
//         }
//         else {
//             System.out.println("largest is C");  //output is C
//         }

//     }
// }

public class largest3 {
    public static void main(String args[]) {
        int a=100, b=30, c=600;
        if((a>=b) && (a>=c)) {
            System.out.println(a);
        }
        else if(b>=c) {
            System.out.println("b");
        }
        else {
            System.out.println("c");
        }
    }
}