/*WAP to print that Inverted and rotated half-pyramid.
   * 
  **
 ***
****
 print this pattern */
 public class pattern2 {
    public static void Inverted_rotated_half_pyramid(int n) {
        for(int i=1; i<=n; i++) {  //outer 
            for(int j=1; j<=n-1; j++) {  //spaces
                System.out.print(" ");
            } 
            for(int j=1; j<=i; j++) { //star
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Inverted_rotated_half_pyramid(10);
    }
}
