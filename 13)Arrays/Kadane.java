/*WAP to print that maxsubarraysum  -2, -3, 4, -1, -2, 1, 5, -3 USING KADANE Algorithm.
if all element are -ve then output give 0  which is wrong output so write also another approch next program.*/
//import java.util.*;
// This code is short but Approch is little trikey.
/*public class Kadane {
    public static void kadane(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {    // if we got -ve value then print as a 0
                cs = 0;
            }
            ms = Math.max(cs, ms); //.max is the function that what numbers is max it will print
        }
        System.out.println("Max subarray sum is : " + ms);  
    }
    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(numbers); 
    }
    // Max subarray sum is : 7
}*/



/* 
public class Kadane {
    public static void kadane(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];

            if(cs < 0) {
                cs = 0; // when output is negative then we are take as a 0
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max Subarray is : " + ms);
    }
    public static void main(String args[]) {
        int numbers[] ={-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(numbers);
              // output of thus code is- Max Subarray is : 7
    }
}*/

//import java.util.*;
/* 
class Kadane {
    public static void maxSubarray(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length; i++) {
            cs = cs + numbers[i];

            if(cs < 0) {  // if number are negative value then print as 0
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("MaxSubarray " + ms);
        
    }
    public static void main(String args[]) {
        int numbers[] = {3, 5, 8, 9, -4, -9, 3,-5};
        maxsSubarray(numbers);
    }
}
*/
/* 
import java.util.*;

public class Kadane {
    public static void kadane_algo(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max Subarray is : " + ms);
    }
    public static void main (string args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, -3};
        kadane_algo(numbers);
    }

}
*/
/* 
import java.util.*;

public class Kadane {
    public static void kadane_find(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max sum subbarray :" + ms);

    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 8, -2, 7, -1, -4, -7};
        kadane_find(numbers);
    }
}*/
/* 
import java.util.*;

public class Kadane {
    public static int maxKadane(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        return ms;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 8, -2, 7, -1, -4, -7};
        int maxSum = maxKadane(numbers);
        System.out.println("Maximum sum is :" + maxSum);
    }
}
*/
// import java.util.*;

// public class Kadane {
//     public static int Kadane_find(int numbers[]) {
//         int cs = 0;
//         int ms = Integer.MIN_VALUE;

//         for(int i=0; i<numbers.length; i++) {
//             cs = cs + numbers[i];

//             if(cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(cs,ms);
//         }
//         return ms;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
//         Kadane_find(numbers);
//     }
// }


// public class Kadane {
//     public static void  print_kadane(int nums[]) {
//         int cs = 0;
//         int ms = Integer.MIN_VALUE;

//         for(int i=0; i<nums.length; i++) {
//             cs = cs+0.nums[i];
//             if(cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(cs,ms);
//         }
//         System.out.println("MaxSumSubarray is : "+ ms);
//     }
//     public static void main(String args[]) {
//         int nums[] = {-2,-3,4,-1,-2,1,5,-3};
//         print_kadane(nums);
//     }
// }

// public class Kadane {
//     public static void print_Kadane(int nums[]) {
//         int cs = 0;
//         int ms = Integer.MIN_VALUE;

//         for(int i=0; i<nums.length; i++) {
//             cs = cs+nums[i];
//             if(cs > ms) {
//                 ms = cs;
//             }
//             if(cs < 0) {
//                 cs=0;
//             }
//             ms = Math.max(cs,ms);
//         }
//         System.out.println("Maximum Subarray is : "+ ms);
//     }
//     public static void main(String args[]) {
//         int nums[] = {-2, -3, -1, -5, -4 };
//         print_Kadane(nums);
//     }
// }

// public class Kadane {
//     public static void print_Kadane(int nums[]) {
//         int cs = nums[0];  // Start with the first element
//         int ms = nums[0];  // Start with the first element as the max sum

//         for(int i = 1; i < nums.length; i++) {
//             cs = Math.max(nums[i], cs + nums[i]); // Update current sum
//             ms = Math.max(ms, cs); // Update max sum if current sum is larger
//         }
//         System.out.println("Maximum Subarray is: " + ms);
//     }
    
//     public static void main(String args[]) {
//         int nums[] = {-2,-3,4,-1,-2,1,5,-3};
//         print_Kadane(nums);
//     }
// }


public class Kadane {
    public static void print_Kadane(int nums[]) {
        int cs = nums[0];
        int ms = nums[0];

        for(int i=1; i<nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(cs,ms);
        }
        System.out.println("MaxSubArray is : " + ms);
    }
    public static void main(String args[]) {
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        print_Kadane(nums);
    }
}
