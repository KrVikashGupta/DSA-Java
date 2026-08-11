/* String Function - Compare 
  Two number ko compare kartae hai to == likh detae hai but String mai har baar nahi hota hai (==);
  java mai enturning a=naam ka chiz hota hai 
  jab string abanate hai aur usko new keyword kae sath nahi bantae to wo purani string ko he point kar raha hota hai s1 = tony  hai to s2 ko ko tony samjta hai aur jab string ko new keyword sae  create karta hai to  ek naya create hota hai
  example
*/
//import java.util.*;
/* 
public class compare {
    public static void main(String args[]) {
        String s1 = "Viraj";
        String s2 = "Viraj";
        String s3 = new String("Viraj");

        if(s1 == s2) {
            System.out.println("Strings are Equal");
        }
        else {
            System.out.println("Strings are not Equal");
        }
        if(s1 == s3) {
            System.out.println("Strings are Equal");
        }
        else {
            System.out.println("Strings are not Equal");  
            
        }
    }
}*/
/*output is 
Strings are Equal
Strings are not Equal*/

// public class compare {
//     public static void main(String args[]) {
//         String s1 = "Viraj";
//         String s2 = "Viraj";
//         String s3 = new String("Viraj");
//         if(s1.equals(s3)) {  //.equals function  aur .equal boolean ko return krta hai true / false
//             System.out.println("Strings are Equal");
//         }
//         else {
//             System.out.println("Strings are not Equal");  
//         }
//     }
// }
/*
  output is :
  Strings are Equal because .equals function sirf value check karta hai)
*/

public class compare {
    public static void main (String args[]) {
        String s1 = "Vikash";
        String s2 = "Vikash";
        String s3 = new String("Vikash");
        if(s1.equals(s2)) {   
            System.out.println("String are Equal");
        }
        else {
            System.out.println("String are not equal");
        }
        if(s1.equals(s3)) {
            System.out.println("String are Equal");
        }
        else {
            System.out.println("String are not equal");
        }
    }
}


