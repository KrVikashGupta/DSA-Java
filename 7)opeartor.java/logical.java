//logical operator 
/*
Java Logical Operators with Examples
Last Updated : 10 Jun, 2024
Logical operators are used to perform logical “AND”, “OR” and “NOT” operations, i.e. the function similar to AND gate and OR gate in digital electronics.
*/ 
import java.util.*;

public class logical {
    public static void main(String args[]) {
        System.out.println( (3<4) && (4<5) );   //output is True
        System.out.println( (4<2) && (6<9) );     // output is false 
        System.out.println( ( 3>2) || (9>8) );   // output is true 
        System.out.println( (13<8) || (6<2) );   // output is false
        System.out.println( !(8>9) );     // output is true
        System.out.println( !(9>5) );    //output is false
    }
}
