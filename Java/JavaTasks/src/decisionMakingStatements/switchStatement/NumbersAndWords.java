package decisionMakingStatements.switchStatement;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** The user types a number from 1 to 5.
 *  The program converts numbers into words, or reports that the user has entered an invalid number.
 */
public class NumbersAndWords {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int a = 0;
        String string = null;
        Pattern pattern = Pattern.compile("[1-5]{1}");
        Matcher matcher = null;

        do {
            System.out.print("Type a number: ");
            string = sc.nextLine();
            matcher = pattern.matcher(string);
            if (!matcher.matches()) System.out.println("Sorry! Invalid value has been entered");
        }while (!matcher.matches());

        sc.close();
        a = Integer.parseInt(string);

        switch (a){
            case 1:
                System.out.println("\nOne");
                break;
            case 2:
                System.out.println("\nTwo");
                break;
            case 3:
                System.out.println("\nThree");
                break;
            case 4:
                System.out.println("\nFour");
                break;
            case 5:
                System.out.println("\nFive");
                break;
            /*
            default:
                System.out.println("\nWrong number");
                break;
                */
        }
    }
}
