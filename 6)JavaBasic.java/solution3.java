
/*Enter cost of 3 items from the user (using float data type) - a pencil, a pen, and eraser.
You have to output the total cost of the items back to the user as their bill.
[Add on : What can also try adding 18% gst tax to the items in the bill]*/

/*import java.util.*;

public class solution3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Bill is : " + total);
        //Add on with 18% tax
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax: " + newTotal);
    }
}*/

// import java.util.*;

// public class solution3 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         float pencil = sc.nextFloat();
//         float pen = sc.nextFloat();
//         float eraser = sc.nextFloat();
//         float total = pencil + pen + eraser;
//         System.out.println("Bill is " + total);

//         // Add on with 18% tax
//         float new_Toatal = total + (0.18f * total);
//         System.out.println("Bill with 18% gst tax : " + new_Toatal);
//     }
// }
/*
output is that given below
5
50
10
Bill is 65.0
Bill with 18% gst tax : 76.7
*/

import java.util.*;
public class solution3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total_cost = pencil+pen+eraser;
        System.out.println("Total Bill: "+total_cost);

        float new_Total = total_cost+(0.18f*total_cost);
        System.out.println("Total Bill with 18%: "+new_Total);
        
    }
    
}
