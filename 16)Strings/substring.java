/* String Functions - substring

 
 */
//import java.util.*;

// public class substring {
//     public static String subString( String str, int si, int ei) { // si=starting index, ei = ending index
//         String substr = "";  // empty kai sath initlise kar dia
//         for(int i=si; i<ei; i++) {  // ei is excluded it means not including.
//             substr += str.charAt(i);  // main logic 
//         }
//         return substr;

//     }
//     public static void main(String args[]) {
//         String str = "HelloWorld";
//         System.out.println(subString(str,0,5));  // output is Hello or
//     //  System.out.println(str.subString(0,5));
//     }
// }
    


public class substring {
    public static String printsubstring(String str, int si, int ei) {
        String substr = "";

        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String arg[]) {
        String str = "Helloworld";
        System.out.println(str.substring(0,9));
        //System.out.println(printsubstring(str, 0,6));
    }
}