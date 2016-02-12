package loopsTasks.doWileLoops;

import java.util.Scanner;

/** The program thinks of a number from 1 to 10.
 * The user tries to guess the number. The user retries until guesses.
 */
public class GuessNumberGame {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int a;
        int result = (int)(Math.random()*10+1);

        do {
            System.out.println("Guess the number:");
            a = sc.nextInt();
        } while (result != a);
        System.out.println("Answer: " + a);
        sc.close();
    }
}
