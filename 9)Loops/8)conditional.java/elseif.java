/*
 when we write ifelse  then condition 1 is true/false then also check condition 2 is also check(always condition check)
 when we write if then else if  then condition 1  is true then no check condition 2 but if condition 1 false then condition 2 check (ae want condition 1 is true then not check that why we use else if)
------------------------
4. if-else-if ladder: Here, a user can decide among multiple options.
The if statements are executed from the top down.
 As soon as one of the conditions controlling the if is true, the statement associated with that ‘if’ is executed, and the rest of the ladder is bypassed. 
 If none of the conditions is true, then the final else statement will be executed

 * 
*/
// import java.util.*;

// public class elseif {
//     public static void main(String[] ags) {
//         int age = 89;
//         if(age >= 18) {
//             System.out.println("Adult");
//         }
//         else if(age >= 13 && age < 18) {
//             System.out.println("Teenager");
//         }
//         else {
//             System.out.println("Child");   //output is Teenager
//         }
        

//     }
// }



public class elseif {
    public static void main(String args[]) {
        int age = 13;
        if(age >= 18) {
            System.out.println("Adult");
        }
        else if(age >= 13 && age >= 18) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Child");
        }
    }
}