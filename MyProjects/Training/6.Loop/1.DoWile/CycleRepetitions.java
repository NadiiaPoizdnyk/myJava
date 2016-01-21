import java.util.Scanner;

/** The program counts the repetitions of the cycle from 0 to the number entered by the user.
 */
public class CycleRepetitions {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = sc.nextInt();
        sc.close();

        int i = 0;
        do {
            System.out.println("Repetition: " + i);
            i = i + 1;
        } while (i < (a + 1));
    }
}
