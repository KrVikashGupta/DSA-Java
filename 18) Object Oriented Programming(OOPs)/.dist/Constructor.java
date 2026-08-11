/*public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();  // ye student parenthesis hai ek naya student object bana rahae hai with the help of  class mai Student() help sae
        //System.out.println(s1.name);                             // lekin humlog issae pahalae wala mai to to  Pen class mai  kia nahia thai then  in java  mai defult constructo bana de raha hai automatically constructors bana degi lekin koi instialisezation nahi ho sakta agar humko initlize karna hai to constructors khud banaa hogo jaisae Student(String name)  
        //This line is correct. It creates a new object of the Student class using the default constructor Student(). This line initializes the s1 variable with a new Student object.
    }
    
}

class Student {
    //pro
    String name;
    int roll;

    //Student ko initilise krnae kai lia ek constructor banaaegae  ( hum ek function banaaegae but yaha pae return type nahi dengae usko karegae create )
    //Student(String name) {
    Student() {
        System.out.println("Constructors is called...");  //It defines a constructor for the Student class, and when a Student object is created using new Student(), this constructor is called. It prints "Constructors is called..." when the constructor is invoked.

    }
}*/

/* 
public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();

    }
}
class Student {
    String name;
    int roll;

    Student() { //constructor
        System.out.println("Constructor is called....");
    }
}
*/

/*Types of Constructors:
1) Non-Parametrized
2) Parameterized
3) Copy Constructor.*/

/*public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Vkg") // s2 kai lia naam pata hai
        Student s3 = new Student("123");
        

    }
}
class Student {
    String name;
    int roll;
     
    //ek class mai many constructor bana sakata hai 
    Student() { // Non-Parameterized constructor
        System.out.println("Constructor is called....");
    }
    Student(String name) { // Parameterized constructor
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }
}*/
 // copy Constructor  
/*public class Constructor { 
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Viraj";
        s1.roll = 23;
        s1.password = "qwerty";

        Student s2 = new Student(s1);
        s2.password = "op"; // we want to change the password

    }

}
class Student {
    String name;
    int roll;
    String password;

     
    //Copy Constructors
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student() {
        System.out.println("Constructor is called......");
    }
    Student(String name) {
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }  
}
*/
//change kartae  hai student kae sath marks v thai
public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Viraj";
        s1.roll = 123;
        s1.password = "qwerty";
        s1.marks[0] = 100;  // update kar rahai hai
        s1.marks[1] = 90; 
        s1.marks[2] = 80;
        /*output is 
         * 100
           90
           80
         */

        Student s2 = new Student(s1); // s1 ki saari properties s2 mai copy ho jae uskai lia function / const. banaagae 
        s1.password = "op"; // sara copy hota hai but  i want to change/update  my password aor marks
        s1.marks[2] = 100; 
        /* output is 
        100
        90
        100*/

        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }

 
        
    }
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];
     
// copy Constructor  or shallow copy Constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }    

    //deep copy Constructor
    Student(Student s1) {
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++) { //  marks ko copy karnae kai lia ek loop chalaengae)
            this.marks[i] = s1.marks[i];
         } // output is  marks change nahi hua 
          //    100
          //    90
         //     80

    }


    Student() {
        marks = new int[3];
        System.out.println("Constructors is callled......");
    }
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }
    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
        
    }
}




