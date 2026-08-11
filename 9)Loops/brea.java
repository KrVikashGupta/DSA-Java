/*
 break keyword
 to exit the loop
 */

//WAP to print number 1-5 but when come 3  break
/*import java.util.*;

public class brea  {
    public static void main(String args[]) {
        for(int i=1; i<=5; i++) {
            if(i==3) {
                break;
            }
            System.out.println(i);
        }
    }
}*/
//Keep entering number till user enters a multiple of 10
// import java.util.*;

// public class brea {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
        

//         do {
//             System.out.print("enter your number : ");
//             int n = sc.nextInt();
//           if(n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);
//         }
//         while(true);

         
    
//     }
// }

// public class brea {
//     public static void main(String args[]) {
//         for(int i=1; i<=5; i++) {
//             if(i == 3) {
//                 break;
               
//             }
//             System.out.println(i);
//         }
//         System.out.println("I am out of the loop");

//     }
// }


//Keep entering number till user enters a multiple of 10

// import java.util.*;
// public class brea {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
        
    
//     do {
//         System.out.println("Enter the number : ");
//         int n = sc.nextInt();
//         if(n % 10 == 0) {
//             break;
//         }
//     }
//     while(true);
// }
// }

//using while loop


import java.util.*;
public class brea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                break;
            }
        }
    }
}
