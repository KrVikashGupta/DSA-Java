/*
While loop:
whikle(condition) {

do something
}


 */

//WAP to print HW 100 times using while loop.

/*import java.util.*;

public class whileloop {
    public static void main(String args[]) {
        int counter = 0;
        while(counter <= 100) {
            System.out.println("Hello World");
            counter++;
        }
    }
} */ 


//WAP to print from 1 to 10 using while loop.
/*import java.util.*;

public class whileloop {
    public static void main(String args[]) {
        int counter = 1;
        while(counter <= 10) {
            System.out.print(counter+ " ");  // if u want to o/p in single line (counter+ " ")
            counter++;
        }
    }
}*/

//WAP to print number 1 to n ( n from user) using while loop.
/*import java.util.*;

public class whileloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while(counter <= n) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}*/
//WAP to print sum of first n natural number.

// import java.util.*;
// public class whileloop {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;

//         int i = 1;
//         while(i <= n) {
//             sum = sum + i;
//             i++;
//         }
//         System.out.println("sum is " + sum);
//     }
// }

//----------------

//print the no 1-100

// import java.util.*;
// public class whileloop {
//     public static void main(String args[]) {
//         int count = 0; // start kaha sae suru ho raha hai
//         while(count < 5) {
//             System.out.println("Hello World");
//             count++; // +1 hoga
//         }
//     }
// }


// Print number from 1 to 100

// public class whileloop {
//     public static void main(String args[]) {
//         int count = 1;
//         while(count <= 100) {
//             System.out.print(count+ " ");
//             count++;
//         }
//         //System.out.println();
//     }
    
// }

//Print number from 1 to n and n from user


// import java.util.*;
// public class whileloop {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number n: ");
//         int n = sc.nextInt();

//         int count = 1;
//         while(count <= n) {
//             System.out.print(count + " ");
//             count++;
//         }
    
//     }
// }


//Print sum of first n natural numbers


// import java.util.*;
// public class whileloop {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int i = 1;// count hai
//         int sum = 0;
//         while(i <= n) {
//             sum = sum + i;
//             i++;

//         } 
//         System.out.println("Sum is: " +sum);

//     }
// }


import java.util.*;
public class whileloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while(i <= n) {
            sum = sum+i;
            i++;
            //System.out.println(sum);

        }
        System.out.println(sum);  //Print the sum outside the loop: The final sum should be printed after the loop ends, not during each iteration.

        
    }
}