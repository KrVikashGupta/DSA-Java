/*Given
n non-negative integers representing elevation map where width of each bar is 1,
how much water it can trap after raining.
 */
/* 
 import java.util.*;

 public class solu4 {
    public static int trap(int height[]) {
        int n = height.length;
        int res = 0, l=0, r=n-1;
        int lMax = height[l], rMax = height[r];

        while(l < r) {
            if(lMax < rMax) {
                l++;
                lMax = Math.max(lMax,height[l]);
                res += lMax - height[l];
            }
            else {
                r--;
                rMax = Math.max(rMax,height[r]);
                res += rMax - height[r];
            }
        }
        return res;


    }
    public static void main(String args[]) {
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height));
    }
 }
 */
// import java.util.*;

// public class solu4 {
//     public static int trap(int height[]) {
//         int n = height.length;
//         int res = 0, l=0, r= n-1;
//         int lMax = height[l], rMax = height[r];

//         while(l < r) {
//             if(lMax < rMax) {
//                 l++;
//                 lMax = Math.max(lMax,height[l]);
//                 res += lMax - height[l];
//             }
//             else {
//                 r--;
//                 rMax = Math.max(rMax, height[r]);
//                 res += rMax - height[l];
//             }
//         }
//         return res;
//     }
//     public static void main(String args[]) {
//         int height[] = {4, 2, 0, 3, 2, 5};
//         System.out.println(trap(height));
//     }
// }

// public class solu4 {
//     public static int print_trappedWater(int height[]) {
//         int n = height.length;
//         int t_W = 0,l=0,r=n-1;
//         int l_Max = height[l], r_Max = height[r];

//         while(l < r) {
//             if(l_Max < r_Max) {
//                 l++;
//                 l_Max = Math.max(l_Max,height[l]);
//                 t_W += l_Max-height[l];
//             }
//             else {
//                 r--;
//                 r_Max = Math.max(r_Max,height[r]);
//                 t_W += r_Max -height[r];
//             }
//         }
//         return t_W;
//     }

//     public static void main(String arg[]) {
//         // int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//         int height[] = {4,2,0,3,2,5};
//         System.out.println(print_trappedWater(height));
//     }
// }

public class solu4 {
    public static int trap(int height[]) {
        int n = height.length;   // Get the length of the height array
        int res = 0, l = 0, r = n - 1;   // Initialize variables
        int lMax = height[l], rMax = height[r];   // Initialize left and right max heights

        // Loop until the left pointer is less than the right pointer
        while (l < r) {
            // Compare the maximum heights from the left and right side
            if (lMax < rMax) {
                // Move the left pointer to the right
                l++;
                // Update the left max height
                lMax = Math.max(lMax, height[l]);
                // Calculate the water trapped at the current position
                res += lMax - height[l];
            } else {
                // Move the right pointer to the left
                r--;
                // Update the right max height
                rMax = Math.max(rMax, height[r]);
                // Calculate the water trapped at the current position
                res += rMax - height[r];
            }
        }

        // Return the total water trapped
        return res;
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 3, 2, 5};   // Example input array representing building heights
        System.out.println(trap(height));    // Output the result
    }
}



