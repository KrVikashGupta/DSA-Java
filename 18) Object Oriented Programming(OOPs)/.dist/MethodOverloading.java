//import java.util.*;
//function overloading 
public class MethodOverloading {
    public static void main(String args[]) { 
        Calculator calc = new Calculator();  // main function ke ander calculator ka object banatae hai 
        System.out.println(calc.sum(1,2));                        // ab sabsae pahale call lagaegae gae calc.sum ko
        System.out.println(calc.sum((float)1.5, (float)2.5));// java bydefault java 1.5 ko double lea rha hai so typcasting float mai
        System.out.println(calc.sum(1,2, 3));

        // output is 3
        // 4.0
        // 6
    }
    
}
class Calculator {
    //return karega sum ko
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
   
}
