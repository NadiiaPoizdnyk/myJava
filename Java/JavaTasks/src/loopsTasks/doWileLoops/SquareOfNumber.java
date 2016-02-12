package loopsTasks.doWileLoops;

import java.util.Scanner;

/** The program considers the squares of numbers from 1 to the number entered by user.
 *  The number entered by the user should not go beyond range of 1 to 10.
 */
public class SquareOfNumber {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number:");
        int a = sc.nextInt();
        sc.close();

        if (a < 1 || a > 10){
            System.out.println("The wrong number is entered");
        } else {
            int i = 1;
            do {
                System.out.println("The square " + i + " is " + (i*i));
                i = i + 1;
            } while (i < (a + 1));
        }
    }
}
