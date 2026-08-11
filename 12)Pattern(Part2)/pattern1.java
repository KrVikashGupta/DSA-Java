/*  WAP to print that hollow rectangle pattern.
*****
*   *
*   * 
*****
*/
public class pattern1 {
    public static void hollow_rectangle(int row, int col) {
        for(int i=1; i<=row; i++){   //outer loop
            for(int j=1; j<=col; j++) {    //inner loop
                if( i==1 || i==row || j==1|| j==col) {  //cell-(i,j)
                    System.out.print("*");        //boundary cell
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); //next line
        }
    }    
    public static void main(String args[]) {
        hollow_rectangle(5,5);
    }    
}