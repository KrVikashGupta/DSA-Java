//Quetion3:What is be the output of the following programs.
public class solution3 {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " +y + " " + z); // output is 4,0,0
    }
}
