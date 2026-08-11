/* for a given set of Strings, print the largest String.
"apple, "mango", "banana" 
by lexicoggraphic means  character by check karta hai,
Special type of function that is  (str1.compareTo(str2) in ths 'A' != 'a';one another function that is "IgnoreCase" in this 'A'=a 
in(Str1.compareTo(str2) :
0: equal
<0 : -ve st1 < st2
>0 : +ve st1 > st2
so we are use this one 
 
 */
//import java.util.*;


// public class printLargest {
//     public static void main(String args[]) {
//         String fruits[] = {"apple", "mango", "banana"};

//         String largest = fruits[0];
//         for (int i = 1; i < fruits.length; i++) {
//             if (largest.compareTo(fruits[i]) < 0) {
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);  // output is mango
//     }
// }

public class printLargest {
    public static void main(String args[]) {
        String fruits[] = {"apple", "mango", "banana"};
        
        String largest = fruits[0];
        
        for(int i=0; i<fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
