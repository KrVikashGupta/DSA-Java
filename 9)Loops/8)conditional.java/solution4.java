//Q: what will be the value of x and y in the following program.
// public class solution4 {
//     public static void main(String args[]) {
//         int a = 63, b = 36;
//         boolean x = (a < b) ? true : false;
//         int y = (a > b) ? a : b;
//         System.out.println("x = " + x);
//         System.out.println("y = " + y); //output is : x = false, y = 63
//     }
// }

public class solution4 {
    public static void main(String args[]) {
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}