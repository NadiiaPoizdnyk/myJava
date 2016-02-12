package consoleInput;

import java.util.Scanner;

/** The program displays the sum (sub, div, mult)of the numbers entered by the user.
 * e.g., Sum: 18
 */
public class SystemInScanner {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type an integer:");
        int a = sc.nextInt();

        System.out.println("Type an integer:");
        int b = sc.nextInt();
        sc.close();

        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Division: " + (a/b));
        System.out.println("Multiplication: " + (a*b));

    }
}
