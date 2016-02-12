package classMath;

/**
 * The program calculates trigonometric functions of number a, given in radian.
 *
 * the MATH library, trigonometry
 */
public class Trigonometry {
    public static void main(String[]args){

        double a = 0.5; //radian
        double b, c, d, e, f, g;

        b = Math.sin(a);
        c = Math.cos(a);
        d = Math.tan(a);
        e = Math.asin(a);
        f = Math.acos(a);
        g = Math.atan(a);

        System.out.println("sin" + a + " = " + b);
        System.out.println("cos" + a + " = " + c);
        System.out.println("tan" + a + " = " + d);
        System.out.println("asin" + a + " = " + e);
        System.out.println("acos" + a + " = " + f);
        System.out.println("atan" + a + " = " + g);
    }
}
