public class rotaed_sorted_array {
    public static int search(int arr[], int tar, int si, int ei) {// isko int type ka kyki index return krna hai
        //base case if( not found in the arry
        if(si > ei) {
            return -1;
        }
        //recursio kaam
        int mid = si + (ei-si)/2; // (si + ei)/2

        //case found
        if(arr[mid] == tar) {
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]) {
            //case a: left
            if(arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid-1);/// mid ka to ho gaya that wy mid -1

            }
            else {
                //case b : right
                return search(arr, tar, mid+1, ei);
            }
        }

        //mid on L2
        else {
            //case c : right
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            }
            else {
                // cased : left
                return search(arr, tar, si, mid-1);
            }
         }
    }
    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; // output ->4
        int targetIndex = search(arr, target, 0, arr.length);//(arr, target, si, ei)
        System.out.println(targetIndex); //output is 4
    }
}
