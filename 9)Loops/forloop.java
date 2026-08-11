/*
 The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.

 */


//WAP to print 10 times HW.
/*import java.util.*;

public class forloop {
    public static void main(String args[]) {
        for(int i=1; i<=10; i++) { //i = i+1
            System.out.println("Hello World");
      }  
    }

}*/
//WAP to print a square pattern
/*import java.util.*;

public class forloop {  // other method is also their in below 
    public static void main(String args[]) {
        //for(int line=1; line<=4; line++) {  //using for loop
        //    System.out.println("****");
        int n=1;
        while(n<=4) {                        //using while loop
            System.out.println("****");
            n++;
        }
    }
}*/

//wap to print Reverse of a number
/*import java.util.*;

public class forloop {
    public static void main(String args[]) {
        int n = 23456;
        while(n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10; // n /= 10
        }
    }
}*/
// WAP to print reverse the given number
/*import java.util.*;

public class forloop {
    public static void main(String args[]) {
        int n = 753951;
        int rev = 0;
        while(n>0) {
            int lastDigit = n%10;
            rev = (rev * 10) + lastDigit;
            n = n/10;
        }
        System.out.print(rev);
    }
}*/
// import java.util.*;

// public class forloop {
//     public static void main(String args[]) {
        
//         for(int line=1; line<=4; line++){
//             System.out.println("****");
//     }   }  
// }

//-----------------------------------------------------------


//Wap to print that hello world 10 times

// public class forloop {
//     public static void main(String args[]) {
//         for(int i=1; i<=4; i++) {
//             System.out.println("Hello World");
//         }
//     }
// }



//Print square pattern

// public class forloop {
//     public static void main(String args[]) {
//         // for(int line = 1; line <= 4; line++) {
//         // System.out.println("****");
//         // }
//         //we want to print in whileloop
//         int line = 1;
//         while(line <= 6) {
//             System.out.println("******");
//             line++;
//         }
//     }
// }

// WAP to print reverse the given number
