/*Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j],
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1, 0, 1, 2, -1, -4]
Output: [ [-1, -1, 2] , [-1, 0, 1] ]
Example 2:
Input: nums = [ ]
Output: [ ]
Example 3:
Input: nums = [ 0 ]
Output: [ ]  */

import java.util.*;

public class solu5 {
    public List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    
                    // Check if the sum of the triplet = 0
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        // Create a triplet and add it to the result
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        // Sort the triplet to ensure uniqueness
                        Collections.sort(triplet);
                        // Add the sorted triplet to the result
                        result.add(triplet);
                    }
                }
            }
        }
        
        // Remove duplicates using a LinkedHashSet
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
        // in leetcode till now
    }

    public static void main(String args[]) {
         
        int numbers[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solu5.threeSum(numbers); // Call the method on the instance
        System.out.println(result);
    }
}



