import java.util.*;

public class clearIthRangeBit {
    public static clearIthRangebit(int n, int i, int j) {
        int a = (~0)<<i;
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String args[]) {
        System.out.println(clearIthRangebit(10, 2, 4));
    }
}
