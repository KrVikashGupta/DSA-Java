//import java.util.*;
// Step-1 : calculate left max boundary - in the form of array
// Step-2 : calculate right max boundary - in the form of array
// Step-3 : loop
// Step-4 : waterLevel = min(leftmax bound, rightmax bound)
// Step-5 : trapped water = waterLevel - height(BarLevel)

// public class trappedRainwater {   //  Time complexity : o(n)
//     public static int trappedRain(int height[]) {
//         int n = height.length;
//         //calculate left max boundary - in the form of array
//         int leftMax[] = new int[n];   //create an array
//         leftMax[0] = height[0];  //1st bar kae lia

//         for(int i=1; i<n; i++) {    // baaki sab kae lia loop laganaa hai
//             leftMax[i] = Math.max(height[i],leftMax[i-1]); // height[i] = current value, aur uskae pahalae wala  sab
//         }

//         //calculate right max boundary - in the form of array
//         int rightMax[] = new int [n];
//         rightMax[n-1] = height[n-1]; //    right side sae first wala calculate karna hai islia n-1

//         for(int i=n-2; i>=0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);// curr.value, right side uskae aagae wala
//         }
        
//         int trappedwater = 0;
//         //loop
//         for(int i=0; i<n; i++) {
//             //waterLevel = min(leftmax bound, rightmax bound)
//             int waterLevel = Math.min(rightMax[i],leftMax[i]);
  
//             //trapped water = waterLevel - height(BarLevel)
//             trappedwater += waterLevel - height[i];
//         }
//         return trappedwater;
//     }
//     public static void main(String args[]) {
//         int height [] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//         System.out.println(trappedRain(height));
//     }
    
// }




// class Solution {
//     public int maxWater(int arr[]) {
//         // code here
//         int n = arr.length;
//         int left[] = new int[n];
//         left[0]=arr[0];
//         int right[] = new int[n];
//         right[n-1]=arr[n-1];
//         for(int i=1;i<n;i++){
//             left[i] = Math.max(arr[i],left[i-1]);
//             right[n-i-1] = Math.max(arr[n-i-1],right[n-i]);
//         }
//         int ans = 0;
//         for(int i=0;i<n;i++){
//             ans = ans + Math.min(left[i],right[i]) - arr[i];
//         }
//         return ans;
//     }
// }


//step1 : calculate leftmax boundary
//step2 : calculate rightmax boundary
//step 3 : loop
//step4 : waterlevel = min(leftmax, rightmax)
//step 5: trappedwater = waterlevel - height; 

public class trappedRainwater {
    public static int total_trappedWater(int height[]) {
        int n = height.length;
        //step 1
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //step2
        int rightMax[] = new int[n];
        rightMax[n-1] =height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater = 0;
        //step3
        for(int i=0; i<n; i++) {
            //step4
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //step5
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]) {
        int height[] = {1, 2, 3, 4};
        System.out.println("Total RainWater Trapped is : " +total_trappedWater(height));
    }
}

