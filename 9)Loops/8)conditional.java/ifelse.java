/*
2. if-else: The if statement alone tells us that if a condition is true 
it will execute a block of statements and if the condition is false it won’t. 
*/ 


/*import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        int age = 16;
        if(age >= 18) {
            System.out.println("Adult : Drive, Vote");   //we can write multiple if condition 
        }
        if(age > 13 && age < 18) {
            System.out.println("Teenager"); //first complier check 1st if then 2 if then last one  
        }
        else {
            System.out.println("Not Adult");  //out[ut is Teenager]
        }
        
        
    }
}*/
/*
import java.util.*;

public class ifelse {
    public static void main(String args[]) {
        int age = 20;
        if(age >=18) {
            System.out.println("Adult :  They can drive as well as vote.");
        }
        else {
            System.out.println("Not Adult");
        }
    }
}*/

// or

// import java.util.*;

// public class ifelse {
//     public static void main(String args[]) {
//         int age = 16;
//         if(age >=18) {
//             System.out.println("Adult :  They can drive as well as vote.");
//         }
//         if(age > 13 && age < 18) {
//             System.out.println("Teenager")
//         }
//         else {
//             System.out.println("Not Adult");
//         }
//     }
// }


public class ifelse {
    public static void main(String args[]) {
        int age = 16;
        if(age >= 18) {
            System.out.println("Adult: They can vote and drive");
        }
        if(age > 13 && age < 18) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Not adult");
        }
    }
}