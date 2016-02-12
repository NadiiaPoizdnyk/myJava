package decisionMakingStatements.elseIfStatement;

import java.util.Scanner;

/** Type a number.
 * The program determines if the number is greater than, less than or equal to 0.
 */
public class NumbersDiff {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        int a = sc.nextInt();
        sc.close();

        if (a<0){
            System.out.println(a + " < 0");
        }
        else if (a>0){
            System.out.println(a + " > 0");
        }
        else if (a == 0){
            System.out.println(a + " = 0");
        }
    }
}
