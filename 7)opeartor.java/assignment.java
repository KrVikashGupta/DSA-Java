/*
 Assignment Operators
These operators are used to assign values to a variable. 
The left side operand of the assignment operator is a variable, 
and the right side operand of the assignment operator is a value. 
The value on the right side must be of the same data type of the operand on the left side. 
 */

import java.util.*;

public class assignment {
    public static void main(String args[]) {
        int A = 10;
        A = A + 10;
        A += 10;  //its run very fast output is 20
        A = A - 10;
        A -= 10;    // output is 0
        A = A * 10;
        A *= 10;      // output is 1000
        A = A / 10;
        A /= 10;      // OUTPUT IS 1
        A = A % 10;
        A %= 10;      // OUTPUT IS 0    
        System.out.println(A);
    }
}
