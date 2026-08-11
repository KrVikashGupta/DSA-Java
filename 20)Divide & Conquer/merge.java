public class merge {
    public static void printArr(int arr[]) {  // print arr naam ka function banaya hai single loop lagay hai aur element ko print karaya hai
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // function for merge sort(recursive function)
    public static void mergeSort(int arr[], int si, int ei) {
        if(si >= ei) { // base case
            return;
        }
        //kaam mid niklaengae pata chalega ki left / right kya hai
        int mid = si + (ei - si)/2; //(or (si+ei)/2)
        mergeSort(arr, si, mid); //(arr, si, ei) for left part see theory part
        mergeSort(arr, mid+1, ei);//(arr, si, ei) for right part
        merge(arr, si, mid, ei); // merge karnae kai lia ek function use kar rahai hai 

s
    }
    public static void merge(int arr[], int si, int mid, int ei) {
       // left(0,3)=4element right(4,6) =3 element -> 6-0+1=7(array kae jo index hotae hai wo 0 based hotae hai that why we are use +1)
        int temp[] =  new int[ei-si+1]; // temp.arr merge karnae kae lia
        int i = si; // iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; // iterator for temp arr

        while(i <= mid && j <= ei) {  //loop
            if(arr[i] < arr[j]) { // compare
                temp[k] = arr[i];
                i++;
            }  
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
           //left part
        while(i <= mid) {
            temp[k++] = arr[i++];

        }
        //right part
        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k=0, i=si; k<temp.length;  k++, i++) {
            arr[i] = temp[k];
        }


    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};// arr ko define kia hai
        mergeSort(arr, 0, arr.length-1); //(arr, si, ei);
        printArr(arr);
    }
}
