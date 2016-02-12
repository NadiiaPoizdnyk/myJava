package decisionMakingStatements.ternary;

import java.util.Scanner;

/** The program displays the smallest number of two numbers entered by the user.
 */
public class SmallestNumber {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number:");
        int a = sc.nextInt();
        System.out.println("Type a number:");
        int b = sc.nextInt();
        sc.close();

        int k = a < b ? a : b;
        System.out.println("Smallest number: " + k);
    }
}
