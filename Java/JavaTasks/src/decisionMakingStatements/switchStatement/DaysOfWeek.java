package decisionMakingStatements.switchStatement;

/** The program shows a day of the week randomly.
 */
public class DaysOfWeek {
    public static void main(String[]args){

        int week = (int)(Math.random()*7);

        switch (week){
            case 0:
                System.out.println("Mon");
                break;
            case 1:
                System.out.println("Tue");
                break;
            case 2:
                System.out.println("Wed");
                break;
            case 3:
                System.out.println("Thu");
                break;
            case 4:
                System.out.println("Fri");
                break;
            case 5:
                System.out.println("Sat");
                break;
            case 6:
                System.out.println("Sun");
                break;
        }
    }
}
