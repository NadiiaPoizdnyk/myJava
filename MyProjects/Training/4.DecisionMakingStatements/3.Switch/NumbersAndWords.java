import java.util.Scanner;

/** The user types a number from 1 to 5.
 *  The program converts numbers into words, or reports that the user has entered an invalid number.
 */
public class NumbersAndWords {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        int a = sc.nextInt();
        sc.close();

        switch (a){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}
