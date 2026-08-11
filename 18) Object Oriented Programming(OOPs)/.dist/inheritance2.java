// import java.util.*;
// Multiple Level Inheritance
public class inheritance2 {
    public static void main(String args[]) { // main class mai ek fish ka object banaegae
        Dog dobby = new Dog();
        dobby.eat(); // eat function v print hago
        dobby.legs = 4;
        System.out.println(dobby.legs);
         
         //output is eats
        // 4
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
    int legs;
}
class Dog extends Mammal {
    String breed;
}




// class Fish extends Animal {
//     int fins; //  extra fproperties

//     void swim() {
//         System.out.println("swim in water");
//     }

// }



