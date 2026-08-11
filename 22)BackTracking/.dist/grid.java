// //import java.util.*;
// public class grid {
//     public static int gridWays(int i, int j, int n, int m) {
//         //base case
//         if(i == n-1 && j == m-1) {  // condition for last cell
//             return 1;
//         }
//         else if(i == n || j == n) { // boundary cross section 
//             return 0;
//         }
//         int right = gridWays(i, j+1, n, m);
//         int down = gridWays(i+1, j, n, m);
//         return right + down;
//     }
//     public static void main(String args[]) {
//         int n = 4, m = 4;
//         System.out.println(gridWays(0,0,n,m));
//     }
    
// }

public class grid { 
    public static int gridWays(int i, int j, int n, int m) {
        //baseCase
        if(i == n-1 && j == m-1) {
            return 1;
        }
        else if(i == n || j == m) {
            return 0;
        }
        int w1 = gridWays(i,j+1,n,m);
        int w2 = gridWays(i+1, j, n,m);
        return w1 + w2;
    }
    public static void main(String args[]) {
        int n=3, m=3;
        System.out.println(gridWays(0, 0, n, m));
    }
}

