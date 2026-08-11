// import java.util.*;
public class optimizedXPowerN {
    public static int Power(int x, int n) {
        //base case
        if(n == 0) {
            return 1;
        }

        //if n is even
        int halfPower = Power(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // if n is odd
        if(n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
            
        }
        return halfPowerSq;
      
    }
    public static void main(String[] args) {
       System.out.println(Power(5, 10));
       System.out.println(Power(2, 10));
    
    }
}
