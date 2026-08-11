// public class subset {
//     public static void printSubset(String str, String ans, int i) {
//         //base case
//         if(i == str.length()) {
//             if(ans.length() == 0) {
//                 System.out.println("Null");
//             }
//             else {
//                 System.out.println(ans);
//             }
//            return;
//         }
        
//         //recursion
//         //yes choice 
//         printSubset(str, ans+str.charAt(i), i+1);
//         //no choice 
//         printSubset(str, ans, i+1);
//     }
//     public static void main(String args[]) {
//         String str = "abc";
//         printSubset(str,"",0);
//     }
// }



public class subset {
    public static void printSubset(String str, String ans, int i) {

        //base case
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }

        //recursion
        // yes choice
        printSubset(str, ans+str.charAt(i), i+1);
        //no choice
        printSubset(str, ans, i+1);

    }

    public static void main(String args[]) {
        String str = "abc";
        printSubset(str,"",0);
        
    }
}


