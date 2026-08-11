import java.util.*;

public class convert {
    public static void main(String args[]) {
        int a = 10;
        float b = 20.25f;   // change data type into  float
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;// output is 85.25
        System.out.println(ans);  //  showing error : cannot convert from float to int 
         

        //wrong
        byte b = 5;
        byte a = b * 2;
        System.out.println(a);  // output is showing error (complier understand this is expression)

        //Right
        byte b = 5;
        a = (byte) (b * 2);
        System.out.println(a);  // output is 10
    
    
    
    }                             
    
}
