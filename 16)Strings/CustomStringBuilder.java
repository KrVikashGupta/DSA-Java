/*StringBuilder sb = new StringBuilder("HW") ( StringBuilder ek className hai, sb ek variable hai ,new  ek keyword hai */
/*sb.toString() (toString means kisi v obj ko string mai convert kar dega ex float to string , int to string and so on but condition is that object
 hona chayia
 append method is mainly used to append or add data in a file.
StringBuilder is used to represent a mutable string of characters.
 Mutable means the string which can be changed. 
 So String objects are immutable but StringBuilder is the mutable string type. 
 It will not create a new modified instance of the current string object but do the modifications in the existing string object.

----------------------------------
In Java, a string is considered immutable, which means that once a String object is created, 
its value cannot be changed. Any operation that modifies a string actually 
creates a new String object rather than changing the original string.
 */
//import java.util.*;
// public class CustomStringBuilder { // with the help of we can modification / change kar sakte hai 
//     public static void main(String args[]) {
//         StringBuilder sb = new StringBuilder(""); // empty se initialize karenge
//         for (char ch = 'a'; ch <= 'z'; ch++) {
//             sb.append(ch);
//         } // abcdefghijklmnopqrstuvwxyz
//         System.out.println(sb); // sb.length() then output is 26
//     }
    
// }

public class CustomStringBuilder {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder(" ");
        for(char ch = 'a'; ch<='z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb.length());
    }
}
