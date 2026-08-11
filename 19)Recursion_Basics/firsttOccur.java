// public class firsttOccur {
//     public static int firstOccur(int arr[], int key, int i) {
//      // Base case: If the end of the array is reached

//         if(i == arr.length) {
//             return -1;  // Key not found
//         }
//         if(arr[i] == key) {         // If the current element equals the key, return the current index
//             return i;
//         }
//         return firstOccur(arr, key, i+1);         // Recursive call to search in the rest of the array
//     }
//     public static void main(String args[]) {
//         int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         System.out.println(firstOccur(arr,3,0));
//     }
// }

// public class firsttOccur {
//     public static int printFO(int arr[], int key, int i) {
//         if(i == arr.length-1) {
//             return i;      
//         }
//         if(arr[i] == key) {
//             return i;
//         }
//         return printFO(arr, key, i+1);

//     }
//     public static void main(String[] args) {
//         int arr[] = {4, 8, 9, 5, 4, 3, 4, 5, 4, 1};
//         System.out.println(printFO(arr, 4, 0));

//     }
// }

public class firsttOccur {
    public static int printFO(int arr[], int key, int i) {
        //basecase
        if(i == arr.length-1) {
            return i;
        }

        if(arr[i] == key) {
            return i;
        }
        return printFO(arr, key, i+1);
    }

public static void main(String[] args) {
    int arr[] = {3, 4, 5, 6, 7, 8, 9, 0, 9, 8, 7, 6, 5};
    System.out.println(printFO(arr, 5, 0));
}
}