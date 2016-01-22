import java.util.Scanner;

/**
 * The program calculates cube roots of 2 numbers entered by the user.
 */
public class CubeRoot {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int a,c;
        System.out.println("Type a number");
        a = sc.nextInt();
        System.out.println("Type a number");
        c = sc.nextInt();
        sc.close();

        double b, d;
        b = Math.cbrt(a);
        d = Math.cbrt(c);

        System.out.println("The cube root of " + a + " is " + b);
        System.out.println("The cube root of " + c + " is " + d);
    }
}
