// WAP to print that convert from binary to decimal.
// import java.util.*;

// public class binTodec {
//     public static void binToDec(int binNum) {
//         int myNum = binNum;
//         int pow = 0;
//         int decNum = 0;

//         while(binNum > 0) {
//             int lastDigit = binNum % 10;
//             decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

//             pow++;
//             binNum = binNum/10;
//         }
//         System.out.println("decimal of " + myNum + "=" + decNum);
//     }
//     public static void main(String args[]) {
//         binToDec(1000);
//     }
// }

public class binTodec {
    public static void binToDec(int n) { // n is the binary number
        int mynum = n;
        int pow = 0;
        int decimalNumber = 0;

        while(n>0) {  // while loop mai sabase pahalae last digit nikalengae
            int lastDigit = n%10;
            System.out.println(lastDigit);
            decimalNumber = decimalNumber+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println(" Decimal Number " + mynum + " = " + decimalNumber);

    }
    public static void main(String args[]) {
        binToDec(101);
    }
}
