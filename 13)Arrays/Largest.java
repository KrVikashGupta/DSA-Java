/*Largest numbers
find the largest number in a given array.*/
/* 
import java.util.*;
//Largest number in array
//Smallest number in array
public class Largest {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        
        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if(Smallest > numbers[i]) {
                Smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " + Smallest);
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {1, 2, 6, 3, 20};
        System.out.println("Largest value is : " + getLargest(numbers));
    }
}       // Smallest value is : 1
        // Largest value is : 20
*/


/* 
import java.util.*;
// largest number
public class Largest {
    public static int Largest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // - INFINITY TO COMPARE NUMBERS 
        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {1, 4, 8, 9, 45, 89, 200, 89};
        System.out.println("Largest value is : " + Largest(numbers) + " is largest ");
    }
}
*/


/* 
// smallest numbers
public class Largest {
    public static int smallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(smallest > numbers[i]) {
            smallest = numbers[i];
        }
    }
    return smallest;
}
    public static void main(String args[]) {
        int numbers[] = { 2, 58, 90, 45, 345, 3, 98, 1};

        System.out.println("Smallest Value is : " + smallest(numbers)+ " is smallest");
    }
}*/


// import java.util.*;
// // largest number
// public class Largest {
//     public static int get_Largest(int numbers[]) {
//         int largest =  Integer.MIN_VALUE;  //for -infinity
//         for(int i=0;i<numbers.length;i++) {
//             if(largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//         }
//         return largest;

//     }
//     public static void main(String args[]) {
//     int numbers[] = { 10, 20, 30, 40, 50, 60, 70, 80};

//     System.out.println("Largest Value is : " + get_Largest(numbers));
//     }

// }

 /*
import java.util.*;
public class Largest {
    public static int LargestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {45, 76, 23, 09, 67, 34,  89};
        System.out.println("Largest number is : " + LargestNumber(numbers));
    }
}
*/

// public class Largest {
//     public static int find_Largest(int nums[]) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<nums.length; i++) {
//             if(largest < nums[i]) {
//                 largest = nums[i];
//             }
//             if(smallest > nums[i]) {
//                 smallest = nums[i];
//             }
            
//         }
//         System.out.println("Smallest Number : " + smallest);
//         return largest;
        
//     }
//     public static void main(String args[]) {
//         int nums[] = {33, 78, 90,12, 455, 23, 12};
//         System.out.println("Largest Number : " + find_Largest(nums));
//     }
// }


// public class Largest {
//     public static int find_Largest(int nums[]) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<nums.length; i++) {
//             if(largest < nums[i]) {
//             largest = nums[i];
//             }
//             if(smallest > nums[i]) {
//                 smallest = nums[i];
//             }
//         }
//         System.out.println("Smallest Number: " + smallest);
//         return largest;
//     }
//     public static void main(String args[]) {
//         int nums[] = {3,4,5,78,54,3,987,34,56};
//         System.out.println("Largest Number: " + find_Largest(nums));
//     }
// }

// public class Largest {
//     public static int print_Largest(int nums[]) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0; i<nums.length;i++) {
//             if(largest < nums[i]) {
//                 largest = nums[i];
//             }
//             if(smallest > nums[i]) {
//                 smallest = nums[i];
//             }
//         }
//         System.out.println("Smallest Number is: " + smallest);
//         return largest;
        
//     }
//     public static void main(String args[]) {
//         int nums[] = {2, 3, 54, 98, 343, 78, 23, 454, 3443, 223};
//         System.out.println("Largest Number is: " + print_Largest(nums));
//     }
// }

// public class Largest {
//     public static int print_Largest(int nums[]) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<nums.length; i++) {
//             if(largest < nums[i]) {
//                 largest = nums[i];
//             }
//             if(smallest > nums[i]) {
//                 smallest = nums[i];
//             }
//         }
//         System.out.println("Smallest Number : "+smallest);
//         return largest;
//     }
//     public static void main(String args[]) {
//         int nums[] = {12, 34, 42, 32, 98, 67, 343, 23, 12};
//         System.out.println("Largest Number: " + print_Largest(nums));
//     }
// }

// public class Largest {
//     public static int getLargest(int nums[]) {

//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i = 0; i<nums.length; i++) {
//             if(largest < nums[i]) {
//                 largest = nums[i];
//             }
//             if(smallest > nums[i]) {
//                 smallest = nums[i];
//             }
//         }
        
//         System.out.println("Smallest Nums: " + smallest);
//         return largest;

//     }
//     public static void main(String args[]) {
//         int nums[] = {45, 78, 90, 3, 34, 22};
//         System.out.println("Largest Nums : " + getLargest(nums));
//     }
// }


public class Largest {
    public static int getLargest(int nums[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(largest < nums[i]) {
                largest = nums[i];
            }
            if(smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        System.out.println("Smallest Number is : "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int nums[] = { 2, 4, 5,98, 56,49};
        System.out.println("Largest number is : " + getLargest(nums));
    }
}