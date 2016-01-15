import java.util.Scanner;

/** The program determines the greater of 2 numbers entered by the user,
 *  or reports that the numbers are equal.
 */
public class GreaterNumber {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number:");
        int a = sc.nextInt();
        System.out.println("Type a number:");
        int b = sc.nextInt();
        sc.close();

        if (a!=b) {
            if (a > b) {
                System.out.println(a + " is greater than " + b);
            } else {
                System.out.println(b + " is greater than " + a);
            }
        } else {
            System.out.println("The numbers are equal.");
        }
    }
}
