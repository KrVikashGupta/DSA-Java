// Write a java method to complete the average of three number
/*import java.util.*;

public class solution1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.println("Average is : " + average);
    }
}*/

// import java.util.*;

// public class solution1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number : ");
//         double x = sc.nextDouble();
//         System.out.print("Enter the second number : ");
//         double y = sc.nextDouble();
//         System.out.print("Enter the theird number : ");
//         double z = sc.nextDouble();
//         //double average = (x + y + z) / 3;
//         //System.out.println("Average is : " + average); //this is also right and simple try also
//         System.out.print("The average value is " + average(x, y, z) + "\n");
//     }
//     public static double average(double x, double y, double z) {
//         return(x + y + z) / 3; 

    



//     }
// }


public class solution1 {
    public static int find_Aver(int i,int j,int k) {
        int aver = (i + j + k) / 3;
        return aver;
    }
    
    public static void main(String args[]) {
        System.out.println(find_Aver(3,3,9));
    }
    
}