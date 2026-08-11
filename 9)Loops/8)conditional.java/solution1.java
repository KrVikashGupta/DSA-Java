//Q: WAP to get a number from the user a number from the user and print whether it is positive or negative 
// import java.util.*;

// public class solution1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         if(num > 0) {
//             System.out.println(num + " is a positive");
//         }
//         else if(num < 0){
//             System.out.println(num + " is a negative");
//         }
//         else{
//             System.out.println(num + " is neither positive or nor negative");
//         }
//     }
        
// }

// import java.util.*;
// public class solution1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         if(n >= 0) {
//             System.out.println("Number is positive" );
//         }
//         else {
//             System.out.println("Number is Negative");
//         }
//     }
// }


import java.util.*;
public class solution1 {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    if(n >= 0) {
        System.out.println("Positve Number");
    }
    else {
        System.out.println("Negative Number");
    }
}

}