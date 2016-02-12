package classMath;

import java.util.Scanner;

public class ABS {
    public static void main(String[]args){
        //The MATH library, the method abs

        Scanner sc = new Scanner(System.in);
        int a, c;
        System.out.println("Type a number:");
        a = sc.nextInt();
        c = -a;
        sc.close();

        System.out.println("The number is " + a + ", the opposite number is " + c);
        System.out.println("The absolute value of the number is " + Math.abs(a) +
        ", the absolute value of the opposite number is " + Math.abs(c));

    }
}
