//Question1 : What will be the output of the following program.
public class solution1 {
    public static void main(String args[]) {
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.println(exp1 + " , ");
        System.out.println(exp2);        //output is 5 , 4
    }
}
