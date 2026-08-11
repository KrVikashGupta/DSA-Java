/*//Print if a number is ODD or EVEN.(input from user)
import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD"); // output is given as per dial number
        }
        
    }
}*/

// import java.util.*;

// public class oddeven {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int number = sc.nextInt();

//         if(number % 2 == 0) {
//             System.out.println("Number is Even");
//         }
//         else {
//             System.out.println("Number is Odd");
//         }


//     }
// }

/*output is
Enter the number : 4
Number is Even
*/

import java.util.*;
public class oddeven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}