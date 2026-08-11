/*Linear Search - to find the index of element in a given array.
2 4 6 8 10 12 14 16  and key is 10(we have to search 10)*/
/*import java.util.*;
//Linear Search
public class Linear {
    public static int LinearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }

        }
        return-1;//nahi to means else
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 14;
        
        int index = LinearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        }
        else {
            System.out.println("Key is at Index: " + index);
        }
             
    } //input is 10 then output is Key is at Index: 4
     // input is 20 then output is Not Found
}
*/

/* 

public class Linear {
    public static int LinearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i; // Return the index where the key was found
            }
        }
        return-1 ;  // Return -1 if the key is not found in the array
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = LinearSearch(numbers,key);
        if(index == -1) {
            System.out.println("Not found in this Array");
        }
        else {
            System.out.println("Key is at Index : " + index + " Index ");
        }
    }
}
*/

// import java.util.*;

// public class Linear {
//     public static int Linear_Search(int numbers[], int key) {
//         for(int i=0; i<numbers.length; i++) {
//             if(numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1; // index is not in this array
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 8, 10, 12, 14, 16, 18, 20};
//         int key = 18;

//         int index = Linear_Search(numbers,key);
//         if(index == -1) {
//             System.out.println("Array not found");
//         }
//         else {
//             System.out.println("Index at the key: " + index);
//         }
//     }
// }


// public class Linear {
//     public static int find_Linear(int num[], int key) {
//         for(int i=0;i<num.length;i++) {
//             if(num[i] == key) {
//                 return i;
//             }
//         }
//         return -1;// if not in the array
//     }
//     public static void main(String args[]) {
//         int num[] = {3,6,7,8,90,34,6};
//         int key = 30;
//         int Linear = find_Linear(num,key);
//         if(Linear == -1) {
//             System.out.println("Not Found in the Array.");
//         }
//         else {
//             System.out.println("Index at the : " + Linear);
//         }

//     }
// }


// public class Linear {
//     public static int print_Linear(int nums[], int key) {

//         for(int i=0; i<nums.length; i++) {
//             if(nums[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int nums[] = {2, 5, 8, 4, 9, 3, 6, 8};
//         int key = 4;
//         int linear = print_Linear(nums, key);
//         if(linear == -1) {
//             System.out.println("Not Found");
//         }
//         else {
//             System.out.println("Index at the Key :" + linear);
//         }
//     }
// }


// public class Linear {
//     public static int Linear_Search(int nums[], int key) {
//         for(int i=0; i<nums.length; i++) {
//             if(nums[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
        
//     }
//     public static void main(String args[]) {
//         int nums[] = {4,5,9,3,33,90,23,234,90};
//         int key = 99;

//         int Linear = Linear_Search(nums, key);
//         if(Linear == -1) {
//             System.out.println("Not Found");
//         }
//         else {
//             System.out.println("Index of the Array : " + Linear);
//         }
//     }
// }

public class Linear {
    public static int getLinear(int nums[], int keys) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == keys) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int nums[] = {4,6 ,8, 9, 89, 7, 1, 8};
        int keys = 1;

        int index = getLinear(nums, keys);
        if(index == -1) {
            System.out.println("Not Found");
        }
        else {
            System.out.println("Index at the Keys : " + index);
        }
        
        
    }
}