/*Q. based on income tax calculator condition if income < 5 L , 0% tax ; income < 5L - 10 L, 20 % tax ;
income > 10 L , 30 % tax;
import java.util.*;*/
/*import java.util.*;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;  //int tax; means tax = 0 automatically(in java automatically)
        if(income < 500000) {     //input is 25000 then output is 0 if char hota to ek empty daal deta
            tax = 0;
        }
        else if (income >= 500000 && income < 1000000) {   // input is 600000 then output is 120000
            tax = (int) (income * 0.2);  // income is int and 0.2 is double so we have convert int
        }
        else {
            tax = (int) (income * 0.3);   // when input is 1800000 then output is 540000 
        }
        System.out.println("Your tax is : " + tax);
    }
}*/

// import java.util.*;

// public class incometax {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Write your income: ");
//         int income = sc.nextInt();
//         int tax; 

//         if(income < 500000) {
//             tax = 0;
//         }
//         else if(income >= 500000 && income < 1000000) {
//             tax = (int)(income * 0.2); // typecasting because 0.2 is double and income is int so .....
//         }
//         else {
//             tax = (int) (income * 0.3);
//         }
//         System.out.println("Your tax is : " + tax);
//     }
// }

import java.util.*;
public class incometax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income < 500000) {
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);  //typecasting because 0.2 is double and income is int so .....
        }
        else {
            tax = (int)(income * 0.3);
        }
        System.out.println("Your tax is : " + tax);
    }
}