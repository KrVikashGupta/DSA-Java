//import java.util.*;

public class Large {
    public static int largest_number(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {45, 78, 65, 45, 34, 90, 25,98, 67};
        System.out.println("Largest Number is : " + largest_number(numbers));
    }
    
}
