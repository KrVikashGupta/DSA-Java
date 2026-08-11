/* Solution 4:
What are anagrams?
If two string contain the same character but in a different order, they can be said to be anagrams.

More Anagram Examples
"rail safety" and "fairy tales"
"anagram" and "nagaram"
"listen" and "silent"
"triangle" and "integral"
"the eyes" and "they see"
"restful" and "fluster"
"race"  and "care"
WAP to checks if two strings are anagrams or not
*/

import java.util.Arrays;
public class anagrams {
    public static void main(String args[]) {
        String str1 = "earth";
        String str2 = "heart";

        /*Convert string to lowercase. Why? so that we don't have to check
        separately for lower & uppercase.*/

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //First check - if the length are the same
        if(str1.length() == str2.length()) {
            //convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            //sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //if the sorted char arrays are same or identical then the string are anagram

            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            }
            else {
                System.out.println(str1 + "and" + str2 + " are not anagram of each other");
            }
        }
        else {
            //case when length are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
        
    }

}
