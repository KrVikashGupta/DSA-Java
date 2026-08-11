//import java.util.*;
//check if a string is palindrome
/*public class palindrone {
    public static boolean isPalindrone(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main (String args[]) {
        String str = "racecar";  // this code work for numeral words also.
        System.out.println(isPalindrone(str));

    }
    
}*/

// public class palindrone {
//     public static boolean isPalindrone(String str) {
//         for(int i=0; i<str.length()/2; i++) {
//             int n=str.length();;
//             if(str.charAt(i) != str.charAt(n-1-i)) { // because agar char equl na ho to compare krna hoga return false 
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         String str = "18881";
//         System.out.println(isPalindrone(str));

//     }
// }

//if we want to print the paalindrome or not 

// public class palindrone {
//     public static boolean print_Pallin(String str) {
//         int n = str.length();
//         for(int i=0; i<str.length()/2; i++) {
//             if(str.charAt(i) != str.charAt(n-1-i)) {
                
//             return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         String str = "madam";
//         if(print_Pallin(str)) {
//             System.out.println(str + " is a Pallindrone");
//         }
//         else {
//             System.err.println(str + " is not a Pallinrome");
//         }
        
        
//     }
// }


// public class palindrone {
//     public static boolean print_Pallin(String str) {
//         int n = str.length();
//         for(int i=0; i<str.length()/2; i++) {
//             if(str.charAt(i) != str.charAt(n-1-i)) {
                
//             return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         String str = "675767";
//         if(print_Pallin(str)) {
//             System.out.println(str);
//         }
//         else {
//             System.err.println(str + " is not a Pallinrome");
//         }
//     }
// }



// public class palindrone {
//     public static boolean printPal(String str) {
//         int n = str.length();
//         for(int i = 0; i< n/2; i++) {
//             if(str.charAt(i) != str.charAt(n - 1 - i)) { 
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]) {
//         String str = "vikash";
//         System.out.println(printPal(str));

//     }
// }


// public class palindrone {
//     public static boolean printPallin(String str) {
//         for(int i=0;i<str.length()/2;i++) {
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n-i-1)) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         String str = "madam";
//         System.out.println(printPallin(str));

//     }
// }

public class pallindrome {
    public static boolean printPallin(String str) {
        for(int i=0; i<str.length()/2; i++) {
            str = str.toLowerCase(); // Convert the string to lowercase to ignore case
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)) {
                //not a pallindrome 
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String str = "Madam"; // output is false beacuse capital M is there so hav to wrote one line 
        System.out.println(printPallin(str));
    }
}