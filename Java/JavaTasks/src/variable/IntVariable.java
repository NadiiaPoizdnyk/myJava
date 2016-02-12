package variable;

/**
 * The program displays the inscription:
 * variable.Hello world
 * 5 times
 */
public class IntVariable {
    public static void main(String[]args){

        int a = 5;
        String b = "variable.Hello ";
        String c = "variable.Hello world";
        int d = 2;

        System.out.println("variable.Hello world");
        System.out.println(a + " times");
        System.out.println(b + "world");
        System.out.println(5 + " times");
        System.out.println(c);
        System.out.println((3+d) + " times");
    }
}
