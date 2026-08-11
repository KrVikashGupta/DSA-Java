/*WAP to print that butterfly
*             *  
* *         * * 
* * *     * * *
* * * * * * * *
* * * * * * * * 
* * *     * * *
* *         * *
*             *
print this pattern*/
import java.util.*;
public class pattern6 {
    public static void butterfly(int n) {
        for(int i=1; i<=n; i++){
            //star
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }// 2nd half
        for(int i=n; i>=1; i--) {  // then just copt 1 st half one code
            //star
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[]) {
        butterfly(10);
    }
}
/* 

*      *  //4
**    **
***  ***
********
********
***  ***
**    **
*      *

*                  *  //10
**                **
***              ***
****            ****
*****          *****
******        ******
*******      *******
********    ********
*********  *********
********************
********************
*********  *********
********    ********
*******      *******
******        ******
*****          *****
****            ****
***              ***
**                **
*                  *

*/







/*import java.util.*;
public class pattern6 {
    public static void main(String args[]) {
        System.out.println("*      *");
        System.out.println("**    **");
        System.out.println("***  ***");
        System.out.println("********");
        System.out.println("***  ***");
        System.out.println("**    **");
        System.out.println("*      *");
    }
}   
        */
