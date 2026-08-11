/*Function Overloading 
 Multiple function with same name but different parameter.
 */

// WAP to function to calculate  sum of 2 number and 3 number using Function overloading using parameter
// import java.util.*;

// public class function_over {
   // function to calculate sum of 2 number
//     public static int sum(int a, int b) {
//         return a + b;
//     }
     // function to calculate sum of 3 number
//     public static int sum(int a, int b, int c) {
//         return a + b + c;
//     }

//     public static void main(String args[]) {
//         System.out.println (sum(3,5));
//         System.out.println(sum(5,2,1));  //output is 8 8

//     }
    
// }

//function overloading with parameter
// public class function_over {
//    public static int sum(int a, int b) {
//       return a+b;
//    }
//    public static int sum(int a, int b, int c) {
//       return a+b+c;
//    }
//    public static void main(String args[]) {
//       System.out.println(sum(2,3));
//       System.out.println(sum(2,3,4));
//    }
// }

//function overloading with datatype
public class function_over {
   public static int sum(int a, int b) {
      return a+b;
   }
   public static float sum(float a, float b) {
      return a+b;
   }
   public static void main(String args[]) {
      System.out.println(sum(3,4));
      System.out.println(sum(4.3f,3.2f));
   }
   
}

