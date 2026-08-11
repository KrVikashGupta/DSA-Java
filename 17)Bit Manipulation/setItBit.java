// public class setItBit {
//     public static int setIthbit(int n, int i) {
//         int bitMask = 1 << i;
//         return n | bitMask;

//     } 
//     public static void main(String args[]) {
//         System.out.println(setIthbit(10,2));  //output is 14
//     }
// }


public class setItBit {
    public static int printset(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;

    }
    public static void main(String args[]) {
        System.out.println(printset(10,2));
    }
}