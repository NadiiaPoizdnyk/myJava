package decisionMakingStatements.switchStatement;

/** The program shows a season of the year randomly.
 */
public class Seasons {
    public static void main(String[]args){

        int season = (int)(Math.random()*4);

        switch (season){
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            default:
                System.out.println("Fall");
        }
    }
}
