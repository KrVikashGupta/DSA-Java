import java.util.*;

public class promotion {
    public static void main(String args[]) {
        //char a = 'a';
        //char b = 'b';  
        //System.out.println((int) (b));
        //System.out.println((int) (a));    // output is 98 , 97 , 98-97=1
        //System.out.println(b-a); // we can not write that System.out.println(a);then output is only a 
    

        byte b = 5 ;
       // byte a = b * 2;  /// logically not error but complier error  int is not convert byte
        byte a = (byte) (b * 2);
        System.out.println(a);   // output is 10  
        
    }
}
