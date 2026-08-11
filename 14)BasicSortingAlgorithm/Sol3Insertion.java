/*Question :
Use the following sorting algorithms to sort an array in DESCENDING order :
a.Bubble Sort
b.Selection Sort
c.Insertion Sort
d.Counting Sort
You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]; */
public class Sol3Insertion {
    public static void InsertionSorting(int numbers[]) {
        for(int i=1; i<numbers.length;i++) {
            int curr = numbers[i];
            int prev = i-1;

            
            //to find the index where curr is to be inserted
            while(prev >= 0 && numbers[prev] < curr) {
                numbers[prev+1] = numbers[prev];
                prev--;
            }
            numbers[prev+1] = curr;
        }

    }
    public static void main(String args[]) {
        int numbers[] = {3,6,2,1,8,7,4,5,3,1};
        InsertionSorting(numbers);

        // print the sorted array
        for(int number:numbers) {
            System.out.print(number+ " ");
        }
    }
}
