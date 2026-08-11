/* WAP to print that hollow rhombus.

        * * * * *
      *       *   
    *       *
  *       *
* * * * * 
print this patttern */
public class pattern8 { 
    public static void hollow_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {  // spaces
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                if(i==1 || i==n || j==1 || j==n) {   //hollow rectangle - star
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        hollow_rhombus(10);
    }
    
}
/*
     ***** //5
   *   *
  *   *
 *   *
*****

         **********  //10
        *        *
       *        *
      *        *
     *        *
    *        *
   *        *
  *        *
 *        *
**********
 */