import java.util.Scanner;

/** The user enters 3 words.
 * The program writes them into an array and prints 3 words.
 */
public class ThreeWords {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String stroka;
        String mas[] = new String[3];
        for (int i = 0; i < 3; i++){
            System.out.println("Type a word:");
            stroka = sc.nextLine();
            mas[i] = stroka;
        }
        sc.close();

        for (int i = 0; i < 3; i++){
            System.out.print(mas[i] + " ");
        }
    }
}
