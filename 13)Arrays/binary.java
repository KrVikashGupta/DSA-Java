//WAP to print that find a binary search of 2 4 6 8 10 12 14 key is 10
/*import java.util.*;

public class binary {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1;
        while(start <= end) {
            int mid = (start + end) / 2;

            // comparision
            if(numbers[mid] == key) {  // found
                return mid;
            }
            if(numbers[mid] < key) {  // right 
                start = mid + 1;
            }
            else {  //left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {4,5,6,7,0,1,2};
        int key = 6;
       
        System.out.println("Index for Key is : " + binarySearch(numbers, key));
    }
    
}*/

/* 
import java.util.*;

public class binary {
    public static int binarySearch(int number[], int key) {
        int start = 0; int end = number.length-1;
        while(start <= end) {

            int mid = (start + end) /2;

            if(number[mid] == key) {
                return mid;
            }
            if(number[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1; // Return -1 if the key is not found in the array
    }
    public static void main(String args[]) {
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 18;

        System.out.println("Index for Key is : " + binarySearch(number,key));
    }

}
*/


/* 
public class binary {
    public static int binary_Search(int numbers[], int keys) {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end) {
            int mid = (start + end) /2;

            if(numbers[mid] == keys) {  //Found
                return mid;
            }
            if(numbers[mid] < keys) {   // right
                start = mid+1;
            }
            else {
                end = mid-1;   //left
            }
        }
        return -1; //if  not find in this array of any index then output is -1
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 8, 10, 12, 14, 16, 18, 20};
        int keys = 16;

        System.out.println("Index for array: " +binary_Search(numbers,keys));
    }
}
*/
/* 
//import java.util.*;

public class binary {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1;
        while(start <= end) {
            int mid = (start + end) / 2;
            // comparision
            if(numbers[mid] == key) {  // found
                return mid;
            }
            if(numbers[mid] < key) {  // right 
                start = mid + 1;
            }
            else {  //left
                end = mid - 1;
            }
        }  
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 6;
        System.out.println("Index for Key is : " + binarySearch(numbers, key));
    }
    
}
*/
/* 
import java.util.*;

public class binary {
    public static int binary_search(int numbers[], int key) {
        int start = 0, end = numbers.length-1;
        while(start < end) {
            int mid = (start + end) / 2;
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;

    }
    
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 14;
        System.out.println("Index at the key : " + binary_search(numbers,key));
    }

}*/

// import java.util.*;

// public class binary {
//     public static int binarySearch(int numbers[], int key) {
//         int start = 0, end = numbers.length-1;
//         while(start <= end) {
//             int mid = (start + end)/2;
//             //swap
//             if(numbers[mid] == key) {
//                 return mid;
//             }
//             if(numbers[mid] < key) {
//                 start = mid + 1;
//             }
//             else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
//         int key = 16;
//         System.out.println("Index at the key : " + binarySearch(numbers,key));
//     }
// }


// public class binary {
//     public static int find_Binary(int nums[], int key) {
//        int start = 0, end = nums.length-1;
//        while(start <= end) {
//         int mid = (start + end )/2;
//         //comparision
//         if(nums[mid] == key) {
//             return mid;
//         }
//         if(nums[mid]<key) {
//             start = mid + 1;
//         }
//         else {
//             end = mid-1;
//         }
//     }
//        return -1;
//     }
//     public static void main(String args[]) {
//         int nums[] = { 2, 45, 67, 67, 98, 986, 2344, 23422};
//         int key = 671;
//         System.out.println("Index at the key : " + find_Binary(nums, key));
//     }
// }

//import java.util.Arrays;

// public class binary {
//     public static int print_binary(int nums[], int key) {
//         int start = 0, end= nums.length-1;

//         while(start <= end) {
//             int mid = (start+end)/2;

//             if(nums[mid] == key) {
//                 return mid;
//             }
//             if(nums[mid] < key) {
//                 start = mid+1;
//             }
//             else {
//                 end = mid-1;
//             }
//         }
//         return -1;
        
//     }
//     public static void main(String args[]) {
//         int nums [] = {23,43,53,35,5,46,47,67,89,890};
//         //Arrays.sort(nums);  if array is not sorted then we have  write this 
//         int key = 89;
//         System.out.println("Index at the Key : " + print_binary(nums,key));
        
//     }
// }


public class binary {
    public static int getbinary(int nums[], int keys) {

        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = (start + end)/2;

            //compare
            if(nums[mid] == keys) {
                return mid;
            }
            if(nums[mid] < keys) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }

        }
        return -1;
    }
    public static void main(String args[]) {
        int nums[] = { 2, 4, 6, 8, 9, 10, 18};
        int keys = 10;
        System.out.println("Index at the key : " + getbinary(nums, keys));
    }
}