/*Question :
Use the following sorting algorithms to sort an array in DESCENDING order :
a.Bubble Sort
b.Selection Sort
c.Insertion Sort

d.Counting Sort
You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]; */
public class sol4CoutingSort {
    public static void CountingSorting(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++) {
            largest = Math.max(largest,numbers[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<numbers.length; i++) {
            count[numbers[i]]++;
        }

        int j=0;
        for(int i=count.length-1; i>=0; i--) {
            while(count[i] > 0) {
                numbers[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2, 3, 4, 5, 6, 7, 8, 9};
        CountingSorting(numbers);
        
        
        //print the sorted array
        for(int number:numbers) {
            System.out.print(number + " ");
        }
    }
}
    

