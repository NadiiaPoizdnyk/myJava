/**
 * The program rounds numbers,
 *              rounds numbers up,
 *              rounds numbers down.
 */
public class Rounding {
    public static void main(String[]args){

        double a = 1.4;
        double b = 1.7;
        double c, d, e, f, g, h;

        c = Math.round(a);
        d = Math.round(b);
        System.out.println("Rounding of " + a + " is " + c);
        System.out.println("Rounding of " + b + " is " + d);

        e = Math.ceil(a);
        f = Math.ceil(b);
        System.out.println("Rounding up of " + a + " is " + e);
        System.out.println("Rounding up of " + b + " is " + f);

        g = Math.floor(a);
        h = Math.floor(b);
        System.out.println("Rounding down of " + a + " is " + g);
        System.out.println("Rounding down of " + b + " is " + h);
    }
}
