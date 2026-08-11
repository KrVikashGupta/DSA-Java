/*
Question 1:(DSA Sheet #4)
 Given an integer array nums, return true if any value appears at least twice in the
array, and return false if every element is distinct.

Example 1:
Input: nums = [1, 2, 3, 1]
Output: true

Example 2:
Input: nums = [1, 2, 3, 4]
Output: false
Example 3:

Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output: true

Constraints:
• 1 <= nums . lengtth <= 105
• -109 <= nums [ i ] <= 109
public class solution1 {
    
}*/

//import java.util.*;

import java.util.Arrays;

public class solution1 {
    public static boolean containsDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Check for duplicates by comparing adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Found a duplicate
            }
        }

        return false; // No duplicates found
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean hasDuplicate = containsDuplicate(nums);

        if (hasDuplicate) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
