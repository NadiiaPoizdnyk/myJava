/**
 * The program converts all types of variables into String variables.
 */
public class ConvertValueOf {
    public static void main(String[]args){

        int a = 4;
        double b = 1.45;
        long c = 1000000000;
        char d = 'f';
        boolean e = true;

        String f1 = String.valueOf(a);    // methods of the String class, valueOf
        String f2 = String.valueOf(b);
        String f3 = String.valueOf(c);
        String f4 = String .valueOf(d);
        String f5 = String .valueOf(e);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
    }
}
