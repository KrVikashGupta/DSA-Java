// public class Tiling_Problem {
//     public static int printTile(int n) {
//         //Base case
//         if(n == 0 || n == 1) {
//             return 1;
//         }
//         //ka am
//         //verticle
//        int nm1 = printTile(n-1);

//        //horizontal
//        int nm2 = printTile(n-2);
//        int TotalWays = nm1 + nm2;
//        return TotalWays;
//     }
//     public static void main(String[] args) {
//         System.out.println(2);
//     }
// }
public class Tiling_Problem {
    public static int printTiling(int n) {
        
        //for verticle
        int xnm1 = printTiling(n-1);

        //for horizontal
        int xnm2 = printTiling(n-2);

        int TilingWays = xnm1+xnm2;
        return TilingWays;

    }
    public static void main(String args[]) {
        System.out.println(2);
    }
}
