/*  an integer array nums | return  true if any value at least twice in the array |  return false if every element is different 
input: nums = [1, 2, 3, 1] then output is true | [ 1, 2, 3, 4,] then output is false | [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] |*/
/* 
import java.util.*;

public class solu1 {
    public boolean containDuplicate(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false; 
    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 1};
        System.out.println(containDuplicate(nums));
    }
}
*/

// import java.util.*;

// public class solu1 {
//     public static boolean containsDuplicate(int nums[]) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<nums.length; i++) {
//             if(set.contains(nums[i])) {
//                 return true;
//             }
//             else {
//                 set.add(nums[i]);
            
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         int nums[] = {1, 2, 3};
//         System.out.println(containsDuplicate(nums));
//     }
// }

// public class solu1 {
//     public static int print_duplicate(int nums[]) {
//         for(int i=0; i<nums.length-1;i++)  {
//             for(int j=i+1; j<nums.length; j++) {
//                 if(nums[i] == nums[j]) {
//                     return nums[i];
//                 }
//             } 
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int nums[] = {1,2,3,4 ,2};
//         System.out.println(print_duplicate(nums));
//     }
// }

public class solu1 {
    public static boolean print_Duplicate(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
                
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int nums[] = {8,9,7,5,6,4,2,3};
        System.out.println(print_Duplicate(nums));
        
    }
}