/*//Passing array as argument.

import java.util.*;

public class Argument {
    public static void Update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int marks[] = {97,98,99} ;
        Update(marks);

        // print our marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }
}*/

/*  
public class Argument {
    public static void Update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int marks[] = {97,98,99}; // output is : 98 99 100 
        Update(marks);

        //print our marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
       

        
    }
}
*/
/* 
import java.util.*;

public class Argument {
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }

    }
    public static void main(String args0[]) {
        int marks[] = {23, 45, 67, 89, 98, 76, 58};
        update(marks);

        // for print our marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}

*/
// import java.util.*;

// public class Argument {
//     public static void update(int marks[]) {
//         for(int i = 0; i<marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args[]) {
//         int marks[] = {66, 45, 79, 85};
//         update(marks);

//         //Print the marks
//         for(int i = 0; i<marks.length; i++) {
//             System.out.print(marks[i] + " ");

//         }
//         System.out.println();
    
//     }
// }
 


// public class Argument {
//     public static void Update(int marks[]) {
//         for(int i=0; i<marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args[]) {
//         int marks[] = {45,46,47};
//         Update(marks);


//         //for print the output 
//         for(int i=0; i<marks.length; i++) {
//             System.out.print(marks[i] +" ");
//         }
//         System.out.println();
//     }
// }


import java.util.*;
public class Argument {
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String args[]) {
        int marks[] = { 97, 98, 99};
        update(marks);
        
        //print out array
        for(int i=0; i<marks.length;i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}
