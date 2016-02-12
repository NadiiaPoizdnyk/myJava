package loopsTasks.forLoops;

import java.util.Scanner;

/** The user enters a number from 1 to 999.
 * The program prints all the numbers between 0 and entered numbers, or throws an error message.
 */
public class PrintingNumbers {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number:");
        int a = sc.nextInt();
        sc.close();

        if (a > 999 || a < 1){
            System.out.print("Wrong");
        } else {
            for (int i = 1; i < a; i++){
                System.out.print(i + " ");
            }
        }
    }
}
