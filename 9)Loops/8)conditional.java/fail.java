//Q: Check if a students will  PASS or FAIL using ternary operator (marks >= 33: PASS ,marks < 33:)
// import java.util.*;

// public class fail {
//     public static void main(String args[]) {
//         int marks = 31;
//         String reportCard = marks >=33 ? "PASS" : "FAIL"; 
//         System.out.println(reportCard);  //input is 67 then output is PASS, input is 31 output is FAIL
//     }
// }


public class fail {
    public static void main(String args[]) {
        int marks = 99;
        String pass_fail = marks >= 33 ? "Pass" : "Fail" ;
        System.out.println(pass_fail);
    }
}