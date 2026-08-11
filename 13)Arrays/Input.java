/*// Array- Input, output, Update.
import java.util.*;

public class Input {
    public static void main(String args[]) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        //int phy;
        //phy = sc.nextInt();     but input in array written like in next line
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Phy marks : " + marks[0]);
        System.out.println("Che marks : " + marks[1]);
        System.out.println("Mth marks : " + marks[2]);

        // marks[2] = 100;   //we can also update the marks 
        // System.out.println("Mth marks : " + marks[2]);

         //we can change the marks also
        // marks[2] = marks[2] + 1; // +,-,*,/, also 

         //we can find also length of an array i.e- .length
        // System.out.println("Length of the array : " + marks.length);  //then output is 100



    }
    
}
*/


  
// import java.util.*;

// public class Input {
//     public static void main(String args[]) {
//         int marks[] = new int[100];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the marks: ");

//         marks[0] = sc.nextInt();  // phy 
//         marks[1] = sc.nextInt(); // che
//         marks[2] = sc.nextInt();  //math

//         System.out.println("phy : " + marks[0]);
//         System.out.println("che : " + marks[1]);
//         System.out.println("math :" + marks[2]);

//         marks[2] = 100;
//         System.out.println("math : " + marks[2]);  // we can update also 

//         //int percentage = (marks[0] + marks[1] + marks[2]); //  we can find percentage also
//         //System.out.println("Percentage: " + percentage + "%");
//         /*this is output
//         phy : 97
//         che : 98
//         math :99
//         math : 100*/

//         // we can find also length of the array by using .length
//         // System.out.println("Length of the array= " + marks.length);
         
//     }
// }


import java.util.*;

public class Input {
    public static void main(String args[]) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy : " + marks[0]);
        System.out.println("Che : " + marks[1]);
        System.out.println("Maths : " + marks[2]);
        //

        //if i wan to update the array then 
        marks[0] = marks[0] + 1;
        System.out.println("Phy : " + marks[0]);

        //if we i want to find the percentage
        int percentage = (marks[0] + marks[1] + marks[2])/396;
        System.out.println("Percentage : " + percentage + "%");

        //If we want find out the array of hte length then
        System.out.println("Length of the Array : " + marks.length);

}
    
}


    
