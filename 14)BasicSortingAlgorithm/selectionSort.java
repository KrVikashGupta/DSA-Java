//import java.util.*;
/* 
public class selectionSort {
    public static void findSelectionSort(int numbers[]) {
        
         // for outer loop
         for(int i=0; i<numbers.length-1;i++) {
            int minPos = i;
            for(int j=i+1; j<numbers.length;j++)  {    //for inner loop
                if(numbers[minPos] > numbers[j]) {
                    minPos = j; // update ho jahaega
                } 
            }
            // swap krna hai loop kae andar(but in bubble sort main  swap loop kae bahar hua tha)
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
        }
    }
    public static void printArray(int numbers[]) {
        System.out.print("Sorted Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Add a new line after printing the array
    }
    public static void main(String args[]) {
        int numbers[] = { 4, 8, 9, 5, 7, 1, 1, 4, 7};
        findSelectionSort(numbers);
        printArray(numbers);
    }
}*/

/*import java.util.*;

public class selectionSort {
    public static void selectionSorting(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap inner loop kae bahar karna hai
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        //print the sorted array element without array brackets and commmas
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {9, 8, 3, 9, 5, 3, 3, 2,1, 0, 0,2};
        selectionSorting(arr);
        
        
    }
}*/

/*import java.util.*;

public class selectionSort {
    public static void selectionSorting(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length;j++) {
                if(arr[minPos] > arr[j]) {
                minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp; 


        }
        //for print array
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {9, 8, 5, 3, 2, 8, 9, 2, 0, 0, 2};
        selectionSorting(arr);
    }
}*/
// import java.util.*;
// public class selectionSort {
//     public static void selectionSorting(int arr[]) {
//         for(int i=0; i<arr.length-1; i++) {
//             int minPos=i;
//             for(int j=i+1; j<arr.length; j++) {
//                 if(arr[minPos] > arr[j]) {
//                     minPos = j;
//                 }
//             }
//             //innerloop kai bahar karna hai swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;

//         }
//         // print the array
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = { 2, 9, 8, 9, 3, 2, 8, 4, 6, 5};
//         selectionSorting(arr);
//     }
// }


public class selectionSort {
    public static void selection_Sort(int arr[]) {
        
        for(int i=0; i<arr.length-1; i++) {
            int min_Pos = i; //current position
            for(int j=i+1; j<arr.length; j++) {
                if(arr[min_Pos] < arr[j]) {
                    min_Pos = j;

                }
            }
            //outerloop mai swap karna hai
            int temp = arr[min_Pos];
            arr[min_Pos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void print_Array(int arr[]) {
        for(int k=0; k<arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,5,6,8,3,2,2,9,9,4,3,};
        selection_Sort(arr);
        print_Array(arr);
    }
}
    

