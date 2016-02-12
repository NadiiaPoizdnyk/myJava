package consoleInput;

import java.util.Scanner;

/** The program displays the squared number entered by the user.
 * e.g., The squared number: 25
 */
public class SystemInScanner2 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number:");
        int a = sc.nextInt();
        sc.close();

        System.out.println("The squared number: " + (a*a));
    }
}
