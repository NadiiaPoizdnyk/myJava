package variable;

/**
 * The program displays the inscription:
 * variable.Hello world
 * 5 times
 */
public class StringVariable2 {
    public static void main(String[]args) {

        String a, b, c, d;
        a = "variable.Hello ";
        b = "world";
        c = "5 ";
        d = "times";

        System.out.println(a + b);
        System.out.println(c + d);
        System.out.println(a + "world");
        System.out.println(c + "times");

    }
}
