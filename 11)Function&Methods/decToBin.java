// WAP to print that convert from decimal to binary.
// import java.util.*;

// public class decToBin {
//     public static void decToBin(int n) {
//         int myNum = n;
//         int pow = 0;
//         int binNum = 0;

//         while(n > 0) {
//             int rem = n % 2;
//             binNum = binNum + (rem * (int)Math.pow(10,pow));
//             pow++;
//             n = n/2;
//         }
//         System.out.println("binary form of" + myNum + "="  + binNum);
//     }
//     public static void main(String args[]) {
//         decToBin(117 ); //  output is 111
//     }
    
// }

public class decToBin {
    public static void decToBinn(int n) {
        myNum = n;
        int pow = 0;
        int binaryNumber = 0;
        while(n>0) {
            int rem = n%2; // rem kolast digit v ka saktae hai binary wal mai v last digit nikal rahae thae but yaha % 2 hai wha pae  10 sae
            binaryNumber = binaryNumber + (rem *(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of " + myNum + " = " + binaryNumber);
    }
    public static void main(String args[]) {
    S
    }

}