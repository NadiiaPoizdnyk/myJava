package consoleInput;

import java.util.Scanner;

/** The program displays the number entered by the user.
 * e.g., Your number is 4
 */
public class SystemInScanner4 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number:");
        int a = sc.nextInt();
        sc.close();

        System.out.println("Your number is " + a);
    }
}
