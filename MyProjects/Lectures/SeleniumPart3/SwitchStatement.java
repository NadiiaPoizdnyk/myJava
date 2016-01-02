import java.util.Scanner;

/** Slide #19-20
 * switch ( выражение ) { case значение1:
 break;
case значение2:
 break;
case значение х:
 break;
default: }

 Task #5 Написать программу для определения, к какому времени года относится тот или иной месяц
 (искомый месяц инициализируется в самой программе числом).
 */
public class SwitchStatement {
    public static void main (String[]args){

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month in integer format:");
        int month = sc.nextInt();
         */

        int month = 15;

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("This is Winter.");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("This is Spring.");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("This is Summer.");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("This is Autumn.");
                break;

            default:
                System.out.println("This is not a month");
                break;
        }
    }
}
