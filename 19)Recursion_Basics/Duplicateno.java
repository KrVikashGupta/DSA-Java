// import java.util.*;
//time complexity is o(nlogn)
// public class Duplicateno {
//     public static boolean containDuplicate(int nums[]) {
//         Arrays.sort(nums);

//         for(int i=0; i<nums.length-1 ; i++) {
//             if(nums[i] ==  nums[i+1]) {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int nums[] = {4, 8, 0};
//         System.out.println(containDuplicate(nums));
//     }
// }

import java.util.*;
//timeComplexity is o(n2) which is bad
public class Duplicateno {
    public static boolean containDuplicate(int nums[]) {
        
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {

                if(nums[i] == nums[j]) {
                    return true;
                }

            }
        }
        return false;
    }
}
    public static void main(String args[]) {
        int nums[] = {3, 8, 9, 5, 7, 8};
    System.out.println(nums);
}

