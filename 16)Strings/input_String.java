import java.util.*;

public class input_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();  //my name is vikash kumar gupta.
                           //my
        //next means take only word
        //nextLine take sentence

        //name = sc.nextLine();  hello my name is vikash
                                 //hello my name is vikash

        System.out.println(name);
        sc.close();
    }
}