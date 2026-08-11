/*Function
Function is the block of code that can be reused as many times as 
we want inside qa program.
or
block of codes that performs particular tasks
ex: It can be used multiple times (Tv volumes) it increases code reusability.
-----------
Syntax
returnType name () {
//body
return statement;
}

*/

//WAP to print  Hello WOrld and sum of a and b.
/*import java.util.*;

public class aIntroduction {
    // definition
    //multiple function in single class
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static void calculatesum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is : " + sum);
        
    }
    public static void main(String args[]) {
        //printHelloWorld();   output is 4 times hello world 
        calculatesum();
        

    }
    
}*/ // or
// import java.util.*;

// public class aIntroduction {
//     // definition
//     //multiple function in single class
//     public static void printHelloWorld() {
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }
//     public static int calculatesum(int num1, int num2) {
//         int sum = num1 + num2;
//         return sum;
     
        
//     }
     // public static void main(String args[]) {
         //printHelloWorld();   output is 4 times hello world 
     //     Scanner sc = new Scanner(System.in);
     //     int a = sc.nextInt();
     //     int b = sc.nextInt();
     //     int sum = a + b;
     //     System.out.println("sum is : " + sum);
     
//      public static void main(String args[]) {
//         int a = 5;
//         int b = 10;
//         //swap means value exchange

//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a="+a);
//         System.out.println("b="+b);
//     }
// }/
/***************************************************************
Parameters

A parameter is a variable used to define a particular value during a function definition. 
Whenever we define a function we introduce our compiler with some variables that are being used in the running of that function. 
These variables are often termed as Parameters. 
-----------------
Argument

An argument is a value passed to a function when the function is called. 
Whenever any function is called during the execution of the program there are some values passed with the function. 
These values are called arguments.
*/


// import java.util.*;
// public class aIntroduction {
//     public static int calculateSum(int num1, int num2) { // value  in function declaration/ definition is called parameter
//         int sum = num1+num2;
//         return sum; 
       
//     }    public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a,b);  // value that are passed in function call is called argument
//         System.out.println("sum is : " + sum);
    

// }
    
// }


public class aIntroduction {
    public static void main(String args[]) {
        int a = 5;
        int b=4;

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

    }
}