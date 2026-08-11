//Q: WAJP that takes a year from the user and print wheather that year is a leap year or not.
// import java.util.*;

// public class solution5 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input the year: ");
//         int year = sc.nextInt();
//         boolean x = (year % 4) == 0;
//         boolean y = (year % 100) != 0;
//         boolean z = ((year % 100 == 0) && (year % 400 == 0));
//         if(x && (y || z)) {
//             System.out.println(year + " is a leap year");
//         }
//         else{
//             System.out.println(year + " is not a leap year");
//         }
//     }
// }

// Explanation:
// First if (leap_year % 400 == 0): Checks if the year is divisible by 400. If true, it's a leap year.
// else if (leap_year % 100 == 0): If the year isn't divisible by 400 but is divisible by 100, it isn't a leap year.
// else if (leap_year % 4 == 0): If the year isn't divisible by 400 or 100 but is divisible by 4, it's a leap year.
// else: If none of the above conditions are met, the year isn't a leap year.


import java.util.*;
public class solution5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int leap_year = sc.nextInt();

        if(leap_year % 400 == 0) {
            System.out.println(leap_year+ " is a Leap Year");
        }
        else if(leap_year % 100 == 0) {
            System.out.println(leap_year+" is not a Leap Year");
        }
        else if(leap_year % 4 == 0) { 
            System.out.println(leap_year+" is a Leap Year");
        }
        else {
            System.out.println(leap_year+" is not a leap Year");
        }
    }
}
