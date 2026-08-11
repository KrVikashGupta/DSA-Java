public class unary {
    public static void main(String args[]) {
        int a = 10;
        int b = ++a;  // output is 11 11 first (+1)change then use
        //int b = a++;    // output is 11 10  first +1use then change
        //int b = --a;     // output is 9 9 beacuse first (-1)change then use
        //int b = a--;       // output is 9 10  
        System.out.println(a);
        System.out.println(b);
    }

}



