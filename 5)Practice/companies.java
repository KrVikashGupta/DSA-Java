/*Problem Statement
Write a function that takes two integers as input, representing the start and end numbers,
and prints the numbers in the specified range without using any loop.
Input format :
The input consists of two integers representing the start and end numbers, separated by
newline.
Output format :
The program outputs the numbers within the specified range, separated by a space.
Refer to the sample output for the formatting specifications.
Code constraints :
In this scenario, the given test cases will fall under the following constraints:
Is start number send numbers100. */


import java.util.Scanner;

public class companies{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();

        // Output
        printNumbersInRange(startNumber, endNumber);
    }

    public static void printNumbersInRange(int start, int end) {
        if (start <= end) {
            System.out.print(start + " ");
            printNumbersInRange(start + 1, end);
        }
    }
}
