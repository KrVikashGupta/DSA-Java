// import java.util.*;

// public class solu2 {
//     public static int target_find(int nums[], int target) {
//         int start = 0, end = nums.length - 1;
//          while(start <= end) {
//             int mid = (start + end) / 2;
//             if(nums[mid] == target) {
//                 return mid;
//             }
//             if(nums[start] <= nums[mid]) {
//                 if(nums[start] <= target && target < nums[mid]) {
//                     end = mid - 1;
//                 }
//                 else {
//                     start = mid + 1;
//                 }
//             }
//             else {
//                 if(nums[mid] < target && target <= nums[end]) {
//                     start = mid + 1;
//                 }
//                 else {
//                     end = mid - 1;
//                 }
//             }

//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int nums[] = { 4, 5, 6, 7, 0, 1, 2};
//         int target = 0;
//         System.out.println("Index at the key is : " + target_find(nums,target));
       
//     }
// }

public class solu2 {
    public static int print_Key(int nums[], int key) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(nums[mid] == key) {
                return mid;
            }
            //check left side is sorted or not
            if(nums[start] <= nums[mid]) {
                if(nums[start] <= key && key < nums[mid]) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if(nums[mid] < key && key <= nums[end]) {
                    start = mid+1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
        
    }
    public static void main(String args[]) {
        int nums[] = {4,5,6,7,0,1,2};
        int key = 0;
        System.out.print(print_Key(nums, key));
    }
}