//WAP to print to find a reverse of 2 4 6 8 10
/*import java.util.*;

public class reverse {
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length-1;

        while(first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers [first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        //int numbers[] = {2, 4, 6, 8, 10};  // output is  10 8 6 4 2
        int numbers[] = {2, 4, 6, 8, 3, 56, 26, 207, 500};  // output is 500 207 26 56 3 8 6 4 2 

        reverse(numbers);
        //print
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    } 
}
*/
/* 
import java.util.*;

public class reverse {
    public static void reverse(int numbers[]) {
        int first = 0; int last =  numbers.length - 1;

        while(first < last) {
            //swap
            int temp = numbers[last]; // temp is variable
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++; // index +1
            last--;  // index -1
        }

    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        //reverse the array
        reverse(numbers);
        for(int i=0; i<numbers.length-1; i++) {
            System.out.print(numbers[i] + " ");
        }
         System.out.println();

    }
    
}
*/
/* 


public class reverse { 
    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length-1;

        while(first < last) {

            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
                
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        //for reverse print
        reverse (numbers);
        for(int i=0; i<numbers.length;i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();   // this line is not mandatory we can run this without this line
        
    }
}
*/


    

/* 

public class reverse {
    public static void Reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        
        Reverse(numbers); // Reverse the array

        for (int i = 0; i < numbers.length; i++) {  // Print the reversed array
            System.out.print(numbers[i] + " ");
        }
        System.out.println();  // Print a newline for better formatting
    }
}
*/

//import java.util.*;

/*
class reverse {
    public static void printreverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;

        while(first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {4, 6, 9, 2, 7, 45, 56};

        //reverse an array
        printreverse(numbers);
        for(int i=0; i<numbers.length;i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
*/
/* 
//import java.util.*;

class reverse {
    public static void findreverse(int numbers[]) {
        int  first = 0;
        int last= numbers.length - 1;

        while(first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]) {
      int numbers[] = {2, 3, 4, 5, 6, 7, 9};
        
        //for print reverse
        findreverse(numbers);
        for(int i=0; i<numbers.length-1; i++) {
            System.out.print(numbers[i] +  " ");
        }
        System.out.println();
    }
}
*/
/* 
import java.util.*;

public class reverse {
    public static void reverse_find(int numbers[]) {
        int first = 0, last = numbers.length-1;
        while(first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {4, 8, 2, 6, 10};
        reverse_find(numbers);
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+ " ");  //output is 10 6 2 8 4 
        }
        
    }
}
*/
// import java.util.*;
 
// public class reverse {
//     public static void revers_find(int numbers[]) {
//         int first = 0;
//         int last = numbers.length - 1;
//         while(first < last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;
//             first ++;
//             last--;
//         }
//     }
//     public static void main(String args[]) {
//         int numbers[] = { 23, 89, 54, 34, 98, 9, 67, 23, 56};
//         revers_find(numbers);
//         for(int i=0; i<numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//     }

// } 


// public class reverse {
//     public static void print_reverse(int nums[]) {
//         int start = 0, end = nums.length-1;

//         while(start < end) {
//             int temp = nums[end];
//             nums[end] = nums[start];
//             nums[start] = temp;
//             start++;
//             end--;

//         }
        
//     }
//     public static void main(String args[]) {
//         int nums[] = {34,56,98,45,34, 32,23};
//         print_reverse(nums);
        
//         // for print we are using loops 
//         for(int i=0; i<nums.length; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }


// public class reverse {
//     public static void print_reverse(int nums[]) {
//         int start = 0, end = nums.length-1;

//         while(start < end) {
//             int temp = nums[end];
//             nums[end] = nums[start];
//             nums[start] = temp;
//             start++;
//             end--;

//         }
        
//     }
//     public static void main(String args[]) {
//         int nums[] = {34,56,98,45,34, 32,23};
//         print_reverse(nums);
        
//         // for print we are using loops 
//         for(int i=0; i<nums.length; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }

// public class reverse {
//     public static void print_reverse(int nums[]) {
//         int start=0, end = nums.length-1;

//         while(start < end) {

//             //swap
//             int temp = nums[end];
//             nums[end] = nums[start];
//             nums[start] = temp;
//             start++;
//             end--; 
//         }
//     }
//     public static void main(String args[]) {
//         int nums[] = {3,34,8,9,4,4};
//         print_reverse(nums);
//          // for(print reverse)
//          for(int i=0; i<nums.length; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }


public class reverse {
    public static void getReverse(int nums[]) {

        int start = 0, end = nums.length-1;
        while(start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]) {
        int nums[] = {2,9,90,45,89,32};

        getReverse(nums);
        for(int i=0 ;i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
