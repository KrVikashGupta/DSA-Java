// import java.util.*;
// also Single Level Inheritance
public class inheritance {
    public static void main(String args[]) { // main class mai ek fish ka object banaegae
        Fish shark = new Fish();
        shark.eat();  // output is eats

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

class Fish extends Animal {
    int fins; //  extra fproperties

    void swim() {
        System.out.println("swim in water");
    }

}


