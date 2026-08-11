import java.util.*;
public class basic_String {
    public static void main(String args[]) {
        // char arr[] = {'a','a','c','d'};
        // String str = "abcd";  // Inbuilt class(String) with capital S 
        // String  str2 = new String("xyz"); // we can also create  using new Keyword  

        //Strings are IMMUTABLE
        
        
        //Next is take input/output in String
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next(); // next means take only take words 
        // //name = sc.nextLine(); //nextLine means take a whole sentence 
        // System.out.println(name);


        Scanner sc = new Scanner(System.in);
        String name;
        //name = sc.next();  // next means take only one word
        name = sc.nextLine();  // nextLine means take whole sentence 
        System.out.println(name);
        sc.close();
    }
    
}
