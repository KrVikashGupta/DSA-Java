/* WAP to print that Number Pyramid. 

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5 
print this pattern*/

public class pyramid {
    public static void number_pyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {  //Spaces
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        number_pyramid(5);
    } 
}
/* 
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 

        1 
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
*/
