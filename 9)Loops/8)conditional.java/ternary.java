/*
Ternary Operator in Java
Java ternary operator is the only conditional operator that takes three operands.
It’s a one-liner replacement for the if-then-else statement and is used a lot in Java programming. 
We can use the ternary operator in place of if-else conditions or even switch conditions using nested ternary operators.
*/ 

//Q: WAP to wheather a number is even or odd using ternary operator 
import java.util.*;

// public class ternary {
//     public static void main(String args[]) {
//         int number = 4;  //5
//         String type = (number % 2 == 0) ? "even" : "odd";
//         System.out.println(type); //input is 4 then output is even , input is 5 then output is odd;
//     }
    
// }


public class ternary {
    public static void main(String args[]) {
        int n = 38;
        String Odd_Even = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(Odd_Even);
    }
}