/*Question :
Use the following sorting algorithms to sort an array in DESCENDING order :
a.Bubble Sort
b.Selection Sort
c.Insertion Sort
d.Counting Sort
You can use this array as an example :[3, 6, 2, 1, 8, 7, 4, 5, 3, 1]; */


public class Sol1Bubb {

    public static void bubbleSort(int numbers[]) {
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length-1-i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(numbers);

        // Print the sorted array
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

