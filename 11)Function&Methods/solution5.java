// WAP to print a JAVA method to complete the sum of the digit in an integer.
import java.util.*;

public class solution5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int digits = sc.nextInt();
        System.out.print("The sum is " + sumDigits(digits));
    }
    public static int sumDigits(int n) {
        int sumofDigits = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sumofDigits += lastDigit;
            n /= 10;
        }
        return sumofDigits;
    }
    
}

