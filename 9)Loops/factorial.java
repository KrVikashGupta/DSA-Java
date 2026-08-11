// import java.util.*;
// public class factorial {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();
        
//         int fact=1;  //int fact = 1;: Initializes a variable fact to 1, which will hold the factorial result.
//         for(int i=1; i<=n; i++) {
//             fact = fact*i;
//         }
//         System.out.println(fact);

//     }
    
// }


import java.util.*;
public class factorial {
    public static void main(String args[]) {
        int n = 3;
        int fact = 1;

        for(int i=1; i<=n; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}