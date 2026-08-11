/*WAP to print that FIOYO'S Triangle 
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14
print this pattern */
// public class pattern4 {
//     public static void Fioyos_Trinagle(int n) {
//         int counter = 1;  //outer
//         for(int i=1; i<=n; i++) { // inner- how many times will counter be printed 
//             for(int j=1; j<=i; j++) {
//                 System.out.print(counter+ " ");
//                 counter++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         Fioyos_Trinagle(14); 
//     }
// }     
/* 
1                                                             1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 31 32 33 34 35 36
37 38 39 40 41 42 43 44 45
46 47 48 49 50 51 52 53 54 55
56 57 58 59 60 61 62 63 64 65 66
67 68 69 70 71 72 73 74 75 76 77 78
79 80 81 82 83 84 85 86 87 88 89 90 91
92 93 94 95 96 97 98 99 100 101 102 103 104 1051 
  */


import java.util.*; 
public class pattern4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
