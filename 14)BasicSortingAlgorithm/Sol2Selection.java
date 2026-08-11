/*Question :
Use the following sorting algorithms to sort an array in DESCENDING order :
a.Bubble Sort
b.Selection Sort
c.Insertion Sort
d.Counting Sort
You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]; */


public class Sol2Selection {
    public static void SelectionSortDecending(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int minPos = i;

            for(int j=i+1; j<numbers.length; j++) {
                if(numbers[minPos]  < numbers[j]) {
                    minPos = j;   //update
                }
            }
            //swap
            int temp = numbers[minPos];
            numbers[minPos] =  numbers[i];
            numbers[i] = temp;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {3,6,2,1,8,7,4,5,3,1};
        SelectionSortDecending(numbers);
        
        //Print the sorted array
        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
/* 
public class Sol2Selection {
    public static void SelectionSortDecending(int numbers[]) {
        for (int turn = 0; turn < numbers.length; turn++) {
            int minPos = turn;

            for (int j = turn + 1; j < numbers.length; j++) {
                if (numbers[minPos] < numbers[j]) {
                    minPos = j;   //update
                }
            }
            //swap
            int temp = numbers[minPos];
            numbers[minPos] = numbers[turn];
            numbers[turn] = temp;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        SelectionSortDecending(numbers);

        // Print the sorted array
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
*/
