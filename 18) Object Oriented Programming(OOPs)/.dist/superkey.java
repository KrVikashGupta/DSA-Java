public class superkey {

    public static void main(String args[]) {
        Horse h = new Horse();
        System.out.println(h.color);
      

    }
}

class Animal {
    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        
        //super(); //  agar hum super kae agae parenthesis laga detae hai to animal constructor ko call kar rahae hai
        super.color = "brown";
        System.out.println("horse constructors is called");
    }
}