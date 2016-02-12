package classMath;

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
        System.out.println("classMath.Rounding of " + a + " is " + c);
        System.out.println("classMath.Rounding of " + b + " is " + d);

        e = Math.ceil(a);
        f = Math.ceil(b);
        System.out.println("classMath.Rounding up of " + a + " is " + e);
        System.out.println("classMath.Rounding up of " + b + " is " + f);

        g = Math.floor(a);
        h = Math.floor(b);
        System.out.println("classMath.Rounding down of " + a + " is " + g);
        System.out.println("classMath.Rounding down of " + b + " is " + h);
    }
}
