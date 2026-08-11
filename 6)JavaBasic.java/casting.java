// import java.util.*;

// public class casting {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//        // float marks = 99.999f;          //decimal kae baad wala hat jahaega 
//         //int marks2 = (int)marks;
//         //System.out.println(marks2);

//         char ch = 'a';
//         char ch2 = 'b';
//         int number = ch;
//         int number2 = ch2;  // OUTPUT IS a = 97 AN AFTER  b = 98 , c = 99 and d = 100
//         System.out.println(number);
//         System.out.println(number2);


//         Scanner sc = new scanner(System.in);
//         float a = 25.99999f;
//         int b = (int) a;
//         System.out.println(b);

//         //Type Promotion in Expression 
//         char a = 'a';
//         char b = 'b';
//         char c = b - a;
//         System.out.println((int)(b));
//         System.out.println((int)(a));
//         System.out.println(b - a);   // we know that a = 97 , b = 98 so output is 1

//     }
// }


import java.util.*;
public class casting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = 99.99f;
        //int b = a;// error possible lossy conversion but we have to do
        int b = (int)a;
        System.out.println(b);

        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);

        
        
        
    }
}
