/*Java Variables(V are containers for storing data value)
In Java, Variables are the data containers that save the data values during Java program execution. 
Every Variable in Java is assigned a data type that designates the type and quantity of value it can hold.
A variable is a memory location name for the data.
----------------
How to Declare Variables in Java?
datatype: Type of data that can be stored in this variable. 
data_name: Name was given to the variable. 
---------------
How to Initialize Variables in Java?
It can be perceived with the help of 3 components that are as follows:
datatype: Type of data that can be stored in this variable.
variable_name: Name given to the variable.
value: It is the initial value stored in the variable.
Ex-: 
int age = 20;



 */
// public class variable {
//     public static void main(String args[]) {
//         int a = 10;
//         int b = 5;
//         String name = "Tony Stark";
//         System.out.println(a); //we have to write a not in "a" because when we wrote "a" out put is a
//         System.out.println(b);
//         System.out.println(name);


//         a = 50; // If we want to change a variable we can write again 
//         System.out.println(a);
//     }
// }


// public class variable {
//     public static void main(String args[]) {
//         int a = 10;
//         int b = 5;
//         System.out.println(a);
//         System.out.println(b);
//         String name = "Tony Stark";
//         System.out.println(name);

//         a= 50;
//         System.out.println(a);
//     }
    
// }

public class variables {
    public static void main(String args[]) {
        int a = 10;
        int b = 40; 
        System.out.println(a);
        System.out.println(b);
        String name = "vikash Stark";
        System.out.println(name);

        a = b;
        System.out.println(a);
    }
}