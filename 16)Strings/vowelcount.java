/*
Solution 1: count how many times lowercase vowel occurred in  a string entered by the user

*/

import java.util.*;
public class vowelcount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }
        System.out.println("Count of vowel is : " + count);
        sc.close();
    }
}
