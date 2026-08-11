/*Q:Find the following code so that it prints .YOu have a fever if your temperature is above 100 and
other wise prints. You don't have a fever.*/
// import java.util.*;

// public class solution2 {
//     public static void main(String args[]) {
//         double temp = 103.5;
//         if(temp > 100) {
//             System.out.println("You have a fever");
//         }
//         else{
//             System.out.println("You don't have a fever");
//         }
//     }

// }

// import java .util.*;
// public class solution2 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Temperature: ");
//         float n = sc.nextFloat();

//         if(n >= 100) {
//             System.out.println("You have Fever");
//         }
//         else {
//             System.out.println("You dont' have Fever");
//         }
//     }
// }


import java.util.*;
public class solution2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Temperature: ");
        Float temp = sc.nextFloat();

        if(temp >= 100) {
            System.out.println("You have Fever So,Take a Medicine");
        }
        else {
            System.out.println("You don't have Fever");
        }
    }
}