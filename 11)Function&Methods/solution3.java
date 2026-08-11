/*WAP to print a java program to check if a number is a palindrome in java ? 
121 is palindrome, 321 is not palindrome.*/
/*import java.util.*;

public class solution3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int palindrome = sc.nextInt();
        if(isPalindrome(palindrome)) {
            System.out.println(palindrome + " is a Palindrome.");
        }
        else {
            System.out.println(palindrome + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while(palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        // if orginal and the reverse of number is equal means
        // number is palindrome in java

        if(number == reverse) {
            return true;
        }
        return false;
    }
}*/

// import java.util.*;

// public class solution3 {
// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int num = sc.nextInt();
//     int reversedNum = 0 ;
//     int remainder;
//     int orginalNum = num;  //Store the num to orginalNum
    
//     // get the reverse of orginalNum
//     //store it in variable 
//     while(num != 0) {
//         remainder = num % 10;
//         reversedNum = reversedNum * 10 + remainder;
//         num /= 10;
//     }
//     //check reversedNum and orginalNum are equal
//     if(orginalNum == reversedNum) {
//         System.out.println(orginalNum + " is a palindrome.");
//     }
//     else {
//         System.out.println(orginalNum + " is not a palindrome.");
//     }
// }
//}


public class solution3 {
    public static int find_Pallindrome(int n) {

        if(n < 0) {
            return false;
        }
        
        int original = n;
        int reversed = 0;
        while(n != 0) {
            int lastDigit = n%10;
            reversed = reversed * 10 +lastDigit;
            n = n/10;
        }
        return original == reversed;
        
    }
    public static void main(String args[]) {
        System.out.println(find_Pallindrome(121));
    }
}
    

