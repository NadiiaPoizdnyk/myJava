import java.util.Scanner;

/** A student passed the exam. Enter student's assessment on 10 points system.
 *  The program will give its own assessment of the student's work.
 */
public class ExamAssessment {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = sc.nextInt();
        sc.close();

        switch (a){
            case 1:
            case 2:
                System.out.println("Grade: " + a + "-very bad");
                break;
            case 3:
            case 4:
                System.out.println("Grade: " + a + "-bad");
                break;
            case 5:
            case 6:
                System.out.println("Grade: " + a + "-satisfactorily");
                break;
            case 7:
            case 8:
                System.out.println("Grade: " + a + "-good");
                break;
            case 9:
            case 10:
                System.out.println("Grade: " + a + "-excellent");
                break;
            default:
                System.out.println("Wrong grade");
        }
    }
}
