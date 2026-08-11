//import java.util.*;
/* 
public class Abstractclass {
    public static void main(String args[]) { // ab banagae object
        Horse h = new Horse(); // horse kae lia eat v call kar sakata hai aur walk v call v kar sakatae hai
        h.eat();
        h.walk();

        // similar tarh sai checken creagte kar saktae hai
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        //Animal a = new Animal();//error de raha hai Animal nam ka ka koi object create nahi kar saktae hai(abstract class ka oject banaegae to error aa jaega)
    }
    // output is animal eats
    // walks on 4 legs
    // animal eats
    // walk in 2 legs
    
}

abstract class Animal {  // start with abstract keyword
    //is class kae ander kuch function bana hai ( abstract ya non abstract  v ho sakta hai) atart kartae hai nonabstract kae sath
    void eat() {//eat naam ka ek non abstract method banaya hai
        System.out.println("animal eats");
    }
    abstract void walk();
    // Abstract method
    // ye abstract hai kesae pata ? ismai hum implementation nahi likha(abstract method wo hota hai jiskai ander implementtion nahi hota hai)
    //abstract class wo class hota jo jiskae ander object nahi bana saktae
    //jaisae upar mai eat phi curly bracket phir uska under kuch implementation likha tha but in ( abstract  mai koi implementation he nahi hai ) 
    
    //Abstraction ka concept kesae aya? jo walk naam ka function hai(upar mai) walk ki jo process / implementation hai horse hai to horse pae depend karega kesa walk karega  chicken hai to chi... pae depnd karega Animal pae depend nahi karega  animal sirf eek idea deta hai means 
    //idea it means  walk naam ka function apkae hareaek animal kai ander exit krna chaiya jiska type kya hai return type void hona chaiya  aur walk koi parameter nahi leta hai
    //jo idea abstract class nae dia hai wo is=dea horse nae implemnt kia hai / aur chicken v kia hai


}
class Horse extends Animal { //animal ki sarri propertis horse mai aaa gayi but horse mai error kyoki walk horse kai lia jaruri ho gay hai to isko implement jurur karna hai
    void walk() {// ab walk kae lia implement likhngae 
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {// ismai v by definition walk ko implement karna padega
    void walk() {
        System.out.println("walk in 2 legs");
    }

}
*/
/*third properties can have constructors */

public class Abstractclass {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
    }
}

abstract class Animal {
    String color;
    Animal() { /* constructor ka kaam sirf initilize krna nahi hota  but apna child clasas kai lia object kuch variable  ko initialise krana v ho sakta hai  */
        color = "brown"; /* third properties constructor have */
    }
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");

    }
}
/* output this code 
animal eats
walks on 4 legs
brown */

