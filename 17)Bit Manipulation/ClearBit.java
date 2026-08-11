///import java.util.*;

// public class clearItBit {
//     public static int clearIthBit(int n, int i) {
//         int bitMask = ~(1<<i);
//         return n & bitMask;
//     }
//     public static void main(String args[]) {
//         System.out.println(clearIthBit(10,1));  // output is 8
//     }
// }

// import java.util.*;

// public class clearItBit {
//     public static int clearIthBit(int n, int i) {
//         int bitMask = ~(1<<i);
//         return n & bitMask;
//     }
//     public static void main(String[] args) { 
//         System.out.println(clearIthBit(10,1));
//     }
// }


public class ClearBit {
    public static int printClear(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    
    public static void main(String args[]) {
        System.out.println(printClear(10,1)); // output is 8
    }
}