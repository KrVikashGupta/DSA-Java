/*
Continue Statement(Keyword)
to skip an iteration

 */

//WAP to print a 1-5 but not 3.
/*import java.util.*;

public class continu {
    public static void main(String args[]) {
        for(int i=1; i<=5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
} */

//Display all numbers entered by user except multiples of 10 using continue.
// import java.util.*;

// public class continu {
//     public static void  main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         do {
//             System.out.print("Enter a number : ");
//             int n = sc.nextInt();
//             if(n % 10 == 0) {
           
//             continue;
//             }
//             System.out.println("Number was :" + n);
//         }    while(true);
//     }
// }
/*Real Life example :----
Consider a man is climbing up to go to his house in between there are 11 stairs.
Being in hurry to climb up he directly stepped onto 3 staircases and then 4, 5, 6, 7, 8, 9 and
jumps to last one. During this he missed out staircase 1st, 2nd and 10th and
he completed the goal to reach his house. He continued his journey skipping staircase of
his choices.*/


//WAP to print a 1-5 but not 3.
// public class continu {
//     public static void main(String args[]) {
//         for(int i=1; i<=10; i++) {
//             if(i == 9) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

//Display all numbers entered by user except multiples of 10 using continue.

import java.util.*;

public class continu {
    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
           
            continue;
            }
            System.out.println("Number was :" + n);
        }    while(true);
    }
}