package decisionMakingStatements.ifStatement;

import java.util.Scanner;

/** Type 2 numbers a and b.
 *  The program determines the smallest of them,
 *  or reports that the numbers are equal.
 */
public class NumbersDiff {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        int a = sc.nextInt();
        System.out.println("Type a number");
        int b = sc.nextInt();
        sc.close();

        int min;

        if (a<b){
            min = a;
            System.out.println("classMath.Min = " + min);
        }

        if (a>b){
            min = b;
            System.out.println("classMath.Min = " + min);
        }

        if (a == b){
            System.out.println("a equals b");
        }
    }
}
