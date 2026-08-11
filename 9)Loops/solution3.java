//WAP to find the factorial of any num entered by the user .

/*import java.util.*;

public class solution3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number: " );
        int n = sc.nextInt();
        int num;
        int fact = 1;  // Initialize fact to 1
        

        for(int i=1; i<=n; i++) {
            fact *= i; //factorial = factorial * i
        }
        System.out.println("Factorial is: " + fact);
    }
}*/

//import java.util.*;
public class solution3 {
    public static void main(String args[]) {
        int n=2;
        int f = 1;

        for(int i=1; i<=n; i++) {
            f *= i;
        }
        System.out.println("Factorial is : " + f);
    }
}

