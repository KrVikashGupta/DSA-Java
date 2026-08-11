//WAP to print that maxsubarraysum 1 -2 6 -1 3.
// import java.util.*;

// public class maxsubarraysum {
//     public static void maxsubarraysum(int numbers[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
        
//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
            
//             for(int j=i; j<numbers.length; j++) {
//                 int end = j;
            
//                 currSum = 0;
//                 for(int k=start; k<=end; k++) {
//                     currSum += numbers[k];
//                 }
//                 System.out.println(currSum);
//                 if(maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }

//         System.out.println("maxSum = " + maxSum);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         maxsubarraysum(numbers);
//     }   
// }

/*
 1
-1
5
4
7
-2
4
3
6
6
5
8
-1
2
3
maxSum = 8
 */



//  public class maxsubarraysum {
//     public static void max_subarrays(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for(int i=0; i<numbers.length;i++) {
//             int start = i;
//             for(int j=i; j<numbers.length; j++) {
//                 int end = j;
//                 currSum = 0;
//                 for(int k=start; k<=end; k++) {
//                 currSum += numbers[k];
//             }
//             System.out.println(currSum);
//             //compare
//             if(maxSum < currSum) {   // if ms < cs then update
//                 maxSum = currSum;
//             }
//         }
//     }
//     System.out.println("Max Subarray :" + maxSum);
// }
//     public static void main(String args[]) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         max_subarrays(numbers);
//     }
// }



// public class maxsubarraysum {
//     public static void print_max_sum(int nums[]) {
//         int cs = 0;
//         int ms = Integer.MIN_VALUE;  // max sum
       
//         for(int i = 0; i < nums.length; i++) {
//             int start = i;
//             for(int j = i; j < nums.length; j++) {
//                 int end = j;
//                 cs = 0;
//                 for(int k = start; k <= end; k++) {
//                     cs += nums[k];
//                 }
//                 System.out.println(cs);
//                 if(ms < cs) {
//                     ms = cs;
//                 }
//             }
//         }
        
//         System.out.println("Max Sum: " + ms);
        
//     }
    
//     public static void main(String args[]) {
//         int nums[] = {1, -2, 6, -1, 3};
//         print_max_sum(nums);
//     }
// }


public class maxsum {
    public static void print_max_sum(int nums[]) {
        // Initialize the maximum sum as the smallest possible integer value
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            current_sum = 0;
            for (int j = i; j < nums.length; j++) {
                current_sum += nums[j];
                if (current_sum > max_sum) {
                    max_sum = current_sum;
                }
            }
        }
        
        System.out.println("Max Sum: " + max_sum);
    }
    
    public static void main(String args[]) {
        int nums[] = {1, -2, 6, -1, 3};
        print_max_sum(nums);
    }
}

