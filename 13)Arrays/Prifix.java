//WAP to print that maxmumum subarray by  prefix sum method
// public class Prefix {
//     public static void prefix(int numbers[]) {
//         int cs = 0;
//         int ms = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0]; 

//         //calculate prefix array
//         for(int i=1; i<numbers.length; i++) {
//             prefix[i] = prefix[i-1] + numbers[i];
//         }
//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j = i; j<numbers.length; j++) {
//                 int end = j;

//                 cs = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

//                 if(ms < cs) {
//                     ms = cs;
//                 }
//             }
//         }
//         System.out.println("Max Subarray : " + ms);


//     }
//     public static void main(String args[]) {
//         int numbers[] ={1, -2, 6, -1, 3};
//         prefix(numbers);
//     }
// }

public class  Prifix {
    public static void print_Prifix(int nums[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            int start = i;
            for(int j=i; j<nums.length; j++) {
                int end = j;
                cs = start == 0 ? prefix[end] : prefix[end] -prefix[start-1];
                if(ms < cs) {
                    ms = cs;
                }
            }
        }
        System.out.println("maxSum :"+ ms);

    }
    public static void main(String args[]) {
        int nums[] = {1, -2, 6, -1, 3};
        print_Prifix(nums);
    }
}



