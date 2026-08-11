/*
Java Relational Operators are a bunch of binary operators used to check for relations between two operands, 
including equality, greater than, less than, etc. 
They return a boolean result after the comparison and are extensively used in looping statements 
as well as conditional if-else statements and so on. 

*/

import java.util.*;
public class relational {
    public static void main(String args[]) {
        int a = 10;
        int b = 10;
        System.out.println(a == b);   // a = 10 b = 5 false, a=10 b = 10 true
        int c = 10;
        int d = 10;
        System.out.println(c != d);     // a = 10 b = 10 false,a=10 b = 5  true
        int e = 10;
        int f = 10;
        System.out.println(e > f);  // a = 10 , b = 5 true a = 5 b = 10   false
        int g = 10;
        int h = 10;
        System.out.println(g < h);     //a = 10 , b = 5  false a = 5 b = 10  true
        int i = 10;
        int j = 10;
        System.out.println(i >= j);      // a = 10 , b = 10 true 
        int k = 10;
        int l = 10;
        System.out.println(k <= l);       // a = 10 , b = 10 true
    }
}



