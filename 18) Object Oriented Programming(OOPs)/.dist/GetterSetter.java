
// getter: g return the value.
//setter: s set or update or modify the value.
/*public class Getter_Setter {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Pink");//  after that we can change the color
        System.out.println(p1.getColor());

    }
    
    
}
class Pen {      // ek naam ka variable hoga waha pae jada kaam hoga 
    private String color;
    private int tip;     // private bana lete hai taki hum isko access nahi kar pae 
    String getColor() {     // (getter function)
        return this.color; // this means current object jo v function call rahi hai uski properties ki baat kar rahi hai 
    }
    int getTip() {
        return this.tip;
    }


    void setColor(String newColor) { // (setter function)setter bana hua hai setter color change kar rahae thi
        this.color = newColor;
    }
    void setTip(int tip) {
        this.tip = tip;   // kisi v function mai object hai wo object ko refer karna or refernce dundhana chatae hai  cha r rahi hai
    }
}
*/
public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a Pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Pink"); // After that, we can change the color
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() { // Getter method for color
        return this.color;
    }

    int getTip() { // Getter method for tip
        return this.tip;
    }

    void setColor(String newColor) { // Setter method for color
        this.color = newColor;
    }

    void setTip(int tip) { // Setter method for tip
        this.tip = tip;
    }
}
