import java.util.Scanner;

/** The program thinks of a number from 1 to 10.
 * The user tries to guess the number. The user retries until guesses.
 */
public class GuessNumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int result = (int) (Math.random() * 10 + 1);

        for (int i = 0; i < 3; i++) {
            System.out.println("Guess the number:");
            a = sc.nextInt();
            if (a == result) {
                System.out.println("Right");
                break;
            } else {
                if (result < a) {
                    System.out.println("Wrong. The number is < " + a);
                } else {
                    System.out.println("Wrong. The number is > " + a);
                }
            }
        }
        System.out.println("Answer: " + result);
        sc.close();
    }
}