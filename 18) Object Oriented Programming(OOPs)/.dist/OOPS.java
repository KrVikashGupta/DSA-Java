//Single file kai andhar multiple class bana saktae hai
// object banaae kai lia  main method mai likna hoga 
//crated a pen object called p1(sabsae pahle class ka naam aur p1 namm de detae hai
//new keyword sae hum memory kai andhar jagah bana rahai hai jaha pen ki sarri properties store hogi then class ka naam Pen()isko hum constructor khatai hai )

/* 
public class OOPS {
    public static void main(String args[]) { 
        Pen p1 = new Pen();
        p1.setColor("Blue");  //
        System.out.println(p1.color); // kisi object ki properties ya kisi object ki function ko acces karna hota hai to . operator ka use kartae hai
        p1.setTip(10);
        System.out.println(p1.tip); // output is Blue 10
        //p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color); //we can change the color also
        
    }

}
 // class is keyword phir class ka naam  hamesa capital sae likhna hai but not necessary(class ka naam start with  capital but function start with small )
// {} kai andhar prop + func. define karegae
// func ka sabsae pahale  return type likhnagae  aur funct. kae andar koi v naycolor ayga as aa argument aur color ko set karegae newcolor
class Pen { // this is pen class  
    String color;
    int tip;
    
    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {  //this is student class
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3; 
    }
}
*/

// public class OOPS {
//     public static void main(String[] args) {
//         Pen p1 = new Pen();
//         p1.setColor("Blue");
//         System.out.println(p1.getColor()); // ✅ use getter
//     }
// }

// class Pen {
//     private String color;  // encapsulated
//     private int tip;

//     // Setter for color
//     void setColor(String newColor) {
//         color = newColor;
//     }

//     // Getter for color
//     String getColor() {
//         return color;
//     }

//     // Setter for tip
//     void setTip(int newTip) {
//         tip = newTip;
//     }

//     // Getter for tip
//     int getTip() {
//         return tip;
//     }
// }




public class OOPS {
    public static void main (String args[]) {
        //object bannae kae lia 1.class ka naam(Pen) then 2.pen ka nname(p1) 3.new key(jaha pae pen  store hoaga) then 4class ka nam with ()(constructor v boltae hai)
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Blue");//kisi object/properties ko access krtae hai to.opertor ka use krte hai 
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

    }
}
class Pen {
    //pro+fun
    String color;
    int tip;
    
    // fun
    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age ;
    float percentage;
    //fun
    void calPercentage(int phy, int che, int math) {
        percentage = (phy+che+math) / 3;
    }
}

