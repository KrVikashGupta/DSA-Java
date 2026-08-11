// WAP to print function to calculate  sum and float using function overloading using Data Types.
import java.util.*;

public class datatypes {
    // function to calculate int sum
    public static int sum(int a, int b) {
        return a + b;
    }
    // function to calculate float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println(sum(5,3));
        System.out.println(sum(3.8f,4.2f));  //output is 8 8.0

    }
}
