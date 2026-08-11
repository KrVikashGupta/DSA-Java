/*Given a route containg & direction(E,W,N,S), find the shortest path to reach destination.  (for WNEENESENNN)*/
//import java.util.*;

// public class direction {
//     public static float getShortPath(String path) {
//         int x=0, y=0;
//         for(int i=0; i<path.length(); i++) {
//             char dir = path.charAt(i);
//             //South
//             if(dir == 'S') {
//                 y++;
//             }
//             //north
//             else if(dir == 'N') {
//                 y--;
//             }
//             //West
//             else if(dir == 'W') {
//                 x--;
//             }//East
//             else {
//                 x++;
//             }
//         }
//         int x2 = x*x;
//         int y2 = y*y;
//         return(float)Math.sqrt(x2+y2);
        
//     }
//     public static void main (String args[]) {
//         //String path = "WNEENESENNN";  // o/p:5.0
//         String path = "NS";  // o/p:0.0
//         System.out.println(getShortPath(path));
        
//     }
    
// }


public class direction {
    public static double printShortPath(String str) {
        int x=0, y=0;
        for(int i=0; i<str.length();i++) {
            char dir = str.charAt(i);

            if(dir == 'S') {
                y--;
            }
            else if(dir == 'N') {
                y++;
            }
            else if(dir == 'W') {
                x--;
            }
            else {
                x++;
            }
        }
        // int x2 = x*x;
        // int y2 = y*y;
        return Math.sqrt(x*x + y*y);// return under root x2-x2 y2-y2  , x2 = x square, y2 = y square
    }
    public static void main(String args[]) {
        String str = "WNEENESENNN";
        System.out.println(printShortPath(str));
    }
}
