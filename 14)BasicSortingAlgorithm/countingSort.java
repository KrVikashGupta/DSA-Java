/*//import java.util.*;

public class countingSort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1]; // Fixed typo here
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) { // You need to define the printArr method
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArr(arr);
    }
}*/

// import java.util.*;

// public class countingSort {
//     public static void countingSorting(int arr[]) {
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++) {
//             largest = Math.max(largest, arr[i]);

//         }
//         int count[] = new int [largest + 1];
//         for(int i=0; i<arr.length; i++) {
//             count[arr[i]]++;
//         }

//         //sorting
//         int j = 0;
//         for(int i=0; i<count.length; i++) {
//             while(count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
                
//             }
//         }
//     }
//     public static void printarr(int arr[]) {
//         for(int i=0; i<arr.length;i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {4, 6, 8, 9, 10, 11};
//         countingSorting(arr);
//         printarr(arr);

//     }
// }


public class countingSort {
    public static void print_Counting(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        //sorting
        int j =0  ;
        for(int i=0; i<count.length;i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {2,5,1,4,3,5,9,9,8,8,0,1,2,3};
        print_Counting(arr);
        printArr(arr);

    }
}