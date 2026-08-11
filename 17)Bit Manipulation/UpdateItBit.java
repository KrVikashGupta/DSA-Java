//import java.util.*;

public class UpdateItBit {
    public static int UpdateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return n & ~(1 << i); // Clear ith bit(direct written properties)
        } else {
            return n | (1 << i); // Set ith bit

            // n = clearIthBit(n, i);
            // int bitMask = newBit<,i;
            // return n | bitMask;  // 2nd method to solve this Problem;
        }
    }

    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10, 2, 1)); // Output: 14
    }
}
