package decisionMakingStatements.ternary;

import java.util.Scanner;

/** The program output the absolute value of the number entered by the user.
 */
public class AbsoluteValue {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        sc.close();

        int k = a<0 ? -a : a;
        System.out.println("The absolute value of " + a + " is " + k);
    }
}
