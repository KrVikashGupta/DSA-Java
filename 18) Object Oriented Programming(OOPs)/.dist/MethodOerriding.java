//import java.util.*;

public class MethodOerriding {
    public static void main(String args[]) {
        Deer d = new Deer(); // overriding main jab hum child function ka call karegae to child function wala he cll karega
        d.eat();  // 
    }
    // output is  eats grass
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }

}
