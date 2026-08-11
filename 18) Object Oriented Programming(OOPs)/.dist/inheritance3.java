// import java.util.*;
// Heirarchial Level Inheritance
public class inheritance3 {
    public static void main(String args[]) { // main class mai ek fish ka object banaegae
        Fish m1 = new Fish();
        m1.swim();;
        Bird m2 = new Bird();
        m2.fly();
         
        // output is swim
        // fly
        
    }
}

//base class
class Animal {
    String color;   // properties

    void eat() {             // function hai
        System.out.println("eats");
    }
    //aur function hai 
    void breathe() {
        System.out.println("breathes");
    }

}
// derived class or subclass(pata kesae chalega ka ki animal ka sara properties lena hai) uskai lia ek extends keyword extends means gichna by default sara properties aa jahaega + aur additional add krna hai to  kar saktai hai

class Mammal extends Animal {
    void walk() { // walk function
        System.out.println("walks");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}
