package classMath;

/**
 * The program converts radian -> degrees and degrees -> radian.
 */
public class RadianDegreesBack {
    public static void main(String[]args){

        double a = 1;
        double b = 180;
        double c, d;

        c = Math.toDegrees(a);
        d = Math.toRadians(b);

        System.out.println(a + " radian = " + c + " degrees ");
        System.out.println(b + " degrees = " + d + " radians ");
    }
}
