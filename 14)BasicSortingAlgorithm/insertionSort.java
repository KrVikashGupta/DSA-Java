/*import java.util.*;

public class insertionSort {
    public static void insertionSorting(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            // to finding out the correct postion to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // then see how to insert 
            arr[prev+1] = curr;
        }
    }
    // print the array
    public static void printarr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {8, 9, 0, 6, 7, 3, 2, 4, 4, 4 ,9};
        insertionSorting(arr);
        printarr(arr);
    }
}*/

/*import java.util.*;

public class insertionSort {
    public static void insertionSorting(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            // to finding out the correct postion to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // then see how to insert 
            arr[prev+1] = curr;
        }
    }
    // print the array
    public static void printarr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        //insertionSorting(arr);
        //Arrays.sort(arr,0,3);   // using arrays.sort
        Arrays.sort(arr);  //sorting in ascending order but we want bigger no is first then we are using collection see another code 
        printarr(arr);
    }
}
*/
/*import java.util.*;
import java.util.Collection;

public class insertionSort {
    public static void insertionSorting(Integer arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            // to finding out the correct postion to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // then see how to insert 
            arr[prev+1] = curr;
        }
    }
    // print the array
    public static void printarr(Integer arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        Integer arr[] = {5, 4, 1, 3, 2};
        //insertionSorting(arr);
        Arrays.sort(arr,Collections.reverseOrder()); //we want reverse order we are we using collection and integer not int
        printarr(arr);  // output is 54321

    }
}*/
// import java.util.*;

// public class insertionSort {
//     public static void insertionSorting(Integer arr[]) {
//         for(int i=1; i<arr.length; i++) {
//             int curr = arr[i];
//             int prev = i-1;
//             // to finding out the correct postion to insert
//             while(prev >= 0 && arr[prev] > curr) {
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             // then see how to insert 
//             arr[prev+1] = curr;
//         }
//     }
//     // print the array
//     public static void printarr(Integer arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]) {
//         Integer arr[] = {2, 7, 1,5, 4, 1, 3, 2};
//         //insertionSorting(arr);
//         //Arrays.sort(arr,Collections.reverseOrder()); //we want reverse order we are we using collection and integer not int
//         Arrays.sort(arr,0, 3,Collections.reverseOrder()); // output is 7 2 1 5 4 1 3 2 
//         printarr(arr);  // output is 54321

//     }
// }

public class insertionSort {
    public static void print_Insertion(int arr[]) {
        int n = arr.length;
        for(int i=1; i<n;i++) {
            int curr = arr[i];
            int prev =i-1;
            //to find the correct position to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] =curr;
        }
    }
    public static void print_Arr(int arr[]) {
        for(int j=0; j<arr.length; j++) {
            System.out.print(j+" ");
        }
    
    }
    public static void main(String args[]) {
        int arr[] = {2,3,8,7,5,9,0,8,3,4,3,2,3,};
        print_Insertion(arr);
        print_Arr(arr);

    }
    
}