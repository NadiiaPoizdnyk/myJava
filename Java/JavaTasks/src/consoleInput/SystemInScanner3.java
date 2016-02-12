package consoleInput;

import java.util.Scanner;

/** The program displays the opposite of the numbers entered by the user.
 * e.g., Opposite number: -18
 */
public class SystemInScanner3 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number:");
        int a = -sc.nextInt();                 //!!! -sc.nextInt()
        sc.close();

        System.out.println("Opposite number: " + a);
    }
}
