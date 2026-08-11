// public class sorted {
//     public static boolean isSorted(int arr[], int i) {
//         //baseCase
//         if(i == arr.length-1) {
//             return true;
//         }
//         if(arr[i] > arr[i+1]) {
//             return false;
//         }
//         return isSorted(arr, i+1);
//     }
//     public static void main(String args[]) {
//         int arr[] = {2, 3, 4, 5, 6};
//         System.out.println(isSorted(arr,0));
//     }
    
// }


// public class sorted {
//     public static boolean isSorted(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i - 1] > arr[i]) {
//                 return false; // If any element is greater than the previous one, array is not sorted
//             }
//         }
//         return true; // Array is sorted if loop completes without returning false
//     }

//     public static void main(String args[]) {
//         int arr[] = {2, 3, 4, 5};
//         System.out.println(isSorted(arr));
//     }
// }

public class sorted {
    public static boolean printSorted(int arr[], int i) {
        //base case
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return printSorted(arr, i+1);
    }
    public static void main(String args[]) {
        int arr[] = {5, 6, 7, 3, 9};
        System.out.println(printSorted(arr, 0));
    }
}
