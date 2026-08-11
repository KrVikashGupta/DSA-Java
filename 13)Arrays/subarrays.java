//WAP to print that subarrays.
/*import java.util.*;

public class subarrays {
    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        for(int i=0; i<numbers.length; i++) {
            int start=i;
            for(int j=i; j<numbers.length; j++) {
                int end=j;
                for(int k=start; k<=end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("totalSubarrays = " + ts);
        
    }
    public static void main (String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
*/

/* 
2 
2 4 
2 4 6 
2 4 6 8 
2 4 6 8 10 

4 
4 6 
4 6 8 
4 6 8 10 

6 
6 8 
6 8 10 

8 
8 10 

10 

totalSubarrays = 15

 */
/* 
public class subarrays {
    public static void Print(int numbers[]) {

        int total_Pair = 0; //  total tp fir extra code 
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=0; j<numbers.length; j++) {
                int end = j;
                for(int k=i; k<=j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                total_Pair++;  // tp for xtra code 
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + total_Pair);  //ans is tp 81 for this 
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        Print(numbers);
    }
}
*/

// import java.util.*;

// public class subarrays {
//     public static void subarray_Pairs(int numbers[]) {
//         int total_Pairs = 0;
//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=i; j<numbers.length; j++) {
//                 int end = j;
//                 for(int k=start; k<=end; k++) {
//                     System.out.print(numbers[k] + " ");
//                     total_Pairs++;
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Total_Pairs in this array is : " + total_Pairs);
        
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         subarray_Pairs(numbers);
//     }
// }
    
public class subarrays {
    public static void print_subarray(int nums[]) {
        int tp=0;
        for(int i=0; i<nums.length; i++) {
            int start = i;
            for(int j=i; j<=nums.length; j++) {
                int end = j;
                for(int k=start; k<end;k++) {
                    System.out.print(nums[k] + " ");
                    tp++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total_Sum :" + tp );;
    }
    public static void main(String args[]) {
        int nums[] = {2,4,6,8,10};
        print_subarray(nums);
    }
}

