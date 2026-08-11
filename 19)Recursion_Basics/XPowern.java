// public class XPowern {
//     public static int power(int x, int n) {

//         //base case
//         if(n == 0) {
//             return 1;
//         }
//         /*int xnm1 = power(x,n-1);
//         int xm = x * xnm1;
//         return xm;*/  // only single line without variable


//         return x * power(x,n-1);
//     }
//     public static void main(String[] args) {
//         System.out.println(power(3, 10));
//     }
// }

public class XPowern {
    public static int printPower(int x, int n) {

        //base case
        if(n==0) {
            return 1;
        }
        /*int xnm1 = printPower(x,n-1);
        int xn = x*xnm1;
        return xn;*/
        // not used variable

        return x * printPower(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println (printPower(2,10));
    }
}

