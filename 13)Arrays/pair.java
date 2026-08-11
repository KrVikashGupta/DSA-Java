//WAP to print a pairs in an array 
/* import java.util.*;

public class pair {
    public static void printPairs(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("("+curr + "," + numbers[j] +")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    
    
    }
}
*/
/* 

import java.util.*;

public class pair {
    public static void pairs(int numbers[]) {

        int total_pairs = 0;
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i]; // 2,4,6,8,,12,14,16,18,20
            for(int j=i+1; j<numbers.length;j++) {
                System.out.print("("+ curr + "," + numbers[j] + ")");  // if we right i instead of j then same thing will be print like (10,10)
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total_Pairs: " + total_pairs);
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        pairs(numbers);

    }
}
*/


/* 
public class pair {
    public static void Print_Pair(int numbers[]) {
        int total_pair = 0;  // for find the total number of pair
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i]; // for numbers like 2, 4, 6, 8, 8......
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("("+ curr + "," + numbers[j] +")");

                total_pair++; //to find tp
            }
            System.out.println();  // for next line 
        }
        System.out.println("Total Pairs : " + total_pair);
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 14, 16, 18};
        Print_Pair(numbers);
    }
}
*/

// import java.util.*;

// public class pair {
//     public static void pair_find(int numbers[]) {
//         int total_pairs = 0;
//         for(int i=0; i<numbers.length;i++) {
//             int current = numbers[i];
//             for(int j=i+1; j<numbers.length; j++) {
//                 System.out.print("("+current + "," + numbers[j]+")");
//                 total_pairs++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total pair in this array: " + total_pairs);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 12};
//         pair_find(numbers);
//     }
// }



// public class pair {
//     public static void print_pair(int nums[]) {
//         for(int i=0; i<nums.length; i++) {
//             int curr = nums[i]; // 2,4,6,8,10,12
//             for(int j=i+1; j<nums.length; j++) {
//                 System.out.print("(" + curr + ","+ nums[j] + ")");
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String args[]) {
//         int nums[] = {1,2, 4, 6, 5, 8, 9};
//         print_pair(nums);
//     }
// }

// public class pair {
//     public static void print_Pair(int nums[]) {
//         for(int i=0; i<nums.length; i++) {
//             int curr = nums[i];  // for {2, 3, 5, 7, 8}
//             for(int j=i+1; j<nums.length; j++) {
//                 System.out.print("(" + curr + "," + nums[j] + ")");
                
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         int nums[] = { 2,3,5,5,6,6,7,9};
//         print_Pair(nums);
        
//     } 
// }


// public class pair {

// public static void print_pair(int nums[]) {
//     int tp =0;
   
//     for(int i=0; i<nums.length; i++) {
//         int curr = nums[i]; // for find the current
//         for(int j=i+1; j<nums.length; j++) {
//             System.out.print("(" + curr + "," + nums[j] +")");
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.println("Total Pairs: " + tp);
    
// }
//     public static void main(String args[]) {
//         int nums[] = {2,4,6,8,9,12};
//         print_pair(nums);
//     } 
// }


public class pair {
    public static void printpair(int nums[]) {
        //if i have find total pair than add 3 lines 155,162,167
        int tp = 0;

        for(int i=0; i<nums.length; i++) {
            int curr = nums[i]; // print the curr nums like 2,6,9,.........
            for(int j=i+1; j<nums.length; j++) {
                System.out.print("(" + curr + "," + nums[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pair : " + tp);
        
    }
    public static void main(String args[]) {
        int nums [] = {2,6,9,3,2,3,3};
        printpair(nums);
        

    }
}