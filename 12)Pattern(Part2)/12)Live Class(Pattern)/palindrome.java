/*WAP to print that palindrome pattern with number.

        1
      2 1 2
    3 2 1 2 3 
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
print this pattern*/ 

public class palindrome {
    public static void palindrome_pattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=5-i; j++) {  //spaces
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {  //descending  j is not less than but it is greater.
                System.out.print(j);
            }
            for(int j=2; j<=i; j++) {  //ascending
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        palindrome_pattern(5);
    }
    
}
