//WAP to print that reads a set of integer and then print the sum of the even and odd integers
/*import java.util.Scanner;

public class solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a set of integers (separated by spaces): ");
        String inputLine = input.nextLine();

        // Splitting the input into individual numbers
        String[] numbers = inputLine.split(" ");

        int evenSum = 0;
        int oddSum = 0;

        for (String number : numbers) {
            int num = Integer.parseInt(number);

            if (num % 2 == 0) {
                // Number is even
                evenSum += num;
            } else {
                // Number is odd
                oddSum += num;
            }
        }

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
    }
}*/
// import java.util.*;

// public class solution2 {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int number;
//         int choices;
//         int evensum = 0;
//         int oddsum = 0;

//         do {
//             System.out.print("Enter the number ");
//             number = sc.nextInt();
//             if(number % 2 == 0) {
//                 evensum += number;
//             }
//             else {
//                 oddsum += number;
//             }System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
//             choices = sc.nextInt();
//         }while(choices == 1);
//         System.out.println("Sum of the even number: " + evensum);
//         System.out.println("Sum of the odd number: " + oddsum);
//     }
// }

import java.util.*;
public class solution2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();

        if(n%2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}