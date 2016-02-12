package classMath;

import java.util.Scanner;

public class TriangleHypotenuse {
    public static void main(String[]args){
        //the MATH library, hypot

        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("Type a number:");
        a = sc.nextInt();
        System.out.println("Type a number:");
        b = sc.nextInt();
        sc.close();

        double g = Math.hypot(a, b);
        System.out.println("Legs of triangle are " + a + " and " + b + ".");
        System.out.println("The hypotenuse is " + g + ".");
    }
}
