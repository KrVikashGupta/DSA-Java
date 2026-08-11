//import java.util.*;

// public class getItBitjava {
//     public static int getIthBit(int n, int i) {
//         int bitMask = 1<<i;
//         if((n & bitMask) == 0) {
//             return 0;
//         } 
//         else {
//             return 1;
//         }
//     }
//     public static void main(String args[]) {
//         System.out.println(getIthBit(10,2));  //output is 0
//     }
// } 


public class getItBitjava {
    public static int printget(int n, int i) {
        int bitMask = (1<<i);
        if((n & bitMask) == 0) {
            return 0;
        }
        else {
            return 1;
        }

    }
    public static void main(String args[]) {
        System.out.println(printget(10,1));
    }
}


