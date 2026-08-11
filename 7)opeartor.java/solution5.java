//Quetion5:What is be the output of the following programs.
public class solution5 {
    public static void main(String[] args) {
        int x = 10, y = 5;
        int exp1 = (y * ( x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2); // output is 20,20
    }
}
