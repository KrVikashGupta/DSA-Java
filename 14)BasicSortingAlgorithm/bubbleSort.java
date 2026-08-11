//import java.util.*;

/*public class bubbleSort {
    public static void findBubbleSort(int numbers[]) {

        //outer loop
        for(int turn=0; turn<numbers.length-1;turn++) {
            for(int j=0; j<numbers.length-1-turn;j++) { // for inner loop
                if(numbers[j] > numbers[j+1]) {

                    //swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }

            }
        }
    }
    //print number(arry ko ) loop kae bahar print karna hai 
    public static void printNumbers(int numbers[]) {
        for(int i=0; i<numbers.length;i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int numbers[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        findBubbleSort(numbers);
        printNumbers(numbers);

    }
}*/

/*import java.util.*;

public class bubbleSort {
    public static void bubbleSorting(int arr[]) {
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printarr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {5, 8, 9, 3, 7, 9};
        bubbleSorting(arr);
        printarr(arr);
    }
}*/
/*
import java.util.*;

public class bubbleSort {
    public static void bubbleSorting(int arr[]) {
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
    }
    public static void printarr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]) {
        int arr[] = { 9, 3, 5, 4, 1, 0, 8, 2, 9};
        bubbleSorting(arr);
        printarr(arr);
    }
 }*/
 /* 
import java.util.Arrays;

class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String arg[]) {
        int nums[] = {9,8,3,0,1, 2, 6, 8, 6, 9, 0};
    }
}*/

/* 
import java.util.*;

public class bubbleSort {
    public static void bubbleSorting(int arr[]) {
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
    
    }
    public static void printarr(int arr[]) {
        for(int i=<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {4, 6, 8, 9, 8, 6 , 5 , 3 , 2 ,0, 8,};
        bubbleSorting(arr);
        printarr( arr);
    }
}
*/
/*import java.util.*;

public class bubbleSort {
    public static void bubbleSorting(int arr[]) {
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
    }
    //for print the array
    public static void printarr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
    }
    public static void main(String args[]) {
        int arr[] = {9, 3, 4, 9, 8, 8, 4, 3, 2, 1, 0, 0, 0};
        bubbleSorting(arr);
        printarr(arr);
    }
}*/

// import java.util.*;

// public class bubbleSort {
//     public static void bubbleSorting(int arr[]) {
//         for(int turn=0; turn<arr.length-1; turn++) {
//             for(int j=0; j<arr.length-1-turn; j++) {
//                 if(arr[j] > arr[j+1]) {
//                     // then swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         System.out.println();
//     }
//     public static void printarr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//     }
//     public static void main(String args[]) {
//         int arr[] = { 2, 9, 0, 4, 9, 3, 2};
//         bubbleSorting(arr);
//         printarr(arr);
//     }
// }

public class bubbleSort {
    public static void print_Bubble(int arr[]) {
        for(int i=0; i<arr.length - 1; i++) {
            for(int j=0; j<arr.length - 1 - i; j++) {
                if(arr[j] < arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                
                }
            }
        }
    }
    public static void print_Arr(int arr[]) {
        for(int k=0; k<arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {5,4,1,3,2};
        print_Bubble(arr);
        print_Arr(arr);
    }
}



