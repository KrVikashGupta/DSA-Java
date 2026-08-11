/*(do it by own by Builder method )
String Compression : 
case : "aaabbbbccccdd" : a3b4c3d2
case : "aaabbbdd" : a3b3d2
"abc" : abc not a1b1c1

*/
// public class compression {
//     public  static String compression(String str) {
//         String newStr = " ";
//         for(int i=0; i<str.length(); i++) {
//             Integer count = 1;
//             while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
//                 count++;
//                 i++;
//             }
//             newStr += str.charAt(i);
//             if(count > 1) {
//                 newStr += count.toString();
//             }
//         }
//         return newStr;
//     }
//     public static void main(String args[]) {
//         String str = " abc";
//         System.out.println(compression(str));
//     }
    
// }

// public class compression {
//     // Method to compress the given string
//     public static String compress(String str) {
//         // Create a StringBuilder to build the new compressed string
//         StringBuilder sb = new StringBuilder();  

//         // Loop through each character in the input string
//         for (int i = 0; i < str.length(); i++) {
//             // Initialize a count to track consecutive characters
//             int count = 1;  

//             // While the next character is the same as the current one
//             while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;  // Increment the count of consecutive characters
//                 i++;  // Move to the next character
//             }

//             // Append the current character to the StringBuilder
//             sb.append(str.charAt(i));
//             // If the count of consecutive characters is more than 1, append the count
//             if (count > 1) {  
//                 sb.append(count);  
//             }
//         }
//         // Convert the StringBuilder to a String and return it
//         return sb.toString();  
//     }

//     // Main method to test the compress function
//     public static void main(String[] args) {
//         String str = "aaabbc";  // Example input string
//         // Print the compressed string output
//         System.out.println(compress(str));  // Output: a3b2c
//     }
// }




public class compression {
    public static String printCompression(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        
        for(int i=0; i<str.length(); i++) {
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));

            if(count > 1) {
                sb.append(count);
            }
            count = 1;
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "abccbaaa";
        System.out.println(printCompression(str));
    }
}
