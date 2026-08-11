// import java.util.*;

// public class calculator {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a");
//         int a = sc.nextInt();
//         System.out.println("Enter b");
//         int b = sc.nextInt();
//         System.out.println("Enter c");
//         char operator = sc.next().charAt(0);

//         switch(operator) {
//             case '+' : System.out.println(a + b);
//             break;
//             case '-' : System.out.println(a - b);
//             break;
//             case '*' : System.out.println(a * b);
//             break;
//             case '/' : System.out.println(a / b);
//             break;
//             case '%' : System.out.println(a % b);
//             break;
//             default : System.out.println("Not Advanced Calculator");
           
//         }
//     }
// }

import java.util.*;
public class calculator {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operand (+, -, *, /, %): ");
        int opeartor = sc.next().charAt(0); // Read the operand as a character
        /*The line char operator = sc.next().charAt(0); is used to read a single character input from the user, which is intended to be the arithmetic operator (e.g., +, -, *, /, %). */
        
        switch(opeartor) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("Wrong Number");
        }
    }
}
